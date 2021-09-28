package com.tool.app.ui.component;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

public class MyJTable extends JTable
{
    /*
     * 自定义类MyJTable,调用时只需new MyTable并将行和列传入构造方法中即可
     */
    private static final long serialVersionUID = 1L;

    static int current = -1;

    public MyJTable(final Vector rowData, Vector columnNames)
    {
        super(new DefaultTableModel(rowData, columnNames));
        // setAutoCreateRowSorter(true);// 调出三角块表格排序
        // setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// 添加表格下滚动条
        /*调用表格的渲染*/
        for (int i = 1; i < this.getColumnCount(); i++)
        {
            this.setDefaultRenderer(this.getColumnClass(i), new RoutineColor());

        }

        //给表格添加鼠标退出表格的监听，鼠标退出表格，使其颜色还原
        this.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseExited(MouseEvent e)
            {
                for (int i = 0; i < rowData.size(); i++)
                {
                    if (i == current)
                    {
                        setBackground(Color.yellow);
                        break;
                    }

                }
                setBackground(Color.black);
                current = -1;
            }

        });

        //给表格添加鼠标移动的监听，鼠标移动刷新表格颜色
        this.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                Point p = e.getPoint();
                current = rowAtPoint(p);

                for (int i = 0; i < rowData.size(); i++)
                {
                    if (i == current)
                    {
                        setBackground(Color.yellow);
                        break;
                    }

                }
                setBackground(Color.black);
            }
        });

        //使表格表头的字体居中，若想居左居右，只要改变其属性
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) this
                .getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(renderer.CENTER);

    }

    //定义表格不可编辑的方法
    public boolean isCellEditable(int row, int column)
    {
        return false;
    }

    @Override
    public TableCellRenderer getDefaultRenderer(Class<?> columnClass)
    {
        DefaultTableCellRenderer tableRenderer = (DefaultTableCellRenderer) super.getDefaultRenderer(columnClass);
        // 设置单元格内容居中显示
        tableRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        return tableRenderer;
    }

    public static class RoutineColor extends DefaultTableCellRenderer
    {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column)
        {
            if (row % 2 == 0)
            {
                // 设置偶数行的背景颜色
                this.setBackground(new Color(236, 246, 248));
            }
            else
            {
                // 基数行的背景颜色
                this.setBackground(new Color(255, 255, 255));
            }

            if (row == MyJTable.current)
            {
                //鼠标悬浮行的颜色
                this.setBackground(new Color(154, 221, 151));
            }

            /*继承Label类的方法, 设置table的单元格对齐方式*/
            setHorizontalAlignment((int) Component.CENTER_ALIGNMENT); // 水平居中
            setHorizontalTextPosition((int) Component.CENTER_ALIGNMENT); // 垂直居中

            // table.getTableHeader().setBackground(new Color(206, 231, 255));//设置表头的字体色
            table.setSelectionBackground(new Color(213, 235, 243));//设置选中行的背景色
            table.setSelectionForeground(new Color(247, 81, 53));//设置选中行的前景色
            return super.getTableCellRendererComponent(table, value, isSelected,
                    hasFocus, row, column);
        }

        // 表格列根据内容调整大小
        public static void adjustTableColumnWidths(JTable table)
        {
            JTableHeader header = table.getTableHeader(); // 表头
            int rowCount = table.getRowCount(); // 表格的行数
            TableColumnModel cm = table.getColumnModel(); // 表格的列模型

            for (int i = 0; i < cm.getColumnCount(); i++)
            { // 循环处理每一列
                TableColumn column = cm.getColumn(i); // 第i个列对象
                int width = (int) header.getDefaultRenderer()
                        .getTableCellRendererComponent(table,
                                column.getIdentifier(), false, false, -1, i)
                        .getPreferredSize().getWidth(); // 用表头的绘制器计算第i列表头的宽度
                for (int row = 0; row < rowCount; row++)
                { // 循环处理第i列的每一行，用单元格绘制器计算第i列第row行的单元格度
                    int preferedWidth = (int) table.getCellRenderer(row, i)
                            .getTableCellRendererComponent(table,
                                    table.getValueAt(row, i), false, false, row, i)
                            .getPreferredSize().getWidth();
                    width = Math.max(width, preferedWidth); // 取最大的宽度
                }
                column.setPreferredWidth(width + table.getIntercellSpacing().width); // 设置第i列的首选宽度
            }

            table.doLayout(); // 按照刚才设置的宽度重新布局各个列
        }
    }
}

