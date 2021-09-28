package com.tool.app;

import com.tool.app.db.H2Store;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.panel.DetailPanel;
import com.tool.app.ui.panel.HistoryPanel;
import com.tool.app.ui.panel.SettingPanel;
import com.tool.app.ui.panel.StatusPanel;
import com.tool.app.ui.panel.ToolBarPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 程序入口，主窗口Frame
 */
public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static JFrame main;

    public static JPanel mainPanelCenter;

    public static ResourceBundle resourceBundle;

    public static StatusPanel statusPanel;
    public static SettingPanel settingPanel;
    public static HistoryPanel historyPanel;

    public static DetailPanel detailPanel;

    public static H2Store h2Store;

    /**
     * 程序入口main
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            try
            {
                App window = new App();
                main.setVisible(true);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }

    /**
     * 构造，创建APP
     */
    public App()
    {
        initialize();
    }

    /**
     * 初始化frame内容
     */
    private void initialize()
    {
        resourceBundle = ResourceBundle.getBundle("title", Locale.CHINA);
        logger.info("==================AppInitStart");
        // 设置系统默认样式
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e)
        {
            logger.error("initialize setLookAndFeel error", e);
        }

        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        // 初始化主窗口
        main = new JFrame();
        main.setBounds((width - UiConsts.MAIN_WINDOW_WIDTH) / 2, (height - UiConsts.MAIN_WINDOW_HEIGHT) / 2, UiConsts.MAIN_WINDOW_WIDTH,
                UiConsts.MAIN_WINDOW_HEIGHT);
        main.setTitle(resourceBundle.getString("title.dbs.name"));
        main.setIconImage(UiConsts.IMAGE_ICON);
        main.setBackground(UiConsts.MAIN_BACK_COLOR);
        main.setResizable(false);
        JPanel mainPanel = new JPanel(true);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new BorderLayout());

        ToolBarPanel toolbar = new ToolBarPanel();
        statusPanel = new StatusPanel();
        settingPanel = new SettingPanel();

        detailPanel = new DetailPanel();

        historyPanel = new HistoryPanel();

        mainPanel.add(toolbar, BorderLayout.WEST);

        mainPanelCenter = new JPanel(true);
        mainPanelCenter.setLayout(new BorderLayout());
        mainPanelCenter.add(statusPanel, BorderLayout.CENTER);

//        detailPanel.setVisible(false);
//        mainPanelCenter.add(detailPanel, BorderLayout.CENTER);

        mainPanel.add(mainPanelCenter, BorderLayout.CENTER);

        main.add(mainPanel);

        main.addWindowListener(new WindowListener()
        {

            @Override
            public void windowOpened(WindowEvent e)
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
            public void windowDeactivated(WindowEvent e)
            {
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                int result = JOptionPane.showConfirmDialog(App.statusPanel, resourceBundle.getString("ui.mainwindow.exitconfirm"),
                        resourceBundle.getString("ui.confirm.tip"), JOptionPane.YES_NO_OPTION);
                if (result == 0)
                {
                    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }

            @Override
            public void windowClosed(WindowEvent e)
            {
            }

            @Override
            public void windowActivated(WindowEvent e)
            {
            }
        });
        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // 初始化 H2
        h2Store = H2Store.getInstance();
        logger.info("==================AppInitEnd");
    }
}