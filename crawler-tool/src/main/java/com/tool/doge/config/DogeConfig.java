package com.tool.doge.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "doge")
@Data
public class DogeConfig
{
    private String downloadPath = System.getProperty("user.home");

    private transient String storePasswd;

    private transient String keyPasswd;

    private transient String encryptedPasswd;
}
