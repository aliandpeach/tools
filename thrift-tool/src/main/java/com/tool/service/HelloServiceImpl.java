package com.tool.service;

import org.apache.thrift.TException;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/11/06 17:25:48
 */
public class HelloServiceImpl implements IHelloService.Iface
{
    @Override
    public String say(Hello hello) throws TException
    {
        return null;
    }
}
