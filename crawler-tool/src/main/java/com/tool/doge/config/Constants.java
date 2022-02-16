package com.tool.doge.config;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/08 14:18:02
 */
public class Constants
{
    public static final String REGEX_FILE_NAME = "[\\s\\\\/:\\*\\?\\\"<>\\|]";

    public static final Map<String, String> HEADERS = new HashMap<>();

    static
    {
        HEADERS.put("Content-Type", "text/html; charset=UTF-8");
        HEADERS.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36");
        HEADERS.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
        HEADERS.put("Connection", "close");
    }
}
