package com.tool.app.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

public class DESPlus
{
    private static char[] PASSWD = new char[]{'t', 'e', 's', 't', '_', 'd', 'b', 's', '_', 'k', 'e', 'y', '_', 'h', 'h', 'g', 'f', 'd', 'o', 'y', 't', 'y', 't', '#', 'd', 's', 'd', '.', '1', '2', '#', '2', 'u', 'i'};

    private static final String ALGORITHM = "PBEWITHHMACSHA512ANDAES_256";

    public String decrypt(String encryptedText)
    {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        config.setAlgorithm(ALGORITHM);
        config.setPasswordCharArray(PASSWD);
        standardPBEStringEncryptor.setConfig(config);
        String plainText = standardPBEStringEncryptor.decrypt(encryptedText);
        return plainText;
    }

    public String encrypt(String plainText)
    {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        config.setAlgorithm(ALGORITHM);
        config.setPasswordCharArray(PASSWD);
        standardPBEStringEncryptor.setConfig(config);
        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);
        return encryptedText;
    }

    public String decryptAes(String encryptedText)
    {
        try
        {
            byte[] enBytes = Base64.getDecoder().decode(encryptedText);
            if (enBytes.length < 16)
            {
                return "";
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG","SUN");
            sr.setSeed(new String(PASSWD).getBytes(StandardCharsets.UTF_8));

            byte[] ivBytes = new byte[16];
            System.arraycopy(enBytes, 0, ivBytes, 0, ivBytes.length);

            keyGenerator.init(256, sr);
            SecretKey key = keyGenerator.generateKey();

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(ivBytes));

            byte[] bytes = new byte[enBytes.length - ivBytes.length];
            System.arraycopy(enBytes, ivBytes.length, bytes, 0, bytes.length);
            byte[] debytes = cipher.doFinal(bytes);
            return new String(debytes, 0, debytes.length);
        }
        catch (Exception e)
        {
            return "";
        }
    }

    public String encryptAes(String plainText)
    {
        try
        {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom sr = new SecureRandom(new String(PASSWD).getBytes(StandardCharsets.UTF_8));

            SecureRandom randomSalt = new SecureRandom();
            byte[] ivBytes = new byte[16];
            randomSalt.nextBytes(ivBytes);

            keyGenerator.init(256, sr);
            SecretKey key = keyGenerator.generateKey();

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(ivBytes));
            byte[] enbytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            byte[] result = new byte[ivBytes.length + enbytes.length];
            System.arraycopy(ivBytes, 0, result, 0, ivBytes.length);
            System.arraycopy(enbytes, 0, result, ivBytes.length, enbytes.length);
            return Base64.getEncoder().encodeToString(result);
        }
        catch (Exception e)
        {
            return "";
        }
    }
}