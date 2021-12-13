package com.tool.app.ui.panel;

import cn.hutool.core.lang.Validator;
import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.tool.app.App;
import com.tool.app.auth.ToolContext;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;
import com.tool.app.util.ConfigManager;
import com.tool.app.util.DESPlus;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 设置面板
 */
public class SettingPanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    private static final Logger logger = LoggerFactory.getLogger(SettingPanel.class);

    private static JTextField textFieldActivemqBrokerUrl;
    private static JTextField textFieldActivemqUsername;
    private static JPasswordField textFieldActivemqPassword;

    private static JTextField textFieldSftpUsername;
    private static JPasswordField textFieldSftpPassword;
    private static JTextField textFieldSftpIp;
    private static JTextField textFieldSftpPort;

    private static JTextField textFieldServerHost;
    private static JTextField textFieldServerJobId;

    private static JButton buttonSave;

    private boolean advancedSetting = ConfigManager.getConfigManager().getAdvancedSetting();

    private static JToggleButton advancedSettingBtn;

    private static MyIconButton testConnectionBtn;

    private static JPanel advancedSettingPanel;

    private final DESPlus des = new DESPlus();

    /**
     * 构造
     */
    public SettingPanel()
    {
        initialize();
        addComponent();
        setContent();
        addListener();
    }

    /**
     * 初始化
     */
    private void initialize()
    {
        this.setBackground(UiConsts.MAIN_BACK_COLOR);
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
    }

    /**
     * 添加组件
     */
    private void addComponent()
    {
        this.add(getUpPanel(), BorderLayout.NORTH);

        JPanel lower = new JPanel();
        lower.setBackground(Color.WHITE);
        lower.setBorder(new EmptyBorder(0, 0, 0, 0));
        lower.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        lower.setPreferredSize(new Dimension(800, 560));

        JPanel dbsHostPanel = new JPanel();
        dbsHostPanel.setBackground(Color.WHITE);
        dbsHostPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
//        dbsSettingsPanel.setBorder(new TitledBorder(new EtchedBorder(), "DBS Server"));
        dbsHostPanel.setPreferredSize(new Dimension(400, 48));
        textFieldServerHost = new JTextField();
        textFieldServerHost.setEditable(false);
        textFieldServerHost.setFont(UiConsts.FONT_NORMAL);
        textFieldServerHost.setPreferredSize(new Dimension(240, 28));
        JLabel dbsHost = new JLabel(App.resourceBundle.getString("label.setting.server.host"));
        dbsHost.setFont(UiConsts.FONT_NORMAL);
        dbsHost.setPreferredSize(new Dimension(120, 28));
        dbsHostPanel.add(dbsHost);
        dbsHostPanel.add(textFieldServerHost);
        lower.add(dbsHostPanel);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        btnPanel.setBackground(Color.WHITE);
        btnPanel.setPreferredSize(new Dimension(400, 48));
        testConnectionBtn = new MyIconButton(UiConsts.ICON_TEST_CONNECT, UiConsts.ICON_TEST_CONNECT, UiConsts.ICON_TEST_CONNECT, "");
        btnPanel.add(testConnectionBtn);

        buttonSave = new MyIconButton(UiConsts.ICON_SAVE, UiConsts.ICON_SAVE, UiConsts.ICON_SAVE, "");
        btnPanel.add(buttonSave);
        lower.add(btnPanel);


        JPanel advancedSettingBtnPanel = new JPanel();
        advancedSettingBtnPanel.setBackground(Color.WHITE);
        advancedSettingBtnPanel.setPreferredSize(new Dimension(800, 40));
        advancedSettingBtnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 8));
        advancedSettingBtn = new JToggleButton("展开高级选项");
        advancedSettingBtn.setSelected(false);
//        advancedSettingBtn.setPreferredSize(new Dimension(180, 100));
        advancedSettingBtnPanel.add(advancedSettingBtn);
        lower.add(advancedSettingBtnPanel);

//        JLabel dbsJobId = new JLabel(App.resourceBundle.getString("label.setting.server.job.id"));
//        dbsJobId.setFont(UiConsts.FONT_NORMAL);
//        dbsJobId.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
//        dbsSettingsPanel.add(dbsJobId);
//        textFieldServerJobId = new JTextField();
//        textFieldServerJobId.setFont(UiConsts.FONT_NORMAL);
//        textFieldServerJobId.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
//        dbsSettingsPanel.add(textFieldServerJobId);

        advancedSettingPanel = new JPanel();
        advancedSettingPanel.setBackground(Color.WHITE);
        advancedSettingPanel.setPreferredSize(new Dimension(800, 380));

        advancedSettingPanel.setVisible(advancedSetting);

        JPanel activeMqSettingsPanel = new JPanel();
        activeMqSettingsPanel.setBorder(new TitledBorder(new EtchedBorder(), "ActiveMQ"));
        activeMqSettingsPanel.setBackground(UiConsts.MAIN_BACK_COLOR);
        activeMqSettingsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        activeMqSettingsPanel.setPreferredSize(new Dimension(800, 150));

        JLabel activeMQIp = new JLabel(App.resourceBundle.getString("label.setting.active.ip"));
        activeMQIp.setFont(UiConsts.FONT_NORMAL);
        activeMQIp.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldActivemqBrokerUrl = new JTextField();
        textFieldActivemqBrokerUrl.setFont(UiConsts.FONT_NORMAL);
        textFieldActivemqBrokerUrl.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        activeMqSettingsPanel.add(activeMQIp);
        activeMqSettingsPanel.add(textFieldActivemqBrokerUrl);

        JLabel activeMQUsername = new JLabel(App.resourceBundle.getString("label.setting.active.username"));
        activeMQUsername.setFont(UiConsts.FONT_NORMAL);
        activeMQUsername.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldActivemqUsername = new JTextField();
        textFieldActivemqUsername.setFont(UiConsts.FONT_NORMAL);
        textFieldActivemqUsername.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        activeMqSettingsPanel.add(activeMQUsername);
        activeMqSettingsPanel.add(textFieldActivemqUsername);

        JLabel activeMQPasswd = new JLabel(App.resourceBundle.getString("label.setting.active.passwd"));
        activeMQPasswd.setFont(UiConsts.FONT_NORMAL);
        activeMQPasswd.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldActivemqPassword = new JPasswordField();
        textFieldActivemqPassword.setFont(UiConsts.FONT_NORMAL);
        textFieldActivemqPassword.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        activeMqSettingsPanel.add(activeMQPasswd);
        activeMqSettingsPanel.add(textFieldActivemqPassword);
        advancedSettingPanel.add(activeMqSettingsPanel);

        // SFTP
        JPanel sftpSettingsPanel = new JPanel();
        sftpSettingsPanel.setBackground(Color.WHITE);
        sftpSettingsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        sftpSettingsPanel.setBorder(new TitledBorder(new EtchedBorder(), "SFTP"));
        sftpSettingsPanel.setPreferredSize(new Dimension(800, 200));
        JLabel sftpIp = new JLabel(App.resourceBundle.getString("label.setting.sftp.ip"));
        sftpIp.setFont(UiConsts.FONT_NORMAL);
        sftpIp.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldSftpIp = new JTextField();
        textFieldSftpIp.setFont(UiConsts.FONT_NORMAL);
        textFieldSftpIp.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        sftpSettingsPanel.add(sftpIp);
        sftpSettingsPanel.add(textFieldSftpIp);

        JLabel sftpPort = new JLabel(App.resourceBundle.getString("label.setting.sftp.port"));
        sftpPort.setFont(UiConsts.FONT_NORMAL);
        sftpPort.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldSftpPort = new JTextField();
        textFieldSftpPort.setFont(UiConsts.FONT_NORMAL);
        textFieldSftpPort.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        sftpSettingsPanel.add(sftpPort);
        sftpSettingsPanel.add(textFieldSftpPort);

        JLabel sftpUsername = new JLabel(App.resourceBundle.getString("label.setting.sftp.username"));
        sftpUsername.setFont(UiConsts.FONT_NORMAL);
        sftpUsername.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldSftpUsername = new JTextField();
        textFieldSftpUsername.setFont(UiConsts.FONT_NORMAL);
        textFieldSftpUsername.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        sftpSettingsPanel.add(sftpUsername);
        sftpSettingsPanel.add(textFieldSftpUsername);

        JLabel sftpPasswd = new JLabel(App.resourceBundle.getString("label.setting.sftp.passwd"));
        sftpPasswd.setFont(UiConsts.FONT_NORMAL);
        sftpPasswd.setPreferredSize(UiConsts.LABEL_SIZE_ITEM);
        textFieldSftpPassword = new JPasswordField();
        textFieldSftpPassword.setFont(UiConsts.FONT_NORMAL);
        textFieldSftpPassword.setPreferredSize(UiConsts.TEXT_FIELD_SIZE_ITEM);
        sftpSettingsPanel.add(sftpPasswd);
        sftpSettingsPanel.add(textFieldSftpPassword);
        advancedSettingPanel.add(sftpSettingsPanel);

        lower.add(advancedSettingPanel);

//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setBackground(UiConsts.MAIN_BACK_COLOR);
//        buttonPanel.setPreferredSize(new Dimension(800, 40));
//        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 2));
//        buttonSave = new MyIconButton(UiConsts.ICON_SAVE, UiConsts.ICON_SAVE, UiConsts.ICON_SAVE, "");
//        buttonPanel.add(buttonSave);
//        lower.add(buttonPanel);
        this.add(lower);
    }

    /**
     * 上部面板
     */
    private JPanel getUpPanel()
    {
        JPanel panelUp = new JPanel();
        panelUp.setBackground(UiConsts.MAIN_BACK_COLOR);
        panelUp.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

//        JLabel labelTitle = new JLabel(App.resourceBundle.getString("ui.setting.title"));
//        labelTitle.setFont(UiConsts.FONT_TITLE);
//        labelTitle.setForeground(Color.TOOL_BAR_BACK_COLOR);
//        panelUp.add(labelTitle);

        return panelUp;
    }

    /**
     * 设置内容
     */
    public void setContent()
    {
        ConfigManager.getConfigManager().reloadDom();
        textFieldActivemqBrokerUrl.setText(ConfigManager.getConfigManager().getActiveMQIp());
        textFieldActivemqUsername.setText(ConfigManager.getConfigManager().getActiveMQUsername());

        String pass = "";
        try
        {
            pass = des.decrypt(ConfigManager.getConfigManager().getActiveMQPasswd());
        }
        catch (Exception e)
        {
        }
        textFieldActivemqPassword.setText(pass);

        textFieldSftpIp.setText(ConfigManager.getConfigManager().getSftpIp());
        textFieldSftpPort.setText(ConfigManager.getConfigManager().getSftpPort());
        textFieldSftpUsername.setText(ConfigManager.getConfigManager().getSftpUsername());
        String sftpPass = null;
        try
        {
            sftpPass = des.decrypt(ConfigManager.getConfigManager().getSftpPasswd());
        }
        catch (Exception e)
        {
        }
        textFieldSftpPassword.setText(sftpPass);

        textFieldServerHost.setText(ConfigManager.getConfigManager().getServerHost());
//        textFieldServerJobId.setText(ConfigManager.getConfigManager().getJobId());
    }

    /**
     * 为相关组件添加事件监听
     */
    private void addListener()
    {
        advancedSettingBtn.setSelected(advancedSetting);
        advancedSettingBtn.setText(advancedSetting ? "关闭高级选项" : "展开高级选项");

        advancedSettingBtn.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                JToggleButton jtb = (JToggleButton) e.getSource();
                if (jtb.isSelected())
                {
                    advancedSettingBtn.setText("关闭高级选项");
                    advancedSettingPanel.setVisible(true);
                    advancedSetting = true;

//                    setContent();
                }
                else
                {
                    advancedSettingBtn.setText("展开高级选项");
                    advancedSettingPanel.setVisible(false);
                    advancedSetting = false;
                }
                advancedSettingBtn.updateUI();
                advancedSettingPanel.updateUI();
            }
        });

        testConnectionBtn.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (Objects.isNull(textFieldServerHost))
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.test.connect.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String serverHost = textFieldServerHost.getText();
                if (Objects.isNull(serverHost))
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.test.connect.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                HttpRequest httpRequest = HttpRequest.<Map<String, String>>create()
                        .uri("/SIMP_DBS_S/event/file/analysis/interface/job/list").method("GET").async()
                        .params(new HashMap<>()).host(serverHost.startsWith("https://") ? serverHost : "https://" + serverHost).build();
                Response response = SpinfoExecutor.create().execute(httpRequest);
                if (response.getStatus() != 200)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.test.connect.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.test.connect.success"), App.resourceBundle.getString("ui.tips"), JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                testConnectionBtn.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                testConnectionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        buttonSave.addMouseListener(new MouseListener()
        {

            @Override
            public void mouseReleased(MouseEvent e)
            {
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                buttonSave.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                buttonSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e)
            {
                String serverHost = textFieldServerHost.getText();
                if (StringUtils.isEmpty(serverHost))
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                boolean boo = Validator.isIpv4(serverHost);
                if (!boo)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.ip.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
//                String jobId = textFieldServerJobId.getText();
//                if (StringUtils.isEmpty(jobId))
//                {
//                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.job.id"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
//                    return;
//                }

                String activeIp = textFieldActivemqBrokerUrl.getText();
                if (StringUtils.isEmpty(activeIp) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.ip"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String activeUsername = textFieldActivemqUsername.getText();
                if (StringUtils.isEmpty(activeUsername) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.username"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                char[] activePassword = textFieldActivemqPassword.getPassword();
                if ((null == activePassword || activePassword.length == 0) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.passwd"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String sftpIp = textFieldSftpIp.getText();
                if (StringUtils.isEmpty(sftpIp) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.ip"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String sftpPort = textFieldSftpPort.getText();
                if (StringUtils.isEmpty(sftpPort) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.port"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String sftpUsername = textFieldSftpUsername.getText();
                if (StringUtils.isEmpty(sftpUsername) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.username"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                char[] sftpPassword = textFieldSftpPassword.getPassword();
                if ((null == sftpPassword || sftpPassword.length == 0) && advancedSetting)
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.passwd"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try
                {
                    if (advancedSetting)
                    {
                        ConfigManager.getConfigManager().setActiveMQIp(activeIp);
                        ConfigManager.getConfigManager().setActiveMQUsername(activeUsername);
                        ConfigManager.getConfigManager().setActiveMQPasswd(des.encrypt(new String(activePassword)));

                        ConfigManager.getConfigManager().setActiveMQKeystore("spinfossl/client.ks");
                        ConfigManager.getConfigManager().setActiveMQKeystorePasswd("v6M0L86RX75BUf+8bwwomJ+bRUKuwrHwszrdgax99WNmi7KIVTFoEA7e8lMV11RU");

                        ConfigManager.getConfigManager().setActiveMQTruststore("spinfossl/client.ts");
                        ConfigManager.getConfigManager().setActiveMQTruststorePasswd("/VS6SPq0g+BYQcMhzR+C8gZgnG0tO/2nPpy02vVnBHSGLBIugkvOSMo4WcHPZaIA");

                        ConfigManager.getConfigManager().setSendTimeout("120000");
                        ConfigManager.getConfigManager().setCloseTimeout("120000");

                        ConfigManager.getConfigManager().setSftpIp(sftpIp);
                        ConfigManager.getConfigManager().setSftpPort(sftpPort);
                        ConfigManager.getConfigManager().setSftpUsername(sftpUsername);
                        ConfigManager.getConfigManager().setSftpPasswd(des.encrypt(new String(sftpPassword)));
                    }
                    else
                    {
                        ConfigManager.getConfigManager().setActiveMQIp(serverHost);
                    }

                    ConfigManager.getConfigManager().setServerHost(serverHost);
//                    ConfigManager.getConfigManager().setJobId(jobId);

                    ConfigManager.getConfigManager().setAdvancedSetting(advancedSetting + "");

                    ConfigManager.getConfigManager().writeToXml();
                }
                catch (Exception ex)
                {
                    logger.error("保存失败", ex);
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.save.fail"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                App.settingPanel.updateUI();
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.save.success"), App.resourceBundle.getString("ui.tips"), JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}