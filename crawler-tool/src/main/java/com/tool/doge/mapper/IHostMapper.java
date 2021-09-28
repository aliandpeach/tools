package com.tool.doge.mapper;

import com.tool.doge.model.Host;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:20:50
 */
public interface IHostMapper
{
    List<Host> selectHostList();

    int save(Host host);
}
