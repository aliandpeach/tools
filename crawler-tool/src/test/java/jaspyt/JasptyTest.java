package jaspyt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.junit.Test;

import java.util.UUID;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/31 15:50:04
 */
public class JasptyTest
{
    private static final char[] PASSWD = {'b', 'c', 'L', 'l', 'k', '3', '8', '#', '0', 'P', 'd', '+', '$', 'J', 'j', 'd', 'w', 'U', 'p', 'g', '2', '2', '%', '#', 'h', 'c', 'C'};
    private static final String jpasswd = "";

    @Test
    public void main()
    {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        config.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        char[] passwdNew = new char[PASSWD.length + jpasswd.length()];
        System.arraycopy(PASSWD, 0, passwdNew, 0, PASSWD.length);
        System.arraycopy(jpasswd.toCharArray(), 0, passwdNew, PASSWD.length, jpasswd.length());
        config.setPasswordCharArray(passwdNew);
        standardPBEStringEncryptor.setConfig(config);
        String plainText = "";
        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);
        System.out.println(encryptedText);

        String _plainText = standardPBEStringEncryptor.decrypt(encryptedText);
        System.out.println(_plainText);
    }
}
