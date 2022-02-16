package com.tool.doge.crawler.task.categories;

import com.tool.doge.config.Constants;
import com.tool.doge.model.CategoriesType;
import com.tool.doge.model.Host;
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoriesSearch
{
    private static final Logger logger = LoggerFactory.getLogger("categories");

    private static final String ARG = "categories";

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Autowired
    private HostService hostService;

    public List<CategoriesType> search(List<Host> hosts)
    {
        Set<CategoriesType> types = new HashSet<>();
        for (Host host : hosts)
        {
            CategoriesType type = getCategories(host.getName());
            if (null == type)
            {
                continue;
            }
            types.add(type);
        }
        return new ArrayList<>(types);
    }

    /**
     * 获取所有分类
     */
    public CategoriesType getCategories(String host)
    {
        String page;
        try
        {
            page = httpClientUtil.getString(host + ARG + "/", Constants.HEADERS, null);
        }
        catch (RuntimeException e)
        {
            logger.info("RuntimeException CategoriesSearch results is null url = ");
            return null;
        }
        catch (Exception e)
        {
            logger.info("Exception executeScanWeb results is null url = ");
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
        CategoriesType categoriesType = new CategoriesType();
        for (Element ele : e2)
        {
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
                categoriesType.setName(rsa2048Util.decrypt(_title));
            }
            catch (Exception e)
            {
                logger.error("decrypt error {}", e.getMessage());
                continue;
            }
            categoriesType.setUrl(_href.replace(host, ""));
        }
        return categoriesType;
    }
}
