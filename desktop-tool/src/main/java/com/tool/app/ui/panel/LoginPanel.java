package com.tool.app.ui.panel;

import com.tool.app.ui.UiConsts;
import com.tool.app.util.ConfigManager;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/12/06 18:41:32
 */
public class LoginPanel extends JPanel
{
    private JTextField usernameField;
    private JPasswordField pwdField;
    private JTextField hostField;

    public LoginPanel()
    {
        ConfigManager.getConfigManager().reloadDom();
        JPanel lower = new JPanel();
        lower.setBackground(new Color(240, 240, 240));
        lower.setBorder(new TitledBorder(new EtchedBorder(), ""));
//        lower.setBorder(new EmptyBorder(1, 1, 1, 1));
        lower.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        lower.setPreferredSize(new Dimension(320, 130));

        JLabel usernameLabel = new JLabel("用 户 名： ");
        usernameLabel.setFont(UiConsts.FONT_NORMAL);
        usernameLabel.setPreferredSize(new Dimension(70, 28));
        usernameField = new JTextField();
        usernameField.setFont(UiConsts.FONT_NORMAL);
        usernameField.setPreferredSize(new Dimension(180, 28));
        lower.add(usernameLabel);
        lower.add(usernameField);

        JLabel passwordLabel = new JLabel("密      码： ");
        passwordLabel.setFont(UiConsts.FONT_NORMAL);
        passwordLabel.setPreferredSize(new Dimension(70, 28));
        pwdField = new JPasswordField();
        pwdField.setFont(UiConsts.FONT_NORMAL);
        pwdField.setPreferredSize(new Dimension(180, 28));
        lower.add(passwordLabel);
        lower.add(pwdField);

        JLabel hostLabel = new JLabel("服务地址： ");
        hostLabel.setFont(UiConsts.FONT_NORMAL);
        hostLabel.setPreferredSize(new Dimension(70, 28));
        hostField = new JTextField();
        hostField.setFont(UiConsts.FONT_NORMAL);
        hostField.setPreferredSize(new Dimension(180, 28));
        if (!StringUtils.isEmpty(ConfigManager.getConfigManager().getServerHost()))
        {
            hostField.setText(ConfigManager.getConfigManager().getServerHost());
        }
        lower.add(hostLabel);
        lower.add(hostField);

        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.add(lower);
    }

    public JTextField getUsernameField()
    {
        return usernameField;
    }

    public JPasswordField getPwdField()
    {
        return pwdField;
    }

    public JTextField getHostField()
    {
        return hostField;
    }

    public void setHostField(JTextField hostField)
    {
        this.hostField = hostField;
    }
}
