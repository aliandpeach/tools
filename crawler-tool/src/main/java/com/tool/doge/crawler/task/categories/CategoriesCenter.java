package com.tool.doge.crawler.task.categories;

import com.tool.doge.model.Category;
import com.tool.doge.model.DownloadCategories;
import com.tool.doge.model.Host;
import com.tool.doge.service.DownloadCategoriesService;
import com.tool.doge.service.HostService;
import com.tool.exception.CrawlerException;
import com.yk.crypto.RSA2048Util;
import com.yk.httprequest.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
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
    private static Logger logger = LoggerFactory.getLogger("crawler");

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
    private DownloadCategoriesService downloadCategoriesService;

    private volatile boolean running;

    private List<ScheduledExecutorService> executors = new CopyOnWriteArrayList<>();

    private static final LinkedBlockingQueue<DownloadCategories> DOWNLOAD_QUEUE = new LinkedBlockingQueue<>();

    private static final Object LOCK = new Object();

    public void crawler(List<Host> hosts)
    {
        synchronized (this)
        {
            if (running)
            {
                throw new CrawlerException("categories crawler is running", -1);
            }

            running = true;
        }

        CompletableFuture<List<Category>> search = CompletableFuture.supplyAsync(() -> categoriesSearch.search(hosts), executor);
        // 等待执行完毕
        CompletableFuture.<List<Category>>allOf(search).join();

        List<Category> categories = null;
        try
        {
            categories = search.get();
        }
        catch (InterruptedException | ExecutionException e)
        {
            logger.error("search categories error {}", e.getMessage());
            synchronized (this)
            {
                running = false;
            }
            throw new CrawlerException("Categories crawler error", -1, e);
        }

        if (null == categories || categories.size() == 0)
        {
            synchronized (this)
            {
                running = false;
            }
            throw new CrawlerException("crawler categories is null", -1);
        }

        logger.info("search categories type size {}", categories.size());

        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService crawlerScheduled = Executors.newScheduledThreadPool(1, r -> new Thread(r, "categories-crawler-" + integer.getAndIncrement()));
        executors.add(crawlerScheduled);

        categories = new ArrayList<>(Collections.singleton(categories.get(0)));
        for (Category category : categories)
        {
            final Category categoryTemp = category;
            crawlerScheduled.scheduleWithFixedDelay(() ->
            {
                if (running)
                {
                    for (Host host : hosts)
                    {
                        logger.info("uuid=" + categoryTemp.getUuid() + " " + categoryTemp.getPage().get());
                        List<DownloadCategories> list = categoriesTask.categoriesPage(host, categoryTemp);
                        if (null == list || list.size() == 0)
                        {
                            logger.error("crawler categories Page error result is null");
                            continue;
                        }
                        try
                        {
                            downloadCategoriesService.saveDownloadCategoriesList(list);
                        }
                        catch (Exception e)
                        {
                            logger.error("save DownloadCategoriesList error {}", e.getMessage());
                        }
                        break;
                    }
                }
            }, 0, 5, TimeUnit.SECONDS);
        }
    }

    public void stop()
    {
        if (!running)
        {
            throw new CrawlerException("categories has already stopped", -1);
        }
        running = false;

        for (ScheduledExecutorService scheduledExecutorService : executors)
        {
            // 定时任务内的线程若处于wait sleep 状态, 则会抛出 InterruptedException
            List<Runnable> list = scheduledExecutorService.shutdownNow();
        }
        executors = new CopyOnWriteArrayList<>();
    }

    public void download(List<Host> hosts)
    {
        if (running)
        {
            throw new CrawlerException("categories download is running", -1);
        }

        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService downloadScheduled = Executors.newScheduledThreadPool(2, r -> new Thread(r, "categories-download-" + integer.getAndIncrement()));
        executors.add(downloadScheduled);
        downloadScheduled.scheduleWithFixedDelay(() ->
        {
            try
            {
                if (running)
                {
                    consumer(hosts);
                }
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
                if (running)
                {
                    producer();
                }
            }
            catch (Exception e)
            {
                logger.error("producer catch exception {}", e.getMessage());
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    private void consumer(List<Host> hosts)
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
                    // 线程池执行shutdownNow, 若处于wait状态,则执行到此步骤
                    return;
                }
            }
            // poll动作放在 synchronized内部,
            // 否则可能导致多个消费者同时被唤醒后最先拿到锁的线程在释放了锁但还没来得及获取对象之前, 就被其它消费者线程获取了锁拿到了对象（虽然概率很低）
        }
        downloadCategories = CategoriesCenter.DOWNLOAD_QUEUE.poll();

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
        downloadCategoriesService.updateDownloadCategories(downloadCategories);
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

    private void producer()
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
                    return;
                }
            }
        }

        List<DownloadCategories> downloadCategoriesList = downloadCategoriesService.selectDownloadCategories(20);
        Optional.ofNullable(downloadCategoriesList).orElse(new ArrayList<>()).forEach(DOWNLOAD_QUEUE::offer);

        logger.info("producer offer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_QUEUE.size());
        synchronized (CategoriesCenter.LOCK)
        {
            logger.info("producer : " + Thread.currentThread().getName() + " notifyAll");
            CategoriesCenter.LOCK.notifyAll();
        }
    }
}
