package com.tool.app.ui.panel;

import com.tool.app.App;
import com.tool.app.db.Page;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/15 15:34:03
 */
public class PagePanel<T> extends JPanel
{
    private JLabel totalLabel;
    private JLabel totalPageLabel;
    private JTextField currentPageTextField;
    private JTextField pageSizeTextField;

    private MyIconButton previousPage;
    private MyIconButton nextPage;

    private Page<T> page;

    private PageActionCallback action;

    public String getCurrentPageValue()
    {
        return currentPageTextField.getText();
    }

    public String getPageSizeValue()
    {
        return pageSizeTextField.getText();
    }

    public Page<T> getPage()
    {
        return page;
    }

    public synchronized void setPage(Page<T> page)
    {
        this.page = page;
        if (null == page)
        {
            return;
        }
        totalPageLabel.setText(page.getTotalPage() + "");
        totalLabel.setText(page.getTotalRows() + "");
    }

    public PagePanel(PageActionCallback action)
    {
        this.action = action;

        this.setPreferredSize(new Dimension(800, 50));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
        this.setBackground(Color.WHITE);

        // 左半部分
        JPanel pageSizePanel = new JPanel();
        pageSizePanel.setPreferredSize(new Dimension(400, 40));
        pageSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 5));
        pageSizePanel.setBackground(Color.WHITE);
        this.add(pageSizePanel);
        JLabel label1 = new JLabel("每页显示：");
        label1.setPreferredSize(new Dimension(60, 25));
        pageSizeTextField = new JTextField("10");
        pageSizeTextField.setHorizontalAlignment(SwingConstants.CENTER);
        pageSizeTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        pageSizeTextField.setPreferredSize(new Dimension(40, 25));
        pageSizeTextField.setBackground(Color.WHITE);
        JLabel label3 = new JLabel("总数：");
        label3.setPreferredSize(new Dimension(40, 25));
        totalLabel = new JLabel("");
        totalLabel.setPreferredSize(new Dimension(40, 25));
        pageSizePanel.add(label1);
        pageSizePanel.add(pageSizeTextField);
        pageSizePanel.add(label3);
        pageSizePanel.add(totalLabel);

        // 右半部分
        JPanel currentPagePanel = new JPanel();
        currentPagePanel.setPreferredSize(new Dimension(400, 40));
        currentPagePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 1, 5));
        currentPagePanel.setBackground(Color.WHITE);
        this.add(currentPagePanel);


        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(45, 30));
        btnPanel.setBackground(Color.WHITE);
        btnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 7));
        currentPagePanel.add(btnPanel);

        JPanel prePagePanel = new JPanel();
        prePagePanel.setBackground(Color.WHITE);
        prePagePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        prePagePanel.setPreferredSize(new Dimension(14, 16));
        previousPage = new MyIconButton(UiConsts.ICON_PREVIOUS_PAGE, UiConsts.ICON_PREVIOUS_PAGE, UiConsts.ICON_PREVIOUS_PAGE, "");
        prePagePanel.add(previousPage);
        btnPanel.add(prePagePanel);

        JPanel nextPagePanel = new JPanel();
        nextPagePanel.setPreferredSize(new Dimension(14, 16));
        nextPagePanel.setBackground(Color.WHITE);
        nextPagePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        nextPage = new MyIconButton(UiConsts.ICON_NEXT_PAGE, UiConsts.ICON_NEXT_PAGE, UiConsts.ICON_NEXT_PAGE, "");
        nextPagePanel.add(nextPage);
        btnPanel.add(nextPagePanel);

        currentPageTextField = new JTextField("1");
        currentPageTextField.setHorizontalAlignment(SwingConstants.CENTER);
        currentPageTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        currentPageTextField.setPreferredSize(new Dimension(40, 30));
        currentPagePanel.add(currentPageTextField);

        JLabel label5 = new JLabel("/");
        label5.setPreferredSize(new Dimension(10, 30));
        currentPagePanel.add(label5);

        totalPageLabel = new JLabel("");
        totalPageLabel.setPreferredSize(new Dimension(20, 30));
        currentPagePanel.add(totalPageLabel);

        // 事件
        addListener();
    }

    public void addListener()
    {
        previousPage.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (null != page)
                {
                    int previousPage = page.previousPage();
                    currentPageTextField.setText(previousPage + "");
                    action.callback();
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
                previousPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                previousPage.setCursor(Cursor.getDefaultCursor());
            }
        });
        nextPage.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (null != page)
                {
                    int nextPage = page.nextPage();
                    if (nextPage == 0)
                    {
                        System.out.println();
                    }
                    currentPageTextField.setText(nextPage + "");
                    action.callback();
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
                nextPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                nextPage.setCursor(Cursor.getDefaultCursor());
            }
        });

        pageSizeTextField.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                pageSizeTextField.setFocusable(true);
                pageSizeTextField.grabFocus();
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                pageSizeTextField.setFocusable(true);
                pageSizeTextField.grabFocus();
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
        pageSizeTextField.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {

            }

            @Override
            public void focusLost(FocusEvent e)
            {
                String text = pageSizeTextField.getText();
                try
                {
                    int s = Integer.parseInt(text);
                    if (null != page && s != page.getPageSize() && s > 0 && s <= 100)
                    {
                        // 根据新输入的pageSize重新计算总页数
                        Page<T> temp = new Page<>(page.getTotalRows(), page.getCurrentPage(), s);
                        int _totalPage = temp.getTotalPage();
                        String _currentPageText = currentPageTextField.getText();
                        try
                        {
                            // 如果当前显示的页数大于重新计算出的总页数, 则重新给当前页赋值为 1
                            int c = Integer.parseInt(_currentPageText);
                            if (c > _totalPage || c < 1)
                            {
                                currentPageTextField.setText("1");
                            }
                        }
                        catch (Exception ex)
                        {
                            currentPageTextField.setText("1");
                        }
                        action.callback();
                    }
                }
                catch (Exception ex)
                {

                }
            }
        });

        currentPageTextField.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                currentPageTextField.setFocusable(true);
                currentPageTextField.grabFocus();
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                currentPageTextField.setFocusable(true);
                currentPageTextField.grabFocus();
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
        currentPageTextField.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {

            }

            @Override
            public void focusLost(FocusEvent e)
            {
                String text = currentPageTextField.getText();
                try
                {
                    int c = Integer.parseInt(text);
                    if (null != page && c != page.getCurrentPage() && c <= page.getTotalPage() && c >= 1)
                    {
                        action.callback();
                    }
                }
                catch (Exception ex)
                {

                }
            }
        });

        App.main.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                pageSizeTextField.setFocusable(false);
                pageSizeTextField.setFocusable(false);
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

    public interface PageActionCallback
    {
        void callback();
    }
}
