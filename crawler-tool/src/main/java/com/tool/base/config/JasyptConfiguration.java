package com.tool.base.config;

import com.ulisesbocchio.jasyptspringboot.properties.JasyptEncryptorConfigurationProperties;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/31 15:20:03
 */
@Configuration
@EnableConfigurationProperties({ConfigProperties.class, JasyptEncryptorConfigurationProperties.class})
public class JasyptConfiguration
{
    private static final char[] PASSWD = {'b', 'c', 'L', 'l', 'k', '3', '8', '#', '0', 'P', 'd', '+', '$', 'J', 'j', 'd', 'w', 'U', 'p', 'g', '2', '2', '%', '#', 'h', 'c', 'C'};

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private JasyptEncryptorConfigurationProperties jasyptEncryptorConfigurationProperties;

    @Bean("jasyptStringEncryptor")
    public StringEncryptor jasyptStringEncryptor()
    {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        String jpasswd = jasyptEncryptorConfigurationProperties.getPassword();
        if (null == jpasswd)
        {
            jpasswd = "";
        }
        char[] passwdNew = new char[PASSWD.length + jpasswd.length()];
        System.arraycopy(PASSWD, 0, passwdNew, 0, PASSWD.length);
        System.arraycopy(jpasswd.toCharArray(), 0, passwdNew, PASSWD.length, jpasswd.length());
        config.setPasswordCharArray(passwdNew);
        config.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.salt.RandomIVGenerator");
        config.setStringOutputType(CommonUtils.STRING_OUTPUT_TYPE_BASE64);
        encryptor.setConfig(config);
        return encryptor;
    }
}
