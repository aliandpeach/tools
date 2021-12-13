import com.tool.app.db.Event;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class TableTest2 extends JFrame
{

    public TableTest2()
    {
        super("JButtonTable Example");
        String[] EVENT_TABLE_COLUMN_NAMES = new String[]{"序号", "文件名称", "命中规则", "涉密概率", "匹配内容", "操作"};
        List<Event> list = new ArrayList<>();
        Event event = new Event();
        event.setFailedFiles("failed");
        event.setTaskId("123456789");
        event.setFileName("name.txt");
        event.setMatchContent("matchxxx");
        event.setSecretRate(1.2f);
        event.setSensitivity(1);
        event.setRule("rule.");
        event.setIndex(0);
        event.setId("123456789");
        event.setEventCreateDate("1234567890");
        list.add(event);
        EventModel<Event> dm = new EventModel<>(list, EVENT_TABLE_COLUMN_NAMES);

        JTable table = new JTable(dm);
        table.getColumn("操作").setCellRenderer(new PanelRenderer());
        table.getColumn("操作").setCellEditor(new PanelEditor(new JCheckBox()));
        JScrollPane scroll = new JScrollPane(table);
        table.setRowHeight(30);
        getContentPane().add(scroll);
        setSize(400, 210);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - 200) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - 105) / 2);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        TableTest2 frame = new TableTest2();
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    static class PanelRenderer extends JPanel implements TableCellRenderer
    {
        public PanelRenderer()
        {
            setOpaque(true);
            init();
        }

        private void init()
        {
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
            add(new JButton("A"));
            add(new JButton("B"));
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                       int row, int column)
        {
            if (isSelected)
            {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            }
            else
            {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            return this;
        }
    }

    class PanelEditor extends DefaultCellEditor
    {
        private static final long serialVersionUID = -2334199328646412120L;

        protected JPanel panel;

        protected JButton button1;

        protected JButton button2;

        public PanelEditor(JCheckBox checkBox)
        {
            super(checkBox);
            panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
            button1 = new JButton("1");
            button1.setOpaque(true);
            button1.setActionCommand("Action1");
            button1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(button1, button1.getText() + ": Ouch!");
                    fireEditingStopped();
                }
            });
            button2 = new JButton("2");
            button2.setOpaque(true);
            button2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(button2, button2.getText() + ": Ouch!");
                    fireEditingStopped();
                }
            });
            panel.add(button1);
            panel.add(button2);
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                                                     int column)
        {
            if (isSelected)
            {
                button1.setForeground(table.getSelectionForeground());
                button1.setBackground(table.getSelectionBackground());
            }
            else
            {
                button1.setForeground(table.getForeground());
                button1.setBackground(table.getBackground());
            }
            return panel;
        }
    }

    static class EventModel<T> extends AbstractTableModel
    {
        private static final long serialVersionUID = 8311934909980340891L;

        private java.util.List<T> rowList;

        public java.util.List<T> getRowList()
        {
            return rowList;
        }

        private String[] columnNames;

        public EventModel(java.util.List<T> rowList, String[] columnNames)
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

            if (t instanceof com.tool.app.db.Event)
            {
                com.tool.app.db.Event event = (Event) t;
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
                    return String.class;
                default:
                    return Object.class;
            }
        }
    }
}
