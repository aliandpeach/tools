package com.tool.app.ui.panel;

import com.tool.app.db.Event;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/08 15:12:24
 */
public class EventModel<T> extends AbstractTableModel
{
    private static final long serialVersionUID = 8311934909980340891L;

    private List<T> rowList;

    public List<T> getRowList()
    {
        return rowList;
    }

    private String[] columnNames;

    public EventModel(List<T> rowList, String[] columnNames)
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
        T t = rowList.get(rowIndex);

        if (t instanceof Event)
        {
            Event event = (Event) t;
            switch (columnIndex)
            {
                case 0:
                    return event.getIndex();
                case 1:
                    return event.getFileName();
                case 2:
                    return event.getRule();
                case 3:
                    return event.getSecretRate();
                case 4:
                    return event.getBreachContent();
                case 5:
                    return StringUtils.isEmpty(event.getFailedFiles()) ? "无" : event.getFailedFiles();
                case 6:
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
                return String.class;
            default:
                return Object.class;
        }
    }
}
