package com.tool.base.config;

import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MybatisStdOutImpl implements Log
{
    private static final Logger logger = LoggerFactory.getLogger("crawler");

    public MybatisStdOutImpl(String clazz)
    {
        // Do Nothing
    }

    @Override
    public boolean isDebugEnabled()
    {
        return true;
    }

    @Override
    public boolean isTraceEnabled()
    {
        return true;
    }

    @Override
    public void error(String s, Throwable e)
    {
        logger.error(s, e);
    }

    @Override
    public void error(String s)
    {
        logger.error(s);
    }

    @Override
    public void debug(String s)
    {
        logger.debug(s);
    }

    @Override
    public void trace(String s)
    {
        logger.trace(s);
    }

    @Override
    public void warn(String s)
    {
        logger.warn(s);
    }
}
