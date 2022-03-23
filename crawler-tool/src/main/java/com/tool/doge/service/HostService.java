package com.tool.doge.service;

import com.tool.doge.config.DogeProperties;
import com.tool.doge.mapper.IHostMapper;
import com.tool.doge.model.Host;
import com.yk.crypto.RSA2048Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger("crawler");

    @Autowired
    private IHostMapper hostMapper;

    @Autowired
    private DogeProperties dogeProperties;

    @Autowired
    private RSA2048Util rsa2048Util;

    public List<Host> queryHostList()
    {
        return hostMapper.selectHostList();
    }

    public int save(Host host)
    {
        try
        {
            host.setName(rsa2048Util.encrypt(host.getName()));
        }
        catch (Exception e)
        {
            logger.error("save host error {}", e.getMessage());
        }
        return hostMapper.save(host);
    }
}
