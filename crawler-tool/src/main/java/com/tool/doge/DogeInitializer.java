package com.tool.doge;

import com.tool.doge.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 描述
 */
public class DogeInitializer implements ServletContextInitializer
{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {

    }
}
