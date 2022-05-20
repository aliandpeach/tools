package com.tool.app.ui.panel;

import com.tool.app.App;
import com.tool.app.db.Event;
import com.tool.app.ui.component.OpacityFrame;
import com.tool.app.ui.component.PopTimingTip;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/08 15:11:18
 */
public class EventView extends JPanel
{
    private static final Logger logger = LoggerFactory.getLogger(EventView.class);

    private JScrollPane scrollPane;
    private JTable table;

    public static OpacityFrame opacityFrame;
    public static JLabel eventLabel;

    private int current = -1;

    public EventView(EventModel<com.tool.app.db.Event> eventModel)
    {
        super();
        table = new JTable(eventModel);
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
        table.setRowHeight(28);
//        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        scrollPane = new JScrollPane(table);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(renderer.CENTER);

//        opacityFrame = new OpacityFrame();
//        eventLabel = new JLabel();
//        opacityFrame.add(eventLabel);

        table.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) != 0)
                {
                    Point point = e.getPoint();
                    int rowIndex = table.rowAtPoint(point);
                    int columnIndex = table.columnAtPoint(point);
                    if (columnIndex == table.getColumnCount() - 1)
                    {
                        if (null == eventModel.getRowList() || eventModel.getRowList().size() <= rowIndex)
                        {
                            logger.error("eventModel1 rowList is null or size less than rowIndex {}", rowIndex);
                            return;
                        }
                        Event event = eventModel.getRowList().get(rowIndex);
                        App.mainPanelCenter.removeAll();
                        App.mainPanelCenter.add(App.detailPanel);
                        App.mainPanelCenter.updateUI();
                        PopTimingTip.getInstance().hideTipText();
                        App.detailPanel.clearContent();

                        String text = event.getBreachContent();
                        String matchContent = event.getMatchContent();
                        if (!StringUtils.isEmpty(matchContent))
                        {
                            for (String c : matchContent.split(";"))
                            {
                                if (!StringUtils.isNoneBlank(c))
                                {
                                    continue;
                                }
                                text = text.replace(c, "<span style=\"color: #ff5959;\">" + c + "</span>");
                            }
                        }

                        App.detailPanel.setContent("<html><body><pre style=\"word-wrap: break-word;\">" + text + "</pre></body></html>", App.statusPanel);
                    }
                    if (columnIndex == table.getColumnCount() - 2)
                    {
                        if (null == eventModel.getRowList() || eventModel.getRowList().size() <= rowIndex)
                        {
                            logger.error("eventModel2 rowList is null or size less than rowIndex {}", rowIndex);
                            return;
                        }
                        Event event = eventModel.getRowList().get(rowIndex);
                        App.mainPanelCenter.removeAll();
                        App.mainPanelCenter.add(App.failedPanel);
                        App.mainPanelCenter.updateUI();
                        PopTimingTip.getInstance().hideTipText();
                        App.failedPanel.clearContent();

                        String text = event.getBreachContent();
                        String matchContent = event.getMatchContent();
                        if (!StringUtils.isEmpty(matchContent))
                        {
                            for (String c : matchContent.split(";"))
                            {
                                if (!StringUtils.isNoneBlank(c))
                                {
                                    continue;
                                }
                                text = text.replace(c, "<span style=\"color: #ff5959;\">" + c + "</span>");
                            }
                        }

                        App.failedPanel.setContent("<html><body><pre style=\"word-wrap: break-word;\">" + (StringUtils.isEmpty(event.getFailedFiles()) ? "无" : event.getFailedFiles()) + "</pre></body></html>", App.statusPanel);
                    }
                }
                super.mouseClicked(e);
            }
        });

        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer()
        {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus, int row, int column)
            {
                if (row % 2 == 0)
                {
                    // 设置偶数行的背景颜色
                    setBackground(new Color(236, 246, 248));
                }
                else
                {
                    // 基数行的背景颜色
                    setBackground(new Color(255, 255, 255));
                }

                if (row == current)
                {
                    //鼠标悬浮行的颜色
                    setBackground(new Color(154, 221, 151));
                }

                if (column == 0 || column == table.getColumnCount() - 1)
                {
                    setHorizontalAlignment(SwingConstants.CENTER);
                }
                else
                {
                    setHorizontalAlignment(SwingConstants.LEFT); // 水平居左
                }
                setHorizontalTextPosition(SwingConstants.CENTER); // 垂直居中

                // table.getTableHeader().setBackground(new Color(206, 231, 255));//设置表头的字体色
                table.setSelectionBackground(new Color(213, 235, 243));//设置选中行的背景色
                table.setSelectionForeground(new Color(247, 81, 53));//设置选中行的前景色
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });

        table.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseExited(MouseEvent e)
            {
                current = -1;
//                opacityFrame.setVisible(false);
            }

        });

        table.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {

            }

            @Override
            public void mouseMoved(MouseEvent e)
            {
                Point point = e.getPoint();
                int rowIndex = table.rowAtPoint(point);
                int columnIndex = table.columnAtPoint(point);

                if (columnIndex == table.getColumnCount() - 1
                        || columnIndex == table.getColumnCount() - 2)
                {
                    table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }
                else
                {
                    table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }

//                if (rowIndex == current)
//                {
//                    return;
//                }
                current = rowIndex;
                if (columnIndex == 0 || columnIndex == table.getColumnCount() - 1)
                {
                    PopTimingTip.getInstance().hideTipText();
                    return;
                }
                com.tool.app.db.Event event = eventModel.getRowList().get(current);
                if (!Objects.isNull(event) && !Objects.isNull(event.getBreachContent()))
                {
//                    eventLabel.setText(event.getBreachContent());
//                    opacityFrame.setBounds(e.getXOnScreen() - 210, e.getYOnScreen() - 310, 200, 300);
//                    opacityFrame.setVisible(true);

                    PopTimingTip.getInstance().setConfigure(0, 400);
                    String text = event.getBreachContent();
                    int length = text.length();
                    String matchContent = event.getMatchContent();
                    if (!StringUtils.isEmpty(matchContent))
                    {
                        for (String c : matchContent.split(";"))
                        {
                            if (!StringUtils.isNoneBlank(c))
                            {
                                continue;
                            }
                            text = text.replace(c, "<span style=\"color: #ff5959;\">" + c + "</span>");
                        }
                    }
                    PopTimingTip.getInstance().clearTipText();
                    PopTimingTip.getInstance().showTipText(table, "<html><body style=\"color: #ffffff;font-size: 10px\">" + text + "</body></html>", length);
                    System.out.println("rowIndex" + rowIndex);
                }
            }
        });

        scrollPane.setPreferredSize(new Dimension(800, 400));
        add(scrollPane);

        scrollPane.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                PopTimingTip.getInstance().hideTipText();
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                PopTimingTip.getInstance().hideTipText();
                super.mouseExited(e);
            }
        });
    }

    static class CellRenderer extends JPanel implements TableCellRenderer
    {
        private JButton detailBtn;

        private JButton failedBtn;

        public CellRenderer(JButton detailBtn, JButton failedBtn)
        {
            setOpaque(true);
            this.detailBtn = detailBtn;
            this.failedBtn = failedBtn;
            init();
        }

        private void init()
        {
            setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
            new JButton("事件详情");
            add(detailBtn);
            add(failedBtn);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                       int row, int column)
        {
            if (row % 2 == 0)
            {
                setBackground(new Color(236, 246, 248));
            }
            else
            {
                setBackground(new Color(255, 255, 255));
            }

            if (isSelected)
            {
                setBackground(new Color(154, 221, 151));
            }
            return this;
        }
    }
}
