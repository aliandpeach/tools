package com.tool.app.util;

import com.tool.app.ui.UiConsts;

import java.io.File;

/**
 * 工具层相关的常量
 */
public class ConstantsTools
{
    /**
     * 配置文件 路径
     */
    public final static String PATH_CONFIG = UiConsts.CURRENT_USER_HOME + File.separator + ".dbsconfig" + File.separator + "config.xml";

    public static final String CONFIG_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<dbs> \n" +
            "  <activemq> \n" +
            "    <ip></ip>  \n" +
            "    <username>root</username>  \n" +
            "    <password>qaZhI6OA6kQZT84Vr0kYAW0v2U9XdlM217EzHTCezpbuIcamSb8UVhsuZ5R891QQ</password>  \n" +
            "    <keystore>spinfossl/client.ks</keystore>  \n" +
            "    <keystore.passwd>v6M0L86RX75BUf+8bwwomJ+bRUKuwrHwszrdgax99WNmi7KIVTFoEA7e8lMV11RU</keystore.passwd>  \n" +
            "    <truststore>spinfossl/client.ts</truststore>  \n" +
            "    <truststore.passwd>/VS6SPq0g+BYQcMhzR+C8gZgnG0tO/2nPpy02vVnBHSGLBIugkvOSMo4WcHPZaIA</truststore.passwd>  \n" +
            "    <send.timeout>120000</send.timeout>  \n" +
            "    <close.timeout>120000</close.timeout> \n" +
            "  </activemq>  \n" +
            "  <sftp> \n" +
            "    <ip></ip>  \n" +
            "    <port></port>  \n" +
            "    <username></username>  \n" +
            "    <password></password> \n" +
            "  </sftp>  \n" +
            "  <server> \n" +
            "    <server.host></server.host>  \n" +
            "    <job.id></job.id> \n" +
            "  </server> \n" +
            "  <advanced> \n" +
            "    <setting>false</setting>  \n" +
            "  </advanced> \n" +
            "</dbs>";

    /**
     * 配置文件dom实例
     */
    public final static ConfigManager CONFIGER = ConfigManager.getConfigManager();

    public final static String ACTIVE_MQ_URL = "ssl://%s:61617?tcpNoDelay=true&wireFormat.maxInactivityDuration=0&jms.blobTransferPolicy.defaultUploadUrl=https://%s:8161/fileserver/";

    /**
     * xpath
     */
    public final static String XPATH_ACTIVEMQ_IP = "//dbs/activemq/ip";
    public final static String XPATH_ACTIVEMQ_USERNAME = "//dbs/activemq/username";
    public final static String XPATH_ACTIVEMQ_PASSWD = "//dbs/activemq/password";
    public final static String XPATH_ACTIVEMQ_KEYSTORE = "//dbs/activemq/keystore";
    public final static String XPATH_ACTIVEMQ_KEYSTORE_PASSWD = "//dbs/activemq/keystore.passwd";
    public final static String XPATH_ACTIVEMQ_TRUSTSTORE = "//dbs/activemq/truststore";
    public final static String XPATH_ACTIVEMQ_TRUSTSTORE_PASSWD = "//dbs/activemq/truststore.passwd";
    public final static String XPATH_ACTIVEMQ_SEND_TIMEOUT = "//dbs/activemq/send.timeout";
    public final static String XPATH_ACTIVEMQ_CLOSE_TIMEOUT = "//dbs/activemq/close.timeout";

    public final static String XPATH_SFTP_IP = "//dbs/sftp/ip";
    public final static String XPATH_SFTP_USERNAME = "//dbs/sftp/username";
    public final static String XPATH_SFTP_PASSWD = "//dbs/sftp/password";
    public final static String XPATH_SFTP_PORT = "//dbs/sftp/port";

    public final static String XPATH_SERVER_HOST = "//dbs/server/server.host";
    public final static String XPATH_SERVER_JOB_ID = "//dbs/server/job.id";

    public final static String XPATH_ADVANCED_SETTING = "//dbs/advanced/setting";

    /**
     * 日志文件 路径
     */
    public final static String PATH_LOG = UiConsts.CURRENT_DIR + File.separator + "log" + File.separator + "log.log";
}
