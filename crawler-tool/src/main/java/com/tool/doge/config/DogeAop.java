package com.tool.doge.config;

import com.tool.doge.model.Host;
import com.tool.doge.service.HostService;
import com.yk.crypto.RSA2048Util;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.tool.doge.config.DogeCache.HOST_LIST;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:57:10
 */
@Configuration
@EnableConfigurationProperties(DogeProperties.class)
@Aspect
public class DogeAop
{
    private static final Logger logger = LoggerFactory.getLogger(DogeAop.class);

    @Autowired
    private HostService hostService;

    @Autowired
    private DogeProperties dogeProperties;

    @Autowired
    private RSA2048Util rsa2048Util;

    @Pointcut("@annotation(com.tool.doge.config.Key)")
    public void pointcutConfig()
    {
    }

    @Around(value = "pointcutConfig()")
    public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable
    {
        List<Host> hostList = hostService.queryHostList();
        List<String> hosts = Optional.ofNullable(hostList).orElseGet(ArrayList::new)
                .stream().map(t ->
                {
                    try
                    {
                        return rsa2048Util.decrypt(t.getName());
                    }
                    catch (Exception e)
                    {
                        logger.error("rsa decrypt error, {}", e.getMessage());
                        return null;
                    }
                }).filter(Objects::nonNull).collect(Collectors.toList());
        HOST_LIST.set(hosts);
    }
}
