package com.tool.doge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 *
 */
@RestController
@RequestMapping("/crawler")
public class CrawlerController implements InitializingBean
{
    private static final Logger crawler = LoggerFactory.getLogger("crawler");

    private static Random random = new Random();

    @Override
    public void afterPropertiesSet()
    {
    }

    @GetMapping("/concurrent")
    public ModelAndView concurrentPage(HttpServletRequest request)
    {
        return new ModelAndView("concurrent");
    }
}