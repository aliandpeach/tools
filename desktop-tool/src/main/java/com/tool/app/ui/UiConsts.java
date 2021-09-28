package com.tool.app.ui;

import com.tool.app.App;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * UI相关的常量
 */
public class UiConsts
{

    /**
     * 主窗口大小
     */
    public final static int MAIN_WINDOW_X = 240;
    public final static int MAIN_WINDOW_Y = 100;
    public final static int MAIN_WINDOW_WIDTH = 885;
    public final static int MAIN_WINDOW_HEIGHT = 636;

    /**
     * 系统当前路径
     */
    public final static String CURRENT_DIR = System.getProperty("user.dir");

    public final static String CURRENT_USER_HOME = System.getProperty("user.home");

    /**
     * 主窗口图标
     */
    public final static Image IMAGE_ICON = Toolkit.getDefaultToolkit()
            .getImage(App.class.getResource("/icon/favicon.png"));

    /**
     * 主窗口背景色
     */
    public final static Color MAIN_BACK_COLOR = Color.WHITE;

    /**
     * 工具栏背景色
     */
    public final static Color TOOL_BAR_BACK_COLOR = new Color(37, 174, 96);
    /**
     * 表格线条背景色
     */
    public final static Color TABLE_LINE_COLOR = new Color(229, 229, 229);

    // 字体
    /**
     * 标题字体
     */
    public final static Font FONT_TITLE = new Font(App.resourceBundle.getString("ui.font.family"), 0, 27);
    /**
     * 普通字体
     */
    public final static Font FONT_NORMAL = new Font(App.resourceBundle.getString("ui.font.family"), 0, 13);
    /**
     * radio字体
     */
    public final static Font FONT_RADIO = new Font(App.resourceBundle.getString("ui.font.family"), 0, 15);

    /**
     * 状态 默认
     */
    public final static ImageIcon ICON_STATUS
            = new ImageIcon(App.class.getResource("/icon/dbs_check.png"));
    /**
     * 状态 激活
     */
    public final static ImageIcon ICON_STATUS_ENABLE
            = new ImageIcon(App.class.getResource("/icon/dbs_check.png"));
    /**
     * 设置 默认
     */
    public final static ImageIcon ICON_SETTING
            = new ImageIcon(App.class.getResource("/icon/dbs_settings.png"));
    /**
     * 设置 激活
     */
    public final static ImageIcon ICON_SETTING_ENABLE
            = new ImageIcon(App.class.getResource("/icon/dbs_settings.png"));
    /**
     * 历史
     */
    public final static ImageIcon ICON_HISTORY =
            new ImageIcon(App.class.getResource("/icon/dbs_history.png"));
    /**
     * 历史
     */
    public final static ImageIcon ICON_HISTORY_ENABLE =
            new ImageIcon(App.class.getResource("/icon/dbs_history.png"));
    /**
     * 停止 默认
     */
    public final static ImageIcon ICON_STOP = new ImageIcon(
            App.class.getResource("/icon/stop.png"));
    /**
     * 停止 激活
     */
    public final static ImageIcon ICON_STOP_ENABLE = new ImageIcon(
            App.class.getResource("/icon/stopEnable.png"));
    /**
     * 停止 失效
     */
    public final static ImageIcon ICON_STOP_DISABLE = new ImageIcon(
            App.class.getResource("/icon/stopDisable.png"));

    /**
     * 测试连接
     */
    public final static ImageIcon ICON_TEST_CONNECT = new ImageIcon(
            App.class.getResource("/icon/dbs_test_connect.png"));
    /**
     * 保存
     */
    public final static ImageIcon ICON_SAVE = new ImageIcon(
            App.class.getResource("/icon/dbs_save.png"));

    /**
     * PREVIOUS
     */
    public final static ImageIcon ICON_PREVIOUS = new ImageIcon(
            App.class.getResource("/icon/dbs_text_previous.png"));
    /**
     * NEXT
     */
    public final static ImageIcon ICON_NEXT = new ImageIcon(
            App.class.getResource("/icon/dbs_text_next.png"));
    /**
     * CLOSE
     */
    public final static ImageIcon ICON_CLOSE = new ImageIcon(
            App.class.getResource("/icon/dbs_text_close.png"));

    /**
     * pre page
     */
    public final static ImageIcon ICON_PREVIOUS_PAGE = new ImageIcon(
            App.class.getResource("/icon/pre_page.png"));
    /**
     * next page
     */
    public final static ImageIcon ICON_NEXT_PAGE = new ImageIcon(
            App.class.getResource("/icon/next_page.png"));

    // 样式布局相关
    /**
     * 主面板水平间隔
     */
    public final static int MAIN_H_GAP = 25;
    /**
     * 主面板Label 大小
     */
    public final static Dimension LABEL_SIZE = new Dimension(1300, 30);
    /**
     * Item Label 大小
     */
    public final static Dimension LABEL_SIZE_ITEM = new Dimension(178, 30);
    /**
     * Item text field 大小
     */
    public final static Dimension TEXT_FIELD_SIZE_ITEM = new Dimension(500, 28);
    /**
     * radio 大小
     */
    public final static Dimension RADIO_SIZE = new Dimension(1300, 60);
    /**
     * 高级选项面板Item 大小
     */
    public final static Dimension PANEL_ITEM_SIZE = new Dimension(1300, 40);


    public static Image imageShrink(java.net.URL url, String ext, int width, int height)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(url.openStream());
        }
        catch (IOException e)
        {
            return null;
        }

        Image img2 = img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
        //新建一个和Image对象相同大小的画布
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics2D graphics = image.createGraphics();
        if ("png".equalsIgnoreCase(ext))
        {
            image = graphics.getDeviceConfiguration().createCompatibleImage(image.getWidth(null), image.getHeight(null), Transparency.TRANSLUCENT);
            graphics = image.createGraphics();
        }
        graphics.drawImage(img2, 0, 0, null);
        graphics.dispose();
        return img2;
    }
}