package com.tool.doge.crawler.task.categories;

import cn.hutool.core.util.NumberUtil;
import com.tool.doge.config.Constants;
import com.tool.doge.config.DogeProperties;
import com.tool.doge.crawler.task.AbstractTask;
import com.tool.doge.model.Category;
import com.tool.doge.model.DownloadCategories;
import com.tool.doge.model.Host;
import com.tool.doge.service.HostService;
import com.yk.crypto.RSA2048Util;
import com.yk.httprequest.HttpClientUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Service
public class CategoriesTask extends AbstractTask
{
    private static final Logger logger = LoggerFactory.getLogger("crawler");

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Autowired
    private HostService hostService;

    @Autowired
    private DogeProperties dogeProperties;

    @Autowired
    private Executor executor;

    @Autowired
    private CategoriesSearch categoriesSearch;

    private void _sleep(int i)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(i);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public String executeCategoriesWeb(String host, Category category, List<DownloadCategories> list, int retry)
    {
        if (retry > 3)
        {
            return null;
        }
        logger.info("executeCategoriesWeb retry times = {} ", retry);
        logger.info("executeCategoriesWeb url = " + category.getUrl());
        String results = null;
        try
        {
            results = httpClientUtil.getString(host + category.getUrl(), Constants.HEADERS, null);
            if (null == results)
            {
                logger.error("executeCategoriesWeb results is null url = " + category.getUrl());
                return executeCategoriesWeb(host, category, list, ++retry);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("RuntimeException executeCategoriesWeb results is null url = " + category.getUrl());
            return executeCategoriesWeb(host, category, list, ++retry);
        }
        catch (Exception e)
        {
            logger.error("Exception executeCategoriesWeb results is null url = " + category.getUrl());
            return executeCategoriesWeb(host, category, list, ++retry);
        }
        _sleep(12000);
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

        Elements e = doc.select("div.list-videos");
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
        if (null == e2)
        {
            logger.info("something is wrong!!4");
            return null;
        }

        for (Element ele : e2)
        {
            DownloadCategories downloadCategories = new DownloadCategories();
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
            downloadCategories.setUrl(r);
            downloadCategories.setFileName(DigestUtils.sha256Hex(name));
            downloadCategories.setCategory(category.getUuid());
            list.add(downloadCategories);
        }
        String nextUrl = nextUrl(doc);
        logger.info("next url : " + nextUrl);
        return nextUrl;
    }

    private String subOpt(String host, String enter_url, int retry)
    {
        if (retry > 3)
        {
            return null;
        }
        logger.info("subOpt enter_url retry {}", retry);
        logger.info("subOpt enter_url = " + enter_url);
        String results = null;
        try
        {
            results = httpClientUtil.getString(host + enter_url, null, null);
            if (null == results)
            {
                logger.error("subOpt results is null enter_url = " + enter_url);
                return subOpt(host, enter_url, ++retry);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("subOpt RuntimeException results is null enter_url = " + enter_url, e);
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
            logger.error("subOpt tabs1 is null document = " + document);
            return null;
        }
        Element tab = tabs1.first();
        if (null == tab)
        {
            logger.error("subOpt tab is null tabs1 = " + tabs1);
            return null;
        }
        Elements infos = tab.select("div.info");
        if (null == infos)
        {
            logger.error("subOpt infos is null tab = " + tab);
            return null;
        }
        Element info = infos.first();
        if (null == info)
        {
            logger.error("subOpt info is null infos = " + infos);
            return null;
        }
        if (info.children() == null || info.children().size() == 0)
        {
            logger.error("subOpt info.children() is null info = " + info);
            return null;
        }
        Element item = info.child(info.children().size() - 1);
        if (null == item)
        {
            logger.error("subOpt item is null info.children = " + info.children());
            return null;
        }
        Elements links = item.select("a[href]");
        if (null == links)
        {
            logger.error("subOpt links is null item = " + item);
            return null;
        }
        Element link = links.first();
        if (null == item)
        {
            logger.error("subOpt item is null links = " + links);
            return null;
        }
        String href = link.attr("href");
        _sleep(3000);
        return href;
    }

    private String nextUrl(Document doc)
    {
        Elements paginations = doc.select("div.pagination");
        if (null == paginations)
        {
            logger.error("nextUrl paginations is null doc = " + doc);
            return null;
        }
        Element pagination = paginations.first();
        if (pagination == null)
        {
            logger.error("nextUrl pagination is null paginations = " + paginations);
            return null;
        }
        Elements curs = pagination.select("li.page-current");
        if (curs == null)
        {
            logger.error("nextUrl curs is null pagination = " + pagination);
            return null;
        }
        Element cur = curs.first();
        if (cur == null)
        {
            logger.error("nextUrl cur is null curs = " + curs);
            return null;
        }
        Element e = cur.nextElementSibling();
        if (e == null)
        {
            logger.error("nextUrl e is null cur = " + cur);
            return null;
        }
        Elements es = e.select("a[href]");
        e = es.first();
        if (e == null)
        {
            logger.error("nextUrl es is null e ");
            return null;
        }
        String str = e.html();
        try
        {
            return Integer.parseInt(str) + "";
        }
        catch (Exception ex)
        {
            logger.error("Integer.parseInt(str) error " + str, e);
        }
        return null;
    }

    public boolean executeDownload(String host, DownloadCategories downloadCategories, int retry)
    {
        if (retry > 3)
        {
            logger.error("retry execute download host url more than 3 times \n{} \n{}", host, downloadCategories.getUrl());
            return false;
        }
        logger.info("execute download : retry = {} ", retry);
        logger.info("execute download : url = {} ", downloadCategories.getUrl());
        String finalName = downloadCategories.getFileName().replaceAll(Constants.REGEX_FILE_NAME, "");
        String sha256;
        try
        {
            String rootDir = dogeProperties.getDownloadPath();
            sha256 = httpClientUtil.getBytes(host + downloadCategories.getUrl(), Constants.HEADERS, null, finalName, downloadCategories.getCategory(), rootDir);
            if (null == sha256)
            {
                logger.error("execute download results is false url = " + downloadCategories.getUrl());
                _sleep(10000);
                return executeDownload(host, downloadCategories, ++retry);
            }
        }
        catch (RuntimeException e)
        {
            logger.error("executeDownload RuntimeException results is null url = " + downloadCategories.getUrl(), e);
            _sleep(10000);
            return executeDownload(host, downloadCategories, ++retry);
        }
        catch (Exception e)
        {
            logger.error("executeDownload Exception results is null url = " + downloadCategories.getUrl(), e);
            _sleep(10000);
            return executeDownload(host, downloadCategories, ++retry);
        }

        logger.info("executeDownload index : url = {},  download success!", downloadCategories.getUrl());
        return true;
    }

    public List<DownloadCategories> categoriesPage(Host host, Category category)
    {
        List<DownloadCategories> list = new ArrayList<>();
        String url = category.getUrl() + "?mode=async&function=get_block&block_id=list_videos_common_videos_list&sort_by=post_date&from=%d&_=" + Instant.now().toEpochMilli();
        url = String.format(url, category.getPage().get());
        logger.info("categories page url : {}", url);
        String nextPage = this.executeCategoriesWeb(host.getName(), category, list, 0);
        logger.info("categories next page : {}", nextPage);
        if (null == nextPage || !NumberUtil.isInteger(nextPage))
        {
            return list;
        }
        else
        {
            category.addPage(Integer.parseInt(nextPage));
        }
        return list;
    }
}
