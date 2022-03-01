package com.tool.doge.crawler.task.scan;

import com.tool.doge.model.DownloadScan;
import com.tool.doge.model.DownloadType;
import com.tool.doge.model.Host;
import com.tool.doge.service.DownloaderService;
import com.tool.doge.service.HostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ScanCenter
{
    private static final Logger logger = LoggerFactory.getLogger("scan");

    private static final LinkedBlockingQueue<DownloadScan> DOWNLOAD_SCAN_QUEUE = new LinkedBlockingQueue<>();

    private static final Object LOCK = new Object();

    @Autowired
    private ScanTask scanTask;

    @Autowired
    private DownloaderService downloaderService;

    @Autowired
    private HostService hostService;

    public void crawler()
    {
        List<Host> hosts = hostService.queryHostList();

        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService crawlerScheduled = Executors.newScheduledThreadPool(5, r -> new Thread(r, "scan-crawler-" + integer.getAndIncrement()));

        crawlerScheduled.scheduleWithFixedDelay(() ->
        {
            DownloadType downloadType = new DownloadType();
            for (Host host : hosts)
            {
                List<DownloadScan> list = new ArrayList<>();
                scanTask.executeScanWeb(host.getName(), downloadType, 0, list);
                if (list.size() > 0)
                {
                    break;
                }
                downloaderService.saveDownloadScanList(list);
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    public void download()
    {
        AtomicInteger integer = new AtomicInteger(0);
        ScheduledExecutorService downloadScheduled = Executors.newScheduledThreadPool(5, r -> new Thread(r, "scan-download-" + integer.getAndIncrement()));
        downloadScheduled.scheduleWithFixedDelay(() ->
        {
            try
            {
                consumer(hostService.queryHostList());
            }
            catch (Exception e)
            {
                logger.error("scan producer catch exception {}", e.getMessage());
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
                logger.error("scan producer catch exception {}", e.getMessage());
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    public void consumer(List<Host> hosts)
    {
        DownloadScan downloadScan = null;
        synchronized (LOCK)
        {
            logger.info("consumer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_SCAN_QUEUE.size());
            while (DOWNLOAD_SCAN_QUEUE.size() <= 0)
            {
                try
                {
                    logger.info("scan consumer : " + Thread.currentThread().getName() + " wait");
                    LOCK.wait();
                    logger.info("scan consumer : " + Thread.currentThread().getName() + " wakeup");
                }
                catch (InterruptedException e)
                {
                    logger.error("scan consumer wait error {}", e.getMessage());
                }
            }
            downloadScan = DOWNLOAD_SCAN_QUEUE.poll();
        }

        logger.info("consumer : " + Thread.currentThread().getName() + " poll url = " + downloadScan.getUrl());
        String url = downloadScan.getUrl();
        String id = downloadScan.getId();

        if (url == null || null == id)
        {
            synchronized (LOCK)
            {
                logger.info("consumer : " + Thread.currentThread().getName() + " notifyAll");
                LOCK.notifyAll();
            }
            return;
        }
        String sha256;
        for (Host host : hosts)
        {
            sha256 = scanTask.executeDownload(host.getName(), downloadScan, 0);
            if (null != sha256)
            {
                break;
            }
        }

        downloaderService.updateDownloadScan(downloadScan);

        try
        {
            TimeUnit.MILLISECONDS.sleep(30000);
        }
        catch (InterruptedException e)
        {
            logger.error("scan consumer sleep 30000 error {} ", e.getMessage());
        }
        logger.info("consumer poll : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_SCAN_QUEUE.size());
        synchronized (LOCK)
        {
            logger.info("consumer : " + Thread.currentThread().getName() + " notifyAll");
            LOCK.notifyAll();
        }
    }

    public void producer()
    {
        synchronized (LOCK)
        {
            logger.info("producer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_SCAN_QUEUE.size());
            while (DOWNLOAD_SCAN_QUEUE.size() >= 200)
            {
                try
                {
                    logger.info("producer : " + Thread.currentThread().getName() + " wait");
                    LOCK.wait();
                    logger.info("producer : " + Thread.currentThread().getName() + " wakeup");
                }
                catch (InterruptedException e)
                {
                    logger.error("scan producer wait error {}", e.getMessage());
                }
            }
        }

        List<DownloadScan> downloadScanList = downloaderService.selectDownloadScan(20);
        Optional.ofNullable(downloadScanList).orElse(new ArrayList<>()).forEach(t -> DOWNLOAD_SCAN_QUEUE.offer(t));
        logger.info("producer offer : " + Thread.currentThread().getName() + " queue size " + DOWNLOAD_SCAN_QUEUE.size());
        synchronized (LOCK)
        {
            logger.info("producer : " + Thread.currentThread().getName() + " notifyAll");
            LOCK.notifyAll();
        }
    }
}
