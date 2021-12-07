package com.tool.app.ui.panel;

import cn.hutool.core.lang.Validator;
import com.alibaba.fastjson.JSON;
import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.tool.app.App;
import com.tool.app.auth.AuthStore;
import com.tool.app.auth.SM2Util;
import com.tool.app.auth.ToolContext;
import com.tool.app.model.AuthResponseModel;
import com.tool.app.util.ConfigManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/12/07 11:49:11
 */
public class LoginDialog extends JDialog
{
    private static final Logger logger = LoggerFactory.getLogger(LoginDialog.class);

    private LoginPanel loginPanel;

    private JButton okBtn;
    private JButton cancelBtn;

    public LoginDialog(Component parentComponent)
    {
        loginPanel = new LoginPanel();
        this.setSize(360, 210);
        this.setResizable(false);
        this.setLocationRelativeTo(parentComponent);
        this.setTitle("登录");

        JPanel lower = new JPanel();
        lower.setLayout(new FlowLayout(FlowLayout.LEFT, 12, 3));
        lower.setPreferredSize(new Dimension(360, 170));

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(240, 240, 240));
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        inputPanel.setPreferredSize(new Dimension(320, 130));
        inputPanel.add(loginPanel);
        lower.add(inputPanel);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(new Color(240, 240, 240));
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        btnPanel.setPreferredSize(new Dimension(320, 40));
        okBtn = new JButton("确定");
        cancelBtn = new JButton("取消");
        btnPanel.add(okBtn);
        btnPanel.add(cancelBtn);
        lower.add(btnPanel);

        this.getContentPane().add(lower);

        this.addListener(this);

        this.setModal(true);// 焦点锁定 放在事件之后
        this.setVisible(true);
    }

    private void addListener(JDialog _this)
    {
        this.addWindowListener(new WindowListener()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {

            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                App.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e)
            {

            }

            @Override
            public void windowIconified(WindowEvent e)
            {

            }

            @Override
            public void windowDeiconified(WindowEvent e)
            {

            }

            @Override
            public void windowActivated(WindowEvent e)
            {

            }

            @Override
            public void windowDeactivated(WindowEvent e)
            {

            }
        });

        cancelBtn.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                App.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.exit(0);
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
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });

        okBtn.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                String username = loginPanel.getUsernameField().getText();
                char[] password = loginPanel.getPwdField().getPassword();
                String hostIp = loginPanel.getHostField().getText();
                if (StringUtils.isEmpty(username)
                        || StringUtils.isAnyBlank(username))
                {
                    JOptionPane.showMessageDialog(_this, "请输入用户名");
                    return;
                }
                if (null == password || StringUtils.isEmpty(new String(password)) || StringUtils.isAnyBlank(new String(password)))
                {
                    JOptionPane.showMessageDialog(_this, "请输入密码");
                    return;
                }
                if (StringUtils.isEmpty(hostIp) || StringUtils.isAnyBlank(hostIp) || !Validator.isIpv4(hostIp))
                {
                    JOptionPane.showMessageDialog(_this, "请输入正确的服务地址");
                    return;
                }

                SM2Util sm2Util = new SM2Util();
                Map<String, String> param = new HashMap<>();
                try
                {
                    param.put("username", sm2Util.encode(username, SM2Util.PUBLIC_KEY));
                    param.put("password", sm2Util.encode(new String(password), SM2Util.PUBLIC_KEY));
                }
                catch (Exception ex)
                {
                    logger.error("sm2 encrypt error", ex);
                }
                HttpRequest httpRequest = HttpRequest.create()
                        .uri("/SIMP_DBS_S/api/auth/verification").method("POST").async()
                        .params(param).host(hostIp.startsWith("https://") ? hostIp : "https://" + hostIp).build();
                Response response = null;
                try
                {
                    response = SpinfoExecutor.create().execute(httpRequest);
                    String result = response.getMessage().get("result");
                    AuthResponseModel authResponseModel = JSON.parseObject(result, AuthResponseModel.class);
                    if (response.getStatus() != 200)
                    {
                        if (null == authResponseModel
                                || StringUtils.isEmpty(authResponseModel.getMessage())
                                || null == authResponseModel.getAuthorization()
                                || null == authResponseModel.getAuthorization().get("authorization"))
                        {
                            logger.error("login error response error {}", result);
                            JOptionPane.showMessageDialog(_this, "登录失败");
                            return;
                        }
                        logger.error("login error response message {}", result);
                        JOptionPane.showMessageDialog(_this, authResponseModel.getMessage());
                        return;
                    }
                    if (null == authResponseModel
                            || null == authResponseModel.getAuthorization()
                            || null == authResponseModel.getAuthorization().get("authorization"))
                    {
                        logger.error("login error response authorization is null {}", response.getMessage());
                        JOptionPane.showMessageDialog(_this, "登录失败");
                        return;
                    }
                    ConfigManager.getConfigManager().reloadDom();
                    ConfigManager.getConfigManager().setServerHost(hostIp);
                    ConfigManager.getConfigManager().writeToXml();
                    ToolContext.getContext().setCurrentUser(new AuthStore(username, authResponseModel.getAuthorization().get("authorization").toString(), hostIp));
                    _this.dispose();
                }
                catch (Exception ex)
                {
                    logger.error("login error", ex);
                    JOptionPane.showMessageDialog(_this, "登录失败请联系管理员");
                    return;
                }
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
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });
    }
}
