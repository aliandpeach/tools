package com.tool.app.ui.listener;

import com.tool.app.App;

import javax.swing.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.util.List;

/**
 * 拖拽目标监听器实现
 */
public class DropTargetListenerImpl implements DropTargetListener
{
    /**
     * 用于显示拖拽的数据
     */
    private final JPanel panel;

    public DropTargetListenerImpl(JPanel panel)
    {
        this.panel = panel;
    }

    @Override
    public void dragEnter(DropTargetDragEvent dtde)
    {
        System.out.println("dragEnter: 拖拽目标进入组件区域");
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde)
    {
        System.out.println("dragOver: 拖拽目标在组件区域内移动");
    }

    @Override
    public void dragExit(DropTargetEvent dte)
    {
        System.out.println("dragExit: 拖拽目标离开组件区域");
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde)
    {
        System.out.println("dropActionChanged: 当前 drop 操作被修改");
    }

    @Override
    public void drop(DropTargetDropEvent dtde)
    {
        boolean isAccept = false;
        String path = null;
        try
        {
            if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
            {
                if (App.statusPanel.isRunning.get())
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.running"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // 接收拖拽目标数据
                dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);

                dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);

                List<File> files = (List<File>) dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);

                if (files.size() > 0)
                {
                    File file = files.get(0);
                    if (file.isFile())
                    {
//                        textArea.setText("");
//                        textArea.append(file.getAbsolutePath() + "\n");
                        isAccept = true;
                        path = file.getAbsolutePath();
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        if (isAccept)
        {
            dtde.dropComplete(true);
            App.statusPanel.startTest(path);
        }
    }
}
