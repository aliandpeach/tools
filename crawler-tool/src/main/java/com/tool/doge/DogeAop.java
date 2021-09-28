package com.tool.doge;

import com.tool.doge.config.DogeConfig;
import com.tool.doge.model.Host;
import com.tool.doge.service.HostService;
import com.yk.crypto.KeyUtil;
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

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.tool.doge.DogeCache.HOST_LIST;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:57:10
 */
@Configuration
@EnableConfigurationProperties(DogeConfig.class)
@Aspect
public class DogeAop
{
    private static final Logger logger = LoggerFactory.getLogger(DogeAop.class);

    @Autowired
    private HostService hostService;

    @Autowired
    private DogeConfig dogeConfig;

    @Pointcut("@annotation(com.tool.doge.config.Key)")
    public void pointcutConfig()
    {
    }

    @Around(value = "pointcutConfig()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable
    {
        List<Host> hostList = hostService.queryHostList();
        PrivateKey key = KeyUtil.readEncryptedKey(DogeAop.class.getClassLoader().getResourceAsStream("key/rsa-encrypted-1.pem"),
                dogeConfig.getEncryptedPasswd());
        PublicKey pub = KeyUtil.exportPublickey(key);
        RSA2048Util rsa = RSA2048Util.getInstance(key.getEncoded(), pub.getEncoded());
        List<String> hosts = Optional.ofNullable(hostList).orElseGet(ArrayList::new)
                .stream().map(t ->
                {
                    try
                    {
                        return rsa.decrypt(t.getName());
                    }
                    catch (Exception e)
                    {
                        logger.error("rsa decrypt error, {}", e.getMessage());
                        return null;
                    }
                }).filter(Objects::nonNull).collect(Collectors.toList());
        HOST_LIST.set(hosts);
        return null;
    }
}
