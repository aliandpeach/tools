package com.tool.doge.crawler.task.categories;

import com.tool.doge.config.DogeException;
import com.tool.doge.model.CategoriesType;
import com.tool.doge.model.DownloadCategories;
import com.tool.doge.model.Host;
import com.tool.doge.service.CategoriesTypeService;
import com.tool.doge.service.DownloaderService;
import com.tool.doge.service.HostService;
import com.yk.crypto.RSA2048Util;
import com.yk.httprequest.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CategoriesCenter
{
    private static Logger logger = LoggerFactory.getLogger("categories");

    @Autowired
    private CategoriesTypeService categoriesTypeService;
    @Autowired
    private CategoriesSearch categoriesSearch;

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Autowired
    private HostService hostService;

    @Autowired
    private Executor executor;

    @Autowired
    private CategoriesTask categoriesTask;

    @Autowired
    private DownloaderService downloaderService;

    private static final LinkedBlockingQueue<DownloadCategories> DOWNLOAD_QUEUE = new LinkedBlockingQueue<>();

    private static final Object LOCK = new Object();

    public void crawler()
    {
        List<Host> hosts = hostService.queryHostList();
        CompletableFuture<List<CategoriesType>> search = CompletableFuture.supplyAsync(() -> categoriesSearch.search(hosts), executor);
        // 等待执行完毕
        CompletableFuture.<List<CategoriesType>>allOf(search).join();

        List<CategoriesType> categoriesTypes = null;
        try
        {
            categoriesTypes = search.get();
        }
        catch (InterruptedException | ExecutionException e)
        {
            logger.error("search categories error {}", e.getMessage());
            throw new DogeException("ERROR", e);
        }

        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService crawlerScheduled = Executors.newScheduledThreadPool(categoriesTypes.size(), r -> new Thread(r, "categories-crawler-" + integer.getAndIncrement()));

        for (CategoriesType categoriesType : categoriesTypes)
        {
            crawlerScheduled.scheduleWithFixedDelay(() ->
            {
                for (Host host : hosts)
                {
                    List<DownloadCategories> list = categoriesTask.categoriesPage(host, categoriesType);
                    if (null != list && list.size() > 0)
                    {
                        break;
                    }
                    downloaderService.saveDownloadCategoriesList(list);
                }
            }, 0, 5, TimeUnit.SECONDS);
        }
    }

    public void download()
    {
        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService downloadScheduled = Executors.newScheduledThreadPool(5, r -> new Thread(r, "categories-download-" + integer.getAndIncrement()));
        downloadScheduled.scheduleWithFixedDelay(() ->
        {
            try
            {
                consumer(hostService.queryHostList());
            }
            catch (Exception e)
            {
                logger.error("producer catch exception {}", e.getMessage());
            }
        }, 0, 5, TimeUnit.SECONDS);
        downloadScheduled.scheduleWithFixedDelay(() ->
        {
            try
            {
                producer();
            }
            catch (Exception e)
            {
                logger.error("producer catch exception {}", e.getMessage());
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    public void consumer(List<Host> hosts)
    {
        DownloadCategories downloadCategories = null;
        synchronized (CategoriesCenter.LOCK)
        {
            logger.info("consumer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_QUEUE.size());
            while (CategoriesCenter.DOWNLOAD_QUEUE.size() <= 0)
            {
                try
                {
                    logger.info("consumer : " + Thread.currentThread().getName() + " wait");
                    CategoriesCenter.LOCK.wait();
                    logger.info("consumer : " + Thread.currentThread().getName() + " wakeup");
                }
                catch (InterruptedException e)
                {
                    logger.error("download consumer error {}", e.getMessage());
                }
            }
            // poll动作放在 synchronized内部,
            // 否则可能导致多个消费者同时被唤醒后最先拿到锁的线程在释放了锁但还没来得及获取对象之前, 就被其它消费者线程获取了锁拿到了对象（虽然概率很低）
            downloadCategories = CategoriesCenter.DOWNLOAD_QUEUE.poll();
        }

        logger.info("consumer : " + Thread.currentThread().getName() + " poll url = " + downloadCategories.getUrl());
        String url = downloadCategories.getUrl();
        String id = downloadCategories.getId();

        if (url == null && null == id)
        {
            logger.error("center download categories object is null {}", downloadCategories);
            synchronized (CategoriesCenter.LOCK)
            {
                logger.info("consumer : " + Thread.currentThread().getName() + " notifyAll");
                CategoriesCenter.LOCK.notifyAll();
            }
            return;
        }
        boolean success = false;
        for (Host host : hosts)
        {
            success = categoriesTask.executeDownload(host.getName(), downloadCategories, 0);
            if (success)
            {
                break;
            }
        }
        if (!success)
        {
            logger.error("center execute download retry all hosts failed \n{}", url);
            synchronized (CategoriesCenter.LOCK)
            {
                logger.info("consumer : " + Thread.currentThread().getName() + " notifyAll");
                CategoriesCenter.LOCK.notifyAll();
            }
            return;
        }
        downloadCategories.setSuccess(true);
        downloaderService.updateDownloadCategories(downloadCategories);
        try
        {
            TimeUnit.MILLISECONDS.sleep(30000);
        }
        catch (InterruptedException e)
        {
            logger.error("consumer sleep 30000 error : " + Thread.currentThread().getName());
        }
        logger.info("consumer poll : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_QUEUE.size());
        synchronized (CategoriesCenter.LOCK)
        {
            logger.info("consumer : " + Thread.currentThread().getName() + " notifyAll");
            CategoriesCenter.LOCK.notifyAll();
        }
    }

    public void producer()
    {
        synchronized (CategoriesCenter.LOCK)
        {
            logger.info("producer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_QUEUE.size());
            while (CategoriesCenter.DOWNLOAD_QUEUE.size() > 0)
            {
                try
                {
                    logger.info("producer : " + Thread.currentThread().getName() + " wait");
                    CategoriesCenter.LOCK.wait();
                    logger.info("producer : " + Thread.currentThread().getName() + " wakeup");
                }
                catch (InterruptedException e)
                {
                    logger.error("download producer error {}", e.getMessage());
                }
            }
        }

        List<DownloadCategories> downloadCategoriesList = downloaderService.selectDownloadCategories(20);
        Optional.ofNullable(downloadCategoriesList).orElse(new ArrayList<>()).forEach(t -> DOWNLOAD_QUEUE.offer(t));

        logger.info("producer offer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_QUEUE.size());
        synchronized (CategoriesCenter.LOCK)
        {
            logger.info("producer : " + Thread.currentThread().getName() + " notifyAll");
            CategoriesCenter.LOCK.notifyAll();
        }
    }
}
