package com.tool.doge.config;

import com.tool.doge.config.DogeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;

/**
 * 描述
 */
@Configuration
public class DogeInitializer implements ServletContextInitializer
{
    @Autowired
    private DogeProperties dogeProperties;

    @Override
    public void onStartup(ServletContext servletContext)
    {
    }
}
