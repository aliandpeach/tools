package com.spinfosec.performance;

import cn.hutool.core.io.FileUtil;
import com.google.common.util.concurrent.RateLimiter;
import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.connector.sftp.FtpRequest;
import com.spinfosec.core.FileInfo;
import com.spinfosec.core.PropertyLoader;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.spinfosec.core.SpinfoInfo;
import com.spinfosec.exception.BaseResponse;
import com.spinfosec.mq.MessageCenter;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 设置 server.servlet.encoding.force=true 则默认的 CharacterEncodingFilter 请求和响应会以UTF-8字符集
 * log4j2 不设置输出日志格式的情况下, 默认获取系统的字符集 Charset.defaultCharset(),要强制其输出需要配置 - PatternLayout charset="UTF-8"
 *
 * System.getProperty("sun.stdout.encoding")) windows: ms936; idea: null; linux: null
 * System.getProperty("file.encoding")        windows: GBK; idea: UTF-8; linux: UTF-8
 * Charset.defaultCharset()                   windows: GBK; idea: UTF-8; linux: UTF-8
 */
@RestController
@RequestMapping("/performance/batch")
public class SdkBatchController implements InitializingBean
{
    private static final Logger http = LoggerFactory.getLogger("http");
    private static final Logger sftp = LoggerFactory.getLogger("sftp");
    private static final Logger sdk = LoggerFactory.getLogger("sdk");
    private static final Logger http_response = LoggerFactory.getLogger("http_response");
    private static final Logger sftp_response = LoggerFactory.getLogger("sftp_response");

    private static final long KB = 1024;

    private static final long MB = 1024 * 1024;

    private static final long GB = 1024 * 1024 * 1024;

    private static Random random = new Random();

    @Override
    public void afterPropertiesSet() throws Exception
    {
        try
        {
            String limit = System.getProperty("limit");
            sdk.info("limit=" + limit);
            SpinfoInfo info = PropertyLoader.loadProperties();
            SpinfoExecutor.create().init(info);
        }
        catch (Throwable e)
        {
            http.error("init error", e);
        }
    }

    @GetMapping("/concurrent")
    public ModelAndView concurrentPage(HttpServletRequest request, OrderInfo orderInfo)
    {
        Function<File, Long> func = File::length;

        String target = "";
        List<UploaderInfo> result = new ArrayList<>();
        if (new File(target).exists())
        {
            List<UploaderInfo> sortedFileInfoList = FileUtil.loopFiles(new File(target)).stream()
                    .sorted(Comparator.comparing(func).reversed())
                    .map(f -> new UploaderInfo(f.getName(), f.getPath().replace("\\", "/"), setSize(f.length())))
                    .collect(Collectors.toList());

            List<File> dirs = new ArrayList<>(loopDirs(new File(target)));
            Function<File, String> func2 = File::getPath;
            List<UploaderInfo> dirInfoList = dirs.stream()
                    .sorted(Comparator.comparing(func2).reversed())
                    .map(f -> new UploaderInfo(f.getName(), f.getPath().replace("\\", "/"), f.isFile() ? setSize(f.length()) : "文件夹"))
                    .collect(Collectors.toList());
            result.addAll(sortedFileInfoList);
            result.addAll(dirInfoList);
        }
        return new ModelAndView("concurrent")
                .addObject("host", SpinfoExecutor.create().getSpinfo().getDbsServerHost())
                .addObject("fileList", result)
                .addObject("path", "");
    }

    @GetMapping("/file/reload")
    public List<UploaderInfo> reload(@RequestParam("path") String path)
    {
        List<UploaderInfo> result = new ArrayList<>();
        if (null != path && new File(path).exists())
        {
            Function<File, Long> func = t -> t.isFile() ? t.length() : 0;

            List<File> files = FileUtil.loopFiles(new File(path));
            List<UploaderInfo> sortedFileInfoList = files.stream()
                    .sorted(Comparator.comparing(func).reversed())
                    .map(f -> new UploaderInfo(f.getName(), f.getPath().replace("\\", "/"), setSize(f.length())))
                    .collect(Collectors.toList());

            Function<File, String> func2 = File::getPath;

            List<File> dirs = new ArrayList<>(loopDirs(new File(path)));
            List<UploaderInfo> dirInfoList = dirs.stream()
                    .sorted(Comparator.comparing(func2).reversed())
                    .map(f -> new UploaderInfo(f.getName(), f.getPath().replace("\\", "/"), f.isFile() ? setSize(f.length()) : "文件夹"))
                    .collect(Collectors.toList());

            result.addAll(sortedFileInfoList);
            result.addAll(dirInfoList);
        }
        return result;
    }

    @PostMapping("/upload")
    public BaseResponse<EventResult> upload(@RequestBody @Validated(UploaderInfo.SdkBatchGroup.class) UploaderInfo uploaderInfo) throws IOException
    {
        AtomicInteger counter = new AtomicInteger(0);
        double _semaphore = uploaderInfo.getTime() / uploaderInfo.getTotal() < 1 ? 1 : uploaderInfo.getTime() / uploaderInfo.getTotal();
        RateLimiter limiter = RateLimiter.create(_semaphore);

        int _total = uploaderInfo.getTotal();
        String path = uploaderInfo.getPath();
        File file = new File(path);
        if (!file.exists())
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件或者文件夹不存在, path=" + path));
        }
        List<File> targetFileList = FileUtil.loopFiles(file);
        if (targetFileList.size() == 0)
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件数为0, path=" + path));
        }
        http.debug("{} 文件总数 = {}", path, _total);
        long start = System.currentTimeMillis();

        http.debug("总请求数量= {}", _total);
        http.debug("每秒请求次数= {}", _semaphore);

        List<CompletableFuture<Response>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(_total);

        List<Group> all = new CopyOnWriteArrayList<>();

        BlockingQueue<Long> ttimes = new LinkedBlockingQueue<>();
        IntStream.range(0, _total).forEach(_i ->
        {
            int _index = _i >= targetFileList.size() ? _i % targetFileList.size() : _i;
            System.out.println("index - " + _index);
            CompletableFuture<Response> future = CompletableFuture.supplyAsync(() ->
            {
                String id = null;
                try
                {
                    limiter.acquire(1);
                    long reqStart = System.currentTimeMillis();
                    File data = targetFileList.get(_index);

                    FileInfo fileInfo = new FileInfo(data.getName(), data.getPath());
                    Response result = SpinfoExecutor.create().upload(HttpRequest.uploader()
                            .file(fileInfo).build());

                    long reqEnd = System.currentTimeMillis();
                    Group group = new Group();
                    group.setUseTime((reqEnd - reqStart));
                    group.setStart(reqStart);
                    group.setEnd(reqEnd);
                    group.setName("request-" + result.getId() + "-" + counter.incrementAndGet());
                    all.add(group);
                    if (result.getStatus() == 200)
                    {
                        http_response.info("任务ID : " + result.getEventResult().get("taskId"));
                        http_response.info("任务结果状态 : " + result.getEventResult().get("status"));
                        http_response.info("任务失败文件列表 : " + result.getEventResult().get("failedFiles"));
                        http_response.info("任务事件信息 : " + result.getEventResult().get("breachContent"));
                    }
                    return result;
                }
                catch (Exception e)
                {
                    return new Response().id(e.getMessage() + "-" + counter.incrementAndGet()).status(405);
                }
            }, service);
            futures.add(future);
        });

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<Response> result = new ArrayList<>();
        futures.forEach(f ->
        {
            try
            {
                result.add(f.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        http.debug("总数" + _total + " 个请求, 每秒请求" + _semaphore + "个, 完成时间  = {}", end - start);

        if (all.size() > 0)
        {
            http.debug("结果统计========================");
            long startMin = all.stream().mapToLong(Group::getStart).min().getAsLong();
            long startMax = all.stream().mapToLong(Group::getStart).max().getAsLong();
            http.debug((startMax - startMin) + " 毫秒内请求" + _total + " 个, 完成请求的平均时间为" + all.stream().mapToLong(Group::getUseTime).average().getAsDouble());
            http.debug("最大请求返回时长为： " + all.stream().mapToLong(Group::getUseTime).max().getAsLong());
            http.debug("最小请求返回时长为： " + all.stream().mapToLong(Group::getUseTime).min().getAsLong());
            http.debug("结果统计========================");
        }

        long success = result.stream().filter(r -> r.getStatus() == 200).count();
        long failed = result.stream().filter(r -> r.getStatus() != 200).count();
        result.stream().filter(r -> r.getStatus() != 200).forEach(rr -> http.debug("failed : " + rr.toString()));
        http.debug("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个" + "\n");
        return BaseResponse.<EventResult>ok(new EventResult().ofMsg("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个").ofUseTime(end - start));
    }

    @PostMapping("/upload/async")
    public BaseResponse<EventResult> uploadAsync(@RequestBody @Validated(UploaderInfo.SdkBatchGroup.class) UploaderInfo uploaderInfo) throws IOException
    {
        AtomicInteger counter = new AtomicInteger(0);
        double _semaphore = uploaderInfo.getTime() / uploaderInfo.getTotal() < 1 ? 1 : uploaderInfo.getTime() / uploaderInfo.getTotal();
        RateLimiter limiter = RateLimiter.create(_semaphore);

        int _total = uploaderInfo.getTotal();
        String path = uploaderInfo.getPath();
        File file = new File(path);
        if (!file.exists())
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件或者文件夹不存在, path=" + path));
        }
        List<File> targetFileList = FileUtil.loopFiles(file);
        if (targetFileList.size() == 0)
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件数为0, path=" + path));
        }
        http.debug("{} 文件总数 = {}", path, _total);
        long start = System.currentTimeMillis();

        http.debug("总请求数量= {}", _total);
        http.debug("每秒请求次数= {}", _semaphore);

        List<CompletableFuture<Response>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(_total);

        BlockingQueue<Long> ttimes = new LinkedBlockingQueue<>();
        IntStream.range(0, _total).forEach(_i ->
        {
            int _index = _i >= targetFileList.size() ? _i % targetFileList.size() : _i;
            System.out.println("index - " + _index);
            CompletableFuture<Response> future = CompletableFuture.supplyAsync(() ->
            {
                String id = null;
                try
                {
                    limiter.acquire(1);
                    long reqStart = System.currentTimeMillis();
                    File data = targetFileList.get(_index);

                    FileInfo fileInfo = new FileInfo(data.getName(), data.getPath());
                    HttpRequest request = HttpRequest.uploader().file(fileInfo).async().manager(new Callback()).build();
                    Response result = SpinfoExecutor.create().upload(request);
                    return result;
                }
                catch (Exception e)
                {
                    return new Response().id(e.getMessage() + "-" + counter.incrementAndGet()).status(405);
                }
            }, service);
            futures.add(future);
        });

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<Response> result = new ArrayList<>();
        futures.forEach(f ->
        {
            try
            {
                result.add(f.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        http.debug("总数" + _total + " 个请求, 每秒请求" + _semaphore + "个, 完成时间  = {}", end - start);
        long success = result.stream().filter(r -> r.getStatus() == 200).count();
        long failed = result.stream().filter(r -> r.getStatus() != 200).count();
        result.stream().filter(r -> r.getStatus() != 200).forEach(rr -> http.debug("failed : " + rr.toString()));
        http.debug("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个" + "\n");
        return BaseResponse.<EventResult>ok(new EventResult().ofMsg("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个").ofUseTime(end - start));
    }

    @PostMapping("/upload/big")
    public BaseResponse<EventResult> uploadBigFile(@RequestBody @Validated(UploaderInfo.SdkBatchGroup.class) UploaderInfo uploaderInfo)
    {
        AtomicInteger counter = new AtomicInteger(0);

        double _semaphore = uploaderInfo.getTime() / uploaderInfo.getTotal() < 1 ? 1 : uploaderInfo.getTime() / uploaderInfo.getTotal();
        RateLimiter limiter = RateLimiter.create(_semaphore);

        int _total = uploaderInfo.getTotal();
        String path = uploaderInfo.getPath();
        File file = new File(path);
        if (!file.exists())
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件或者文件夹不存在, path=" + path));
        }
        List<File> targetFileList = FileUtil.loopFiles(file);
        if (targetFileList.size() == 0)
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件数为0, path=" + path));
        }
        sftp.debug("{} 文件总数 = {}", path, _total);
        long start = System.currentTimeMillis();

        sftp.debug("总请求数量= {}", _total);
        sftp.debug("每秒请求次数= {}", _semaphore);

        List<CompletableFuture<Response>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(_total);

        List<Group> all = new CopyOnWriteArrayList<>();

        BlockingQueue<Long> ttimes = new LinkedBlockingQueue<>();
        IntStream.range(0, _total).forEach(_i ->
        {
            int _index = _i >= targetFileList.size() ? _i % targetFileList.size() : _i;
            System.out.println("sftp index - " + _index);
            CompletableFuture<Response> future = CompletableFuture.supplyAsync(() ->
            {
                String id = null;
                try
                {
                    limiter.acquire(1);
                    long reqStart = System.currentTimeMillis();
                    File data = targetFileList.get(_index);

                    FtpRequest request = FtpRequest.upload()
                            .file(new FileInfo(data.getName(), data.getPath()))
                            .thenAnalyze()
                            .build();
                    Response ftp = SpinfoExecutor.create().uploadBigFile(request);

                    long reqEnd = System.currentTimeMillis();
                    Group group = new Group();
                    group.setUseTime((reqEnd - reqStart));
                    group.setStart(reqStart);
                    group.setEnd(reqEnd);
                    group.setName("request-" + ftp.getId() + "-" + counter.incrementAndGet());
                    all.add(group);
                    if (ftp.getStatus() == 200)
                    {
                        sftp_response.info("任务ID : " + ftp.getEventResult().get("taskId"));
                        sftp_response.info("任务结果状态 : " + ftp.getEventResult().get("status"));
                        sftp_response.info("任务失败文件列表 : " + ftp.getEventResult().get("failedFiles"));
                        sftp_response.info("任务事件信息 : " + ftp.getEventResult().get("breachContent"));
                    }
                    return ftp;
                }
                catch (Exception e)
                {
                    Response r = new Response();
                    r.setEventResult(Collections.singletonMap("error", e.getMessage()));
                    return r.id(e.getMessage() + "-" + counter.incrementAndGet()).status(405);
                }
            }, service);
            futures.add(future);
        });

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<Response> result = new ArrayList<>();
        futures.forEach(f ->
        {
            try
            {
                result.add(f.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        sftp.debug("总数" + _total + " 个请求, 每秒请求" + _semaphore + "个, 完成时间  = {}", end - start);

        if (all.size() > 0)
        {
            sftp.debug("结果统计==========(包含上传和解压时长)==============");
            long startMin = all.stream().mapToLong(Group::getStart).min().getAsLong();
            long startMax = all.stream().mapToLong(Group::getStart).max().getAsLong();
            sftp.debug((startMax - startMin) + " 毫秒内请求" + _total + " 个, 完成请求的平均时间为(包含上传和解压时长) " + all.stream().mapToLong(Group::getUseTime).average().getAsDouble());
            sftp.debug("最大请求返回时长为(包含上传和解压时长)： " + all.stream().mapToLong(Group::getUseTime).max().getAsLong());
            sftp.debug("最小请求返回时长为(包含上传和解压时长)： " + all.stream().mapToLong(Group::getUseTime).min().getAsLong());
            sftp.debug("结果统计===========(包含上传和解压时长)=============");
        }

        long success = result.stream().filter(r -> r.getStatus() == 200).count();
        long failed = result.stream().filter(r -> r.getStatus() != 200).count();
        result.stream().filter(r -> r.getStatus() != 200).forEach(rr -> sftp.debug("failed : " + rr.toString()));
        sftp.debug("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个" + "\n");
        return BaseResponse.<EventResult>ok(new EventResult().ofMsg("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个").ofUseTime(end - start));
    }

    @PostMapping("/upload/big/async")
    public BaseResponse<EventResult> uploadBigFileAsync(@RequestBody @Validated(UploaderInfo.SdkBatchGroup.class) UploaderInfo uploaderInfo)
    {
        AtomicInteger counter = new AtomicInteger(0);

        double _semaphore = uploaderInfo.getTime() / uploaderInfo.getTotal() < 1 ? 1 : uploaderInfo.getTime() / uploaderInfo.getTotal();
        RateLimiter limiter = RateLimiter.create(_semaphore);

        int _total = uploaderInfo.getTotal();
        String path = uploaderInfo.getPath();
        File file = new File(path);
        if (!file.exists())
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件或者文件夹不存在, path=" + path));
        }
        List<File> targetFileList = FileUtil.loopFiles(file);
        if (targetFileList.size() == 0)
        {
            return BaseResponse.<EventResult>ok(new EventResult().ofMsg("文件数为0, path=" + path));
        }
        sftp.debug("{} 文件总数 = {}", path, _total);
        long start = System.currentTimeMillis();

        sftp.debug("总请求数量= {}", _total);
        sftp.debug("每秒请求次数= {}", _semaphore);

        List<CompletableFuture<Response>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(_total);

        BlockingQueue<Long> ttimes = new LinkedBlockingQueue<>();
        IntStream.range(0, _total).forEach(_i ->
        {
            int _index = _i >= targetFileList.size() ? _i % targetFileList.size() : _i;
            System.out.println("sftp index - " + _index);
            CompletableFuture<Response> future = CompletableFuture.supplyAsync(() ->
            {
                String id = null;
                try
                {
                    limiter.acquire(1);
                    long reqStart = System.currentTimeMillis();
                    File data = targetFileList.get(_index);

                    FtpRequest request = FtpRequest.upload()
                            .file(new FileInfo(data.getName(), data.getPath()))
                            .thenAnalyze().async().manager(new Callback())
                            .build();
                    Response ftp = SpinfoExecutor.create().uploadBigFile(request);
                    return ftp;
                }
                catch (Exception e)
                {
                    Response r = new Response();
                    r.setEventResult(Collections.singletonMap("error", e.getMessage()));
                    return r.id(e.getMessage() + "-" + counter.incrementAndGet()).status(405);
                }
            }, service);
            futures.add(future);
        });

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<Response> result = new ArrayList<>();
        futures.forEach(f ->
        {
            try
            {
                result.add(f.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        sftp.debug("总数" + _total + " 个请求, 每秒请求" + _semaphore + "个, 完成时间  = {}", end - start);

        long success = result.stream().filter(r -> r.getStatus() == 200).count();
        long failed = result.stream().filter(r -> r.getStatus() != 200).count();
        result.stream().filter(r -> r.getStatus() != 200).forEach(rr -> sftp.debug("failed : " + rr.toString()));
        sftp.debug("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个" + "\n");
        return BaseResponse.<EventResult>ok(new EventResult().ofMsg("成功的请求数量 = " + success + " 个, 失败的请求数量 = " + failed + " 个").ofUseTime(end - start));
    }

    public String setSize(long size)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultSize = "";
        if (size / GB >= 1)
        {
            resultSize = df.format(size / (float) GB) + " GB";
        }
        else if (size / MB >= 1)
        {
            resultSize = df.format(size / (float) MB) + " MB";
        }
        else if (size / KB >= 1)
        {
            resultSize = df.format(size / (float) KB) + " KB";
        }
        else
        {
            resultSize = size + " B";
        }
        return resultSize;
    }

    @Data
    private static class EventResult
    {
        private Response response;
        private long useTime;
        private String message;

        public EventResult ofResp(Response r)
        {
            response = r;
            return this;
        }

        public EventResult ofUseTime(long l)
        {
            useTime = l;
            return this;
        }
        public EventResult ofMsg(String m)
        {
            message = m;
            return this;
        }
    }

    @Data
    public class Group
    {
        private String name;

        private long useTime;

        private long start;

        private long end;

        private List<Long> groupEachTime = new ArrayList<>();
    }

    private Set<File> loopDirs(File dir)
    {
        Set<File> result = new HashSet<>();
        if (!dir.isDirectory())
        {
            return result;
        }
        File[] files = dir.listFiles();
        if (null == files)
        {
            return result;
        }
        result.add(dir);
        for (File f : files)
        {
            if (f.isDirectory())
            {
                result.add(f);
                result.addAll(loopDirs(f));
            }
        }
        return result;
    }

    private void loopDirs(File dir, List<File> result)
    {
        if (result == null)
        {
            result = new ArrayList<>();
        }
        if (!dir.isDirectory())
        {
            return;
        }
        File[] files = dir.listFiles();
        if (null == files)
        {
            return;
        }
        for (File f : files)
        {
            if (f.isDirectory())
            {
                result.add(f);
                loopDirs(f, result);
            }
        }
    }

    private List<File> loopDirs2(File dir, List<File> result)
    {
        if (result == null)
        {
            result = new ArrayList<>();
        }
        if (!dir.isDirectory())
        {
            return result;
        }
        File[] files = dir.listFiles();
        if (null == files)
        {
            return result;
        }
        for (File f : files)
        {
            if (f.isDirectory())
            {
                result.add(f);
                result = loopDirs2(f, result);
            }
        }
        return result;
    }
}