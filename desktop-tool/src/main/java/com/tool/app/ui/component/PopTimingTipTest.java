package com.tool.app.ui.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;

public class PopTimingTipTest extends JFrame
{

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    PopTimingTipTest frame = new PopTimingTipTest();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PopTimingTipTest()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());
        initTip();
    }

    private void initTip()
    {
        JButton btn = null;
        MListener m = new MListener();
        for (int i = 0; i < 10; i++)
        {
            btn = new JButton();
            btn.setName("第" + i + "个按钮！");
            btn.setText("按钮" + i);
            btn.addMouseListener(m);
            contentPane.add(btn);
        }
    }

    class MListener extends MouseAdapter
    {
        public void mouseEntered(MouseEvent e)
        {
            JButton btn = (JButton) e.getSource();
            StringBuilder sb = new StringBuilder();
            sb.append("当前进入的按钮是：\n")
                    .append(btn.getName()).append("\n")
                    .append("正在进行演示自定义Tooltip！\n")
                    .append("请自行查看源码");

            PopTimingTip.getInstance().setConfigure(0, 300);
            try
            {
                PopTimingTip.getInstance().showTipText(btn, sb.toString(), sb.toString().length());
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

}
