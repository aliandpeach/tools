package com.tool.doge.service;

import com.tool.doge.mapper.IHostMapper;
import com.tool.doge.model.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:47:35
 */
@Service
public class HostService
{
    @Autowired
    private IHostMapper hostMapper;

    public List<Host> queryHostList()
    {
        return hostMapper.selectHostList();
    }

    public int save(Host host)
    {
        return hostMapper.save(host);
    }
}
