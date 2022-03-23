package com.tool.doge.config;

import com.yk.crypto.KeyUtil;
import com.yk.crypto.RSA2048Util;
import com.yk.httprequest.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/08 10:04:51
 */
@Configuration
public class CrawlerConfiguration
{
    private Logger logger = LoggerFactory.getLogger("crawler");
    @Autowired
    private DogeProperties dogeProperties;

    @Bean
    public HttpClientUtil httpClientUtil() throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException, KeyManagementException
    {
        return new HttpClientUtil(new HttpClientUtil.Config());
    }

    @Bean
    public RSA2048Util rsa2048Util()
    {
        try
        {
            PrivateKey key = KeyUtil.readEncryptedKey(DogeAop.class.getClassLoader().getResourceAsStream("key/rsa-encrypted-1.pem"),
                    dogeProperties.getEncryptedPasswd());
            PublicKey pub = KeyUtil.exportPublicKey(key);
            PublicKey publicKey = KeyUtil.readCertificate(DogeAop.class.getClassLoader().getResourceAsStream("key/rsa.pub"));
            byte[] bytes1 = publicKey.getEncoded();
            byte[] bytes2 = pub.getEncoded();
            boolean equals = Arrays.equals(bytes1, bytes2);
            RSA2048Util rsa = RSA2048Util.getInstance(key.getEncoded(), pub.getEncoded());
            return rsa;
        }
        catch (Exception e)
        {
            logger.error("init RSA2048Util bean error", e);
            return null;
        }
    }
}
