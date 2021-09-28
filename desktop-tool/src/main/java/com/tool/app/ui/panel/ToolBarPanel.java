package com.tool.app.ui.panel;

import com.tool.app.App;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 工具栏面板
 */
public class ToolBarPanel extends JPanel
{

    private static final long serialVersionUID = 1L;

    private static MyIconButton buttonStatus;
    private static JLabel checkLabel;

    private static MyIconButton buttonHistory;
    private static JLabel historyLabel;

    private static MyIconButton buttonSetting;
    private static JLabel settingLabel;

    /**
     * 构造
     */
    public ToolBarPanel()
    {
        initialize();
        addButton();
        addListener();
    }

    /**
     * 初始化
     */
    private void initialize()
    {
        Dimension preferredSize = new Dimension(48, UiConsts.MAIN_WINDOW_HEIGHT);
        this.setPreferredSize(preferredSize);
        this.setMaximumSize(preferredSize);
        this.setMinimumSize(preferredSize);
        this.setBackground(new Color(242, 242, 242));
        this.setLayout(new GridLayout(2, 1));
    }

    /**
     * 添加工具按钮
     */
    private void addButton()
    {
        JPanel panelUp = new JPanel();
        panelUp.setBackground(new Color(242, 242, 242));
        panelUp.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        buttonStatus = new MyIconButton(UiConsts.ICON_STATUS_ENABLE, UiConsts.ICON_STATUS_ENABLE,
                UiConsts.ICON_STATUS, App.resourceBundle.getString("ui.status.title"));
        checkLabel = new JLabel("检查");
        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 0));
        checkPanel.add(checkLabel);

        buttonHistory = new MyIconButton(UiConsts.ICON_HISTORY, UiConsts.ICON_HISTORY_ENABLE,
                UiConsts.ICON_HISTORY, App.resourceBundle.getString("ui.history.title"));
        historyLabel = new JLabel("历史");
        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 0));
        historyPanel.add(historyLabel);

        buttonSetting = new MyIconButton(UiConsts.ICON_SETTING, UiConsts.ICON_SETTING_ENABLE,
                UiConsts.ICON_SETTING, App.resourceBundle.getString("ui.setting.title"));
        settingLabel = new JLabel("设置");
        JPanel settingPanel = new JPanel();
        settingPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 0));
        settingPanel.add(settingLabel);

        panelUp.add(buttonStatus);
        panelUp.add(checkPanel);

        panelUp.add(buttonHistory);
        panelUp.add(historyPanel);

        panelUp.add(buttonSetting);
        panelUp.add(settingPanel);
        this.add(panelUp);
    }

    /**
     * 为各按钮添加事件动作监听
     */
    private void addListener()
    {
        buttonStatus.addActionListener(e ->
        {
            buttonStatus.setIcon(UiConsts.ICON_STATUS_ENABLE);
            buttonSetting.setIcon(UiConsts.ICON_SETTING);

            App.mainPanelCenter.removeAll();
            App.mainPanelCenter.add(App.statusPanel, BorderLayout.CENTER);
            App.mainPanelCenter.updateUI();
        });

        buttonSetting.addActionListener(e ->
        {
            buttonStatus.setIcon(UiConsts.ICON_STATUS);
            buttonSetting.setIcon(UiConsts.ICON_SETTING_ENABLE);

            App.mainPanelCenter.removeAll();
            App.mainPanelCenter.add(App.settingPanel, BorderLayout.CENTER);
            App.mainPanelCenter.updateUI();

            App.settingPanel.setContent();
        });

        buttonHistory.addActionListener(e ->
        {
            App.mainPanelCenter.removeAll();
            App.mainPanelCenter.add(App.historyPanel, BorderLayout.CENTER);
            App.mainPanelCenter.updateUI();

            App.historyPanel.setContent();
        });

        buttonStatus.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

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
                buttonStatus.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                buttonStatus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        buttonHistory.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

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
                buttonHistory.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                buttonHistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        buttonSetting.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

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
                buttonSetting.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                buttonSetting.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
    }
}
