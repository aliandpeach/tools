package com.tool.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 公共配置
 */
@Configuration
@ConfigurationProperties(prefix = "crawler.tool")
public class ConfigProperties
{
    private String keystorePasswd;


}
