package com.tool.app.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * PropertyUtil
 */
public class PropertyUtil
{
    /**
     * 获取property
     */
    public static String getProperty(String key)
    {
        Properties pps = new Properties();
        try
        {
            InputStream in = new BufferedInputStream(new FileInputStream(""));
            pps.load(in);
            String value = pps.getProperty(key);
            return value;
        }
        catch (IOException e)
        {
            return null;
        }
    }
}
