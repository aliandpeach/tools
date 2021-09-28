package com.tool.app.ui.panel;

import com.tool.app.db.Task;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/08 15:12:24
 */
public class HistoryModel<T> extends AbstractTableModel
{
    private static final long serialVersionUID = 8311934909980340891L;

    private List<T> rowList;

    public List<T> getRowList()
    {
        return rowList;
    }

    private String[] columnNames;

    public HistoryModel(List<T> rowList, String[] columnNames)
    {
        this.rowList = rowList;
        this.columnNames = new String[columnNames.length];
        System.arraycopy(columnNames, 0, this.columnNames, 0, columnNames.length);
    }

    public void setRowList(List<T> rowList)
    {
        this.rowList = rowList;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public int getRowCount()
    {
        return rowList.size();
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if (rowIndex > rowList.size() - 1)
        {
            return null;
        }

        T t = rowList.get(rowIndex);

        if (t instanceof Task)
        {
            Task task = (Task) t;
            switch (columnIndex)
            {
                case 0:
                    return task.getIndex();
                case 1:
                    return task.getFileName();
                case 2:
                    return task.getJobName();
                case 3:
                    return task.getRuleName();
                case 4:
                    return task.getSecretRate();
                case 5:
                    return task.getBreachContent();
                case 6:
                    return task.getTestDate();
                case 7:
                    return "查看详情";
            }
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int column)
    {
        switch (column)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return String.class;
            default:
                return Object.class;
        }
    }
}
