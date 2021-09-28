package com.tool.app.ui.component;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/08 17:34:57
 */

import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class OpacityFrame extends JFrame
{
    public OpacityFrame()
    {
        this.setUndecorated(true); // 禁用或启用此窗体的修饰。只有在窗体不可显示时 才调用此方法
        if (com.sun.awt.AWTUtilities.isWindowOpaque(this))
        {
            com.sun.awt.AWTUtilities.setWindowOpacity(this, (float) (1 - 0.4));
        }
        else
        {
            JOptionPane.showMessageDialog(this, "系统不支持 JDK版本过低或 JRE 系统库缺损");
        }
        com.sun.awt.AWTUtilities.setWindowShape(this,
                new RoundRectangle2D.Double(0.0D, 0.0D, this.getWidth(),
                        this.getHeight(), 26.0D, 26.0D));

        this.setBounds(0, 0, 0, 0);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        new OpacityFrame();
    }
}
