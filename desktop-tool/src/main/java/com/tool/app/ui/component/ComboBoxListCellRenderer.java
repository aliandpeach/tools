package com.tool.app.ui.component;

import javax.swing.*;
import java.awt.*;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/03/18 17:09:46
 */
public class ComboBoxListCellRenderer extends DefaultListCellRenderer
{

    @Override
    public Component getListCellRendererComponent(
            JList<?> list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus)
    {
        Component label = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        label.setPreferredSize(new Dimension(200, 25));
        return this;
    }
}
