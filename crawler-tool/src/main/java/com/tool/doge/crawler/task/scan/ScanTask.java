package com.tool.doge.crawler.task.scan;

import com.tool.doge.config.Constants;
import com.tool.doge.config.DogeProperties;
import com.tool.doge.crawler.task.AbstractTask;
import com.tool.doge.model.DownloadScan;
import com.tool.doge.model.DownloadType;
import com.tool.doge.service.HostService;
import com.yk.crypto.RSA2048Util;
import com.yk.httprequest.HttpClientUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class ScanTask extends AbstractTask
{
    private static final Logger logger = LoggerFactory.getLogger("scan");

    private static final Logger scanError = LoggerFactory.getLogger("scanError");

    @Autowired
    public static HttpClientUtil httpClientUtil;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Autowired
    private HostService hostService;

    @Autowired
    private DogeProperties dogeProperties;

    public String executeDownload(String host, DownloadScan downloadScan, int retry)
    {
        logger.info("execute download {}", downloadScan.getUrl());
        String finalName = downloadScan.getFileName().replaceAll(Constants.REGEX_FILE_NAME, "");
        String sha256 = null;
        try
        {
            String rootDir = dogeProperties.getDownloadPath();
            sha256 = httpClientUtil.getBytes(host + downloadScan.getUrl(), Constants.HEADERS, null, finalName, "", rootDir);
            if (null == sha256)
            {
                logger.error("executeDownload results is null url = " + downloadScan.getUrl());
                _sleep(10000);
                return executeDownload(host, downloadScan, ++retry);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("executeDownload RuntimeException results is null url = " + downloadScan.getUrl(), e);
            _sleep(10000);
            return executeDownload(host, downloadScan, ++retry);
        }
        catch (Exception e)
        {
            logger.error("executeDownload Exception results is null url = " + downloadScan.getUrl(), e);
            _sleep(10000);
            return executeDownload(host, downloadScan, ++retry);
        }

        logger.info("execute download url = " + downloadScan.getUrl() + " download success!");
        return sha256;
    }

    private void _sleep(int i)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(i);
        }
        catch (InterruptedException e)
        {
            logger.error("sleep milliseconds {} error {}", i, e.getMessage());
        }
    }

    public String executeScanWeb(String host, DownloadType downloadType, int retry, List<DownloadScan> list)
    {
        logger.info("executeScanWeb url = " + downloadType.getUrl());
        String results = null;
        try
        {
            results = httpClientUtil.getString(host + downloadType.getUrl(), Constants.HEADERS, null);
            if (null == results)
            {
                logger.error("executeScanWeb results is null url = " + downloadType.getUrl());
                return executeScanWeb(host, downloadType, ++retry, list);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("RuntimeException executeScanWeb results is null url = " + downloadType.getUrl());
            return executeScanWeb(host, downloadType, ++retry, list);
        }
        catch (Exception e)
        {
            logger.error("Exception executeScanWeb results is null url = " + downloadType.getUrl());
            return executeScanWeb(host, downloadType, ++retry, list);
        }
        _sleep(15000);
        Document doc = null;
        try
        {
            doc = Jsoup.parse(results);
        }
        catch (Exception e)
        {
            logger.error("Jsoup.parse(results) error");
        }
        if (null == doc)
        {
            logger.info("something is wrong!!1");
            return null;
        }

        Elements e = doc.select("div.main-container");
        if (null == e)
        {
            logger.info("something is wrong!!2");
            return null;
        }
        Element exx = e.first();
        if (null == exx)
        {
            logger.info("something is wrong!!3");
            return null;
        }
        Elements e2 = exx.select("div.item");
        if (null == e2 || e2.listIterator() == null)
        {
            logger.info("something is wrong!!4");
            return null;
        }

        for (Element ele : e2)
        {
            if (null == ele)
            {
                continue;
            }
            Element h = ele.selectFirst("a");
            String enterhref = h.attr("href");
            String name = h.attr("title");
            String _enter_href = enterhref.replace(host, "");
            String r = subOpt(host, _enter_href, 0);
            if (null == r)
            {
                continue;
            }
            r = r.replace(host, "");
            break;
        }
        String nextUrl = nextUrl(doc);
        logger.info("next url : " + nextUrl);
        return nextUrl;
    }

    private String subOpt(String host, String enter_url, int retry)
    {
        logger.info("subOpt enter_url = {} retry times {}", enter_url, retry);
        if (retry > 3)
        {
            return null;
        }

        logger.info("subOpt enter_url = " + enter_url);
        String results = null;
        try
        {
            results = httpClientUtil.getString(host + enter_url, null, null);
            if (null == results)
            {
                logger.error("subOpt results is null enter_url = " + enter_url);
                _sleep(10000);
                return subOpt(host, enter_url, ++retry);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("subOpt RuntimeException results is null enter_url = " + enter_url, e);
            _sleep(10000);
            return subOpt(host, enter_url, ++retry);
        }

        Document document = null;
        try
        {
            document = Jsoup.parse(results);
        }
        catch (Exception e)
        {
            logger.error("subOpt Jsoup.parse(results); error");
        }
        if (document == null)
        {
            return null;
        }

        Elements tabs1 = document.select("div#tab_video_info");
        if (null == tabs1)
        {
            scanError.error("subOpt tabs1 is null document = " + document);
            return null;
        }
        Element tab = tabs1.first();
        if (null == tab)
        {
            scanError.error("subOpt tab is null tabs1 = " + tabs1);
            return null;
        }
        Elements infos = tab.select("div.info");
        if (null == infos)
        {
            scanError.error("subOpt infos is null tab = " + tab);
            return null;
        }
        Element info = infos.first();
        if (null == info)
        {
            scanError.error("subOpt info is null infos = " + infos);
            return null;
        }
        if (info.children() == null || info.children().size() == 0)
        {
            scanError.error("subOpt info.children() is null info = " + info);
            return null;
        }
        Element item = info.child(info.children().size() - 1);
        if (null == item)
        {
            scanError.error("subOpt item is null info.children = " + info.children());
            return null;
        }
        Elements links = item.select("a[href]");
        if (null == links)
        {
            scanError.error("subOpt links is null item = " + item);
            return null;
        }
        Element link = links.first();
        if (null == item)
        {
            scanError.error("subOpt item is null links = " + links);
            return null;
        }
        String href = link.attr("href");
        _sleep(1000);
        return href;
    }

    private String nextUrl(Document doc)
    {
        Elements paginations = doc.select("div.pagination");
        if (null == paginations)
        {
            scanError.error("nextUrl paginations is null doc = " + doc);
            return null;
        }
        Element pagination = paginations.first();
        if (pagination == null)
        {
            scanError.error("nextUrl pagination is null paginations = " + paginations);
            return null;
        }
        Elements curs = pagination.select("li.page-current");
        if (curs == null)
        {
            scanError.error("nextUrl curs is null pagination = " + pagination);
            return null;
        }
        Element cur = curs.first();
        if (cur == null)
        {
            scanError.error("nextUrl cur is null curs = " + curs);
            return null;
        }
        Element e = cur.nextElementSibling();
        if (e == null)
        {
            scanError.error("nextUrl e is null cur = " + cur);
            return null;
        }
        Elements es = e.select("a[href]");
        e = es.first();
        if (e == null)
        {
            scanError.error("nextUrl es is null e = " + e);
            return null;
        }
        String str = e.html();
        try
        {
            return Integer.parseInt(str) + "/";
        }
        catch (Exception ex)
        {
            logger.error("Integer.parseInt(str) error " + str, e);
        }
        return null;
    }
}
