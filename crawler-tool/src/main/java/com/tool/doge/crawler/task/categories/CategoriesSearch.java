package com.tool.doge.crawler.task.categories;

import com.tool.doge.config.Constants;
import com.tool.doge.model.Category;
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

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoriesSearch
{
    private static final Logger logger = LoggerFactory.getLogger("crawler");

    private static final String CATEGORIES = "categories";

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Autowired
    private HostService hostService;

    public List<Category> search(List<Host> hosts)
    {
        Set<Category> result = new HashSet<>();
        for (Host host : hosts)
        {
            Set<Category> types = getCategories(host.getName());
            if (null == types || types.size() == 0)
            {
                continue;
            }
            result.addAll(types);
        }
        return new ArrayList<>(result);
    }

    /**
     * 获取所有分类
     */
    public Set<Category> getCategories(String host)
    {
        Set<Category> categoriesList = new HashSet<>();
        String page;
        try
        {
            page = httpClientUtil.getString(host + CATEGORIES + "/", Constants.HEADERS, null);
        }
        catch (RuntimeException e)
        {
            logger.error("RuntimeException CategoriesSearch results is null")                                                ;
            return null;
        }
        catch (Exception e)
        {
            logger.error("Exception executeScanWeb results is null");
            return null;
        }

        if (null == page)
        {
            logger.info("CategoriesSearch results is null");
            return null;
        }

        Document doc = null;
        try
        {
            doc = Jsoup.parse(page);
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

        Elements container = doc.select("div.main-container");
        if (null == container)
        {
            logger.info("something is wrong!!2");
            return null;
        }
        Elements categories = container.select("div.list-categories");
        if (null == categories)
        {
            logger.info("something is wrong!!3");
            return null;
        }
        Elements e2 = categories.select("a.item");
        if (null == e2)
        {
            logger.info("something is wrong!!4");
            return null;
        }

        for (Element ele : e2)
        {
            Category category = new Category();
            Element _hrefA = ele.selectFirst("a");
            String _href = _hrefA.attr("href");
            String _title = _hrefA.attr("title");
            if (null == _href || null == _title)
            {
                logger.info("_hrefA is null ele " + ele);
                continue;
            }
            try
            {
                category.setName(DigestUtils.sha256Hex(_title.getBytes(StandardCharsets.UTF_8)));
            }
            catch (Exception e)
            {
                logger.error("decrypt error {}", e.getMessage());
                continue;
            }
            category.setUrl(_href.replace(host, ""));
            category.setUuid(category.getUrl().substring(category.getUrl().indexOf(CATEGORIES + "/") + (CATEGORIES + "/").length(), category.getUrl().length() - 1));
            categoriesList.add(category);
        }
        return categoriesList;
    }
}
