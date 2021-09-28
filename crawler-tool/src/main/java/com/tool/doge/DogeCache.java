package com.tool.doge;

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
    public static final ThreadLocal<List<String>> HOST_LIST = new ThreadLocal<>();
}
