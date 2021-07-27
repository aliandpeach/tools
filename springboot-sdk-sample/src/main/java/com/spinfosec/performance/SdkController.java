package com.spinfosec.performance;

import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.connector.sftp.FtpRequest;
import com.spinfosec.core.FileInfo;
import com.spinfosec.core.PropertyLoader;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.spinfosec.core.SpinfoInfo;
import com.spinfosec.exception.BaseResponse;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping("/performance")
public class SdkController implements InitializingBean
{
    private static final Logger logger = LoggerFactory.getLogger("performance");

    private static final long KB = 1024;

    private static final long MB = 1024 * 1024;

    private static final long GB = 1024 * 1024 * 1024;

    @Override
    public void afterPropertiesSet() throws Exception
    {
        try
        {
            SpinfoInfo info = PropertyLoader.loadProperties();
            SpinfoExecutor.create().init(info);
        }
        catch (Throwable e)
        {
            logger.error("init error", e);
        }
    }

    @GetMapping("/index")
    public ModelAndView testPage(HttpServletRequest request, OrderInfo orderInfo)
    {
        logger.debug("enter test index page");
        Function<UploaderInfo, Long> func = t -> new File(t.getPath()).length();
        return new ModelAndView("index")
                .addObject("host", SpinfoExecutor.create().getSpinfo().getDbsServerHost())
                .addObject("fileList", new ArrayList<>()).addObject("path", "");
    }

    @GetMapping("/file/reload")
    public List<UploaderInfo> reload()
    {
        return new ArrayList<>();
    }

    @PostMapping("/upload")
    public BaseResponse<EventResult> upload(@RequestBody @Validated(UploaderInfo.SdkGroup.class) UploaderInfo uploaderInfo)
    {
        long start = System.currentTimeMillis();
        FileInfo fileInfo = new FileInfo(uploaderInfo.getName(), uploaderInfo.getPath());
        Response result = SpinfoExecutor.create().upload(HttpRequest.uploader()
                .file(fileInfo).build());
        long end = System.currentTimeMillis();
        logger.info("test use time : " + (end - start) + uploaderInfo.getName() + ", " + uploaderInfo.getPath());
        return BaseResponse.<EventResult>ok(new EventResult().ofResp(result).ofUseTime(end - start));
    }

    @PostMapping("/upload/big")
    public BaseResponse<EventResult> uploadBigFile(@RequestBody @Validated(UploaderInfo.SdkGroup.class) UploaderInfo uploaderInfo)
    {
        long start = System.currentTimeMillis();
        FtpRequest request = FtpRequest.upload()
                .file(new FileInfo(uploaderInfo.getName(), uploaderInfo.getPath()))
                .thenAnalyze()
                .build();
        Response ftp = SpinfoExecutor.create().uploadBigFile(request);
        long end = System.currentTimeMillis();
        logger.info("test use time : " + (end - start) + uploaderInfo.getName() + ", " + uploaderInfo.getPath());
        return BaseResponse.<EventResult>ok(new EventResult().ofResp(ftp).ofUseTime(end - start));
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
    }
}