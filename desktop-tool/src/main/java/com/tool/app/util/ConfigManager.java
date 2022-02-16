package com.tool.app.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

/**
 * 配置文件管理 单例
 */
public class ConfigManager
{
    private volatile static ConfigManager confManager;

    private static final Logger logger = LoggerFactory.getLogger(ConfigManager.class);

    public Document document;

    /**
     * 私有的构造
     */
    private ConfigManager()
    {
        reloadDom();
    }

    /**
     * 读取xml，加载到dom
     */
    public void reloadDom()
    {
        SAXReader reader = new SAXReader();
        try
        {
            File file = new File(ConstantsTools.PATH_CONFIG);
            File parentFile = file.getParentFile();
            if (!parentFile.exists())
            {
                parentFile.mkdir();
            }
            if (!file.exists())
            {
                document = reader.read(new StringReader(ConstantsTools.CONFIG_XML));
            }
            else
            {
                document = reader.read(file);
            }
            logger.info("reload dom success");
        }
        catch (DocumentException e)
        {
            logger.error("Read config xml error:", e);
        }
    }

    /**
     * 获取实例，线程安全
     */
    public static ConfigManager getConfigManager()
    {
        if (confManager == null)
        {
            synchronized (ConfigManager.class)
            {
                if (confManager == null)
                {
                    confManager = new ConfigManager();
                }
            }
        }
        return confManager;
    }

    /**
     * 把document对象写入新的文件
     */
    public void writeToXml() throws Exception
    {
        // 排版缩进的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        // 设置编码
        format.setEncoding("UTF-8");
        // 创建XMLWriter对象,指定了写出文件及编码格式
        XMLWriter writer = null;
        writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(new File(ConstantsTools.PATH_CONFIG)), StandardCharsets.UTF_8), format);
        // 写入
        writer.write(document);
        writer.flush();
        writer.close();

    }

    public String getActiveMQIp()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_IP).getText();
    }

    public void setActiveMQIp(String ip)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_IP).setText(ip);
    }

    public String getActiveMQUsername()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_USERNAME).getText();
    }

    public void setActiveMQUsername(String username)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_USERNAME).setText(username);
    }

    public String getActiveMQPasswd()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_PASSWD).getText();
    }

    public void setActiveMQPasswd(String passwd)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_PASSWD).setText(passwd);
    }

    public String getActiveMQKeystore()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_KEYSTORE).getText();
    }

    public void setActiveMQKeystore(String keystore)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_KEYSTORE).setText(keystore);
    }

    public String getActiveMQKeystorePasswd()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_KEYSTORE_PASSWD).getText();
    }

    public void setActiveMQKeystorePasswd(String keystorePasswd)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_KEYSTORE_PASSWD).setText(keystorePasswd);
    }

    public String getActiveMQTruststore()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_TRUSTSTORE).getText();
    }

    public void setActiveMQTruststore(String truststore)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_TRUSTSTORE).setText(truststore);
    }

    public String getActiveMQTruststorePasswd()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_TRUSTSTORE_PASSWD).getText();
    }

    public void setActiveMQTruststorePasswd(String truststorePasswd)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_TRUSTSTORE_PASSWD).setText(truststorePasswd);
    }

    public String getSendTimeout()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_SEND_TIMEOUT).getText();
    }

    public void setSendTimeout(String userFrom)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_SEND_TIMEOUT).setText(userFrom);
    }

    public String getCloseTimeout()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_CLOSE_TIMEOUT).getText();
    }

    public void setCloseTimeout(String closeTimeout)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ACTIVEMQ_CLOSE_TIMEOUT).setText(closeTimeout);
    }

    public String getSftpIp()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_IP).getText();
    }

    public void setSftpIp(String ip)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_IP).setText(ip);
    }

    public String getSftpUsername()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_USERNAME).getText();
    }

    public void setSftpUsername(String username)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_USERNAME).setText(username);
    }

    public String getSftpPasswd()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_PASSWD).getText();
    }

    public void setSftpPasswd(String passwd)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_PASSWD).setText(passwd);
    }

    public String getSftpPort()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_PORT).getText();
    }

    public void setSftpPort(String port)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SFTP_PORT).setText(port);
    }

    public String getServerHost()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SERVER_HOST).getText();
    }

    public void setServerHost(String serverHost)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SERVER_HOST).setText(serverHost);
    }

    public String getJobId()
    {
        return this.document.selectSingleNode(ConstantsTools.XPATH_SERVER_JOB_ID).getText();
    }

    public void setJobId(String jobId)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_SERVER_JOB_ID).setText(jobId);
    }

    public boolean getAdvancedSetting()
    {
        String as = this.document.selectSingleNode(ConstantsTools.XPATH_ADVANCED_SETTING).getText();
        return Boolean.parseBoolean(as);
    }

    public void setAdvancedSetting(String setting)
    {
        this.document.selectSingleNode(ConstantsTools.XPATH_ADVANCED_SETTING).setText(setting);
    }

    public synchronized void setUsername(String username)
    {
        if (null == this.document.selectSingleNode("//dbs/user"))
        {
            this.document.getRootElement().addElement("user").addElement("username");
        }
        if (null == this.document.selectSingleNode("//dbs/user/username"))
        {
            ((Element) this.document.selectSingleNode("//dbs/user")).addElement("username");
        }
        this.document.selectSingleNode(ConstantsTools.XPATH_USER_USERNAME).setText(username);
    }

    public String getUsername()
    {
        return null == this.document.selectSingleNode(ConstantsTools.XPATH_USER_USERNAME) ? "" :
                this.document.selectSingleNode(ConstantsTools.XPATH_USER_USERNAME).getText();
    }

    public synchronized void setPassword(String password)
    {
        if (null == this.document.selectSingleNode("//dbs/user"))
        {
            this.document.getRootElement().addElement("user").addElement("password");
        }
        if (null == this.document.selectSingleNode("//dbs/user/password"))
        {
            ((Element) this.document.selectSingleNode("//dbs/user")).addElement("password");
        }
        this.document.selectSingleNode(ConstantsTools.XPATH_USER_PASSWORD).setText(password);
    }

    public String getPassword()
    {
        return null == this.document.selectSingleNode(ConstantsTools.XPATH_USER_PASSWORD) ? "" :
                this.document.selectSingleNode(ConstantsTools.XPATH_USER_PASSWORD).getText();
    }
}
