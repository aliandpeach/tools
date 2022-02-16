package com.tool.app.ui.panel;

import com.tool.app.App;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;
import com.tool.app.ui.component.WarpTextPane;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/09 17:36:19
 */
public class FailedPanel extends JPanel
{
    private JPanel titlePanel;

    private JScrollPane scrollPane;

    private WarpTextPane detailPane;

    private MyIconButton closeBtn;
    private JComponent from;

    private int currentPos = 0;

    public FailedPanel()
    {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setBackground(Color.WHITE);

        JPanel lower = new JPanel();
        lower.setPreferredSize(new Dimension(800, 540));
        lower.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        lower.setBackground(Color.WHITE);

        titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(800, 40));
        titlePanel.setBackground(Color.WHITE);
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
        lower.add(titlePanel);

        JLabel labelTitle = new JLabel("失败文件详情");
        labelTitle.setFont(new Font("微软雅黑", Font.PLAIN, 17));

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 2));
        labelPanel.setPreferredSize(new Dimension(120, 30));
        labelPanel.setBackground(new Color(242, 242, 242));
//        labelPanel.setBorder(new LineBorder(Color.BLACK));
        labelPanel.add(labelTitle);

        titlePanel.add(labelPanel);


        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(670, 40));
        btnPanel.setBackground(Color.WHITE);
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        titlePanel.add(btnPanel);

        JPanel btnPreviousPanel = new JPanel();
        btnPreviousPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
        btnPreviousPanel.setPreferredSize(new Dimension(94, 40));
        btnPreviousPanel.setBackground(Color.WHITE);

        JPanel btnNextPanel = new JPanel();
        btnNextPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
        btnNextPanel.setPreferredSize(new Dimension(94, 40));
        btnNextPanel.setBackground(Color.WHITE);

        JPanel btnClosePanel = new JPanel();
        btnClosePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
        btnClosePanel.setPreferredSize(new Dimension(33, 40));
        btnClosePanel.setBackground(Color.WHITE);

        closeBtn = new MyIconButton(UiConsts.ICON_CLOSE, UiConsts.ICON_CLOSE, UiConsts.ICON_CLOSE, "");
        btnClosePanel.add(closeBtn);

        btnPanel.add(btnPreviousPanel);
        btnPanel.add(btnNextPanel);
        btnPanel.add(btnClosePanel);


        JPanel textPanel = new JPanel();
        detailPane = new WarpTextPane();
        detailPane.setBorder(null);
        detailPane.setContentType("text/html");
        detailPane.setBackground(new Color(240, 240, 240));
        detailPane.setPreferredSize(new Dimension(800, 480));

        scrollPane = new JScrollPane(detailPane);
        scrollPane.setBorder(null);
        scrollPane.setPreferredSize(new Dimension(800, 480));
        textPanel.add(scrollPane);
        lower.add(textPanel);
        this.add(lower);

        addListener();
    }

    public void setContent(String text, JComponent from)
    {
        this.from = from;
        detailPane.setEditable(false);
        HTMLDocument doc = (HTMLDocument) detailPane.getDocument();
        HTMLEditorKit editorKit = (HTMLEditorKit) detailPane.getEditorKit();
        try
        {
            editorKit.insertHTML(doc, doc.getLength(), text, 0, 0, null);
        }
        catch (Exception e)
        {
        }
        scrollPane.getVerticalScrollBar().setValue(1);
    }

    public void clearContent()
    {
        detailPane.setEditable(false);
        detailPane.setText("");
    }

    private void addListener()
    {
        closeBtn.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                App.mainPanelCenter.removeAll();
                App.mainPanelCenter.add(null == from ? App.statusPanel : from, BorderLayout.CENTER);
                App.mainPanelCenter.updateUI();
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
                closeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                closeBtn.setCursor(Cursor.getDefaultCursor());
            }
        });
    }
}
