package com.tool.doge.config;

import com.tool.doge.model.Host;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 14:06:16
 */
public class DogeCache
{
    public static final ThreadLocal<List<Host>> HOST_LIST = new ThreadLocal<>();
}
