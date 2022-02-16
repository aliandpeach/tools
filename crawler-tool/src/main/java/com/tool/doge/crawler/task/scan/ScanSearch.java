package com.tool.doge.crawler.task.scan;

import com.yk.httprequest.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ScanSearch
{
    private final static Logger logger = LoggerFactory.getLogger("scan");

    @Autowired
    public HttpClientUtil httpClientUtil;

    @Autowired
    public ScanTask scanTask;
}
