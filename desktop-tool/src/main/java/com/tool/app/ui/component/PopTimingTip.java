package com.tool.app.ui.component;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopTimingTip extends JComponent
{
    private JScrollPane scrollPane;

    private JPanel mainPanel;
    private WarpTextPane textComponent;
    private TipListener tipListener;
    private Component tipParent;
    private int initTime = 0;
    private JLayeredPane windowLayer;//窗口的遮罩层，不能随便修改，只作父对象应用
    private final Point constPoint = new Point(0, 0);//距离鼠标常量，防止鼠标遮挡
    private Timer tipTimer;
    private TipTimerListener tipTimerListener;
    private static PopTimingTip popTimingTip;
    private JRootPane rootPane;//当前根面板
    private Dimension curTipSize;
    private int curConType;

    private final int maxWidth = 220;
    private final int rowHeight = 25;

    private String horizontal = "0"; // 鼠标的上下
    private String vertical = "0";   // 鼠标的左右

    /**
     * 单例外部不允许初始化
     */
    private PopTimingTip()
    {
        super();
        initTip();
    }

    public static PopTimingTip getInstance()
    {
        if (popTimingTip == null)
        {
            popTimingTip = new PopTimingTip();
        }
        return popTimingTip;
    }

    private void initTip()
    {
        this.setLayout(new BorderLayout());
        this.setOpaque(false);
        //this.setBorder(null);
        this.setVisible(false);
        textComponent = new WarpTextPane();
        textComponent.setContentType("text/html");
        textComponent.setBorder(new LineBorder(Color.BLACK));
        textComponent.setBackground(new Color(245, 245, 245));
        mainPanel = new JPanel(new BorderLayout());
//        mainPanel.add(textComponent, BorderLayout.CENTER);

        scrollPane = new JScrollPane(textComponent);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI(){
            @Override
            protected void configureScrollBarColors()
            {
                trackColor = Color.black;
                setThumbBounds(0, 0, 3, 10);
            }

            /**
             * 设置滚动条的宽度
             */
            @Override
            public Dimension getPreferredSize(JComponent c)
            {
                c.setPreferredSize(new Dimension(4, 0));
                return super.getPreferredSize(c);
            }

            public void paintTrack(Graphics g, JComponent c, Rectangle trackBounds)
            {
                Graphics2D g2 = (Graphics2D) g;
                GradientPaint gp = null;
                if (this.scrollbar.getOrientation() == JScrollBar.VERTICAL)
                {
                    //设置画笔
                    gp = new GradientPaint(0, 0, new Color(80, 80, 80), trackBounds.width, 0, new Color(80, 80, 80));
                }
                if (this.scrollbar.getOrientation() == JScrollBar.HORIZONTAL)
                {

                    gp = new GradientPaint(0, 0, new Color(80, 80, 80), trackBounds.height, 0, new Color(80, 80, 80));
                }
                g2.setPaint(gp);
                //填充Track
                g2.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);

                //绘制Track的边框
//                g2.setColor(new Color(175, 155, 95));
//                g2.drawRect(trackBounds.x, trackBounds.y, trackBounds.width - 1, trackBounds.height - 1);

                if (trackHighlight == BasicScrollBarUI.DECREASE_HIGHLIGHT)
                    this.paintDecreaseHighlight(g);

                if (trackHighlight == BasicScrollBarUI.INCREASE_HIGHLIGHT)
                    this.paintIncreaseHighlight(g);
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds)
            {
                // 把绘制区的x，y点坐标定义为坐标系的原点
                // 这句一定一定要加上啊，不然拖动就失效了
                g.translate(thumbBounds.x, thumbBounds.y);

                // 设置把手颜色
                g.setColor(new Color(230, 230, 250));
                // 画一个圆角矩形
                // 这里面前四个参数就不多讲了，坐标和宽高
                // 后两个参数需要注意一下，是用来控制角落的圆角弧度
                // g.drawRoundRect(0, 0, 5, thumbBounds.height - 1, 5, 5);
                // 消除锯齿
                Graphics2D g2 = (Graphics2D) g;
                RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.addRenderingHints(rh);
                // 半透明
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                // 设置填充颜色，这里设置了渐变，由下往上
                // g2.setPaint(new GradientPaint(c.getWidth() / 2, 1, Color.GRAY,
                // c.getWidth() / 2, c.getHeight(), Color.GRAY));
                // 填充圆角矩形
                g2.fillRoundRect(0, 0, 40, thumbBounds.height - 1, 5, 5);
            }

            @Override
            protected JButton createIncreaseButton(int orientation)
            {
                JButton button = new JButton();
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                button.setBorder(null);
                return button;
            }

            @Override
            protected JButton createDecreaseButton(int orientation)
            {
                JButton button = new JButton();
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                button.setFocusable(false);
                button.setBorder(null);
                return button;
            }
        });
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        this.add(mainPanel, BorderLayout.CENTER);

        tipTimerListener = new TipTimerListener();
        tipTimerListener.state = 0;

        tipListener = new TipListener();
        tipTimer = new Timer(0, tipTimerListener);
        tipTimer.setRepeats(false);

        curTipSize = new Dimension(0, 0);
    }

    public void showTip()
    {
        this.setVisible(true);
    }

    public void clearTipText()
    {
        if (null == textComponent)
        {
            return;
        }
        textComponent.setText("");
    }

    public void hideTipText()
    {
        setTipState(1);
    }

    /**
     * 为某个组件设置tip
     *
     * @param parent 显示tooltip的对象
     * @param text
     */
    public void showTipText(JComponent parent, String text, int originalTextLength)
    {
        if (parent == null)
        {
            return;
        }
        //如果进入了新的组件，先从旧组件中移除侦听防止泄漏
        if (tipParent != null && tipParent != parent)
        {
            tipParent.removeMouseListener(tipListener);
            tipParent.removeMouseMotionListener(tipListener);
        }
        tipParent = parent;

        rootPane = parent.getRootPane();
        //防止异常获取不了根面板的情况
        if (rootPane == null)
        {
            return;
        }

        JLayeredPane layerPane = rootPane.getLayeredPane();
        //先从旧面板中移除tip
        if (windowLayer != null && windowLayer != layerPane)
        {
            windowLayer.remove(this);
        }
        windowLayer = layerPane;
        //防止还有没有移除侦听的组件
        tipParent.removeMouseListener(tipListener);
        tipParent.removeMouseMotionListener(tipListener);
        layerPane.remove(this);
        //放置tip在遮罩窗口顶层
        layerPane.add(this, JLayeredPane.POPUP_LAYER);
        //窗口遮罩层添加侦听
        tipParent.addMouseMotionListener(tipListener);
        tipParent.addMouseListener(tipListener);
        //测试侦听器数量
        //System.out.println(tipParent.getMouseListeners().length + " " + tipParent.getMouseMotionListeners().length);
        int h = (int) Math.ceil((double) originalTextLength / 18d) * rowHeight;
        System.out.println("originalTextLength : " + originalTextLength + ", " + "height : " + h);
        textComponent.setPreferredSize(new Dimension(maxWidth, Math.min(h, 300)));
        scrollPane.setPreferredSize(new Dimension(maxWidth, Math.min(h, 300)));
//        textComponent.setText(text);

        textComponent.setEditable(false);
        HTMLDocument doc = (HTMLDocument)textComponent.getDocument();
        HTMLEditorKit editorKit = (HTMLEditorKit)textComponent.getEditorKit();
        try
        {
            editorKit.insertHTML(doc, doc.getLength(), text, 0, 0, null);
        }
        catch (Exception e)
        {
        }

        textComponent.setBackground(new Color(97, 97, 97));
        curTipSize = scrollPane.getPreferredSize();
        mainPanel.doLayout();
        //this.setPreferredSize(textComponent.getPreferredSize());
        System.out.println("scrollPane.getPreferredSize() : " + scrollPane.getPreferredSize());
        this.setSize(scrollPane.getPreferredSize().width, scrollPane.getPreferredSize().height);

        scrollPane.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {

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
                //System.out.println();
            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });
    }

    /**
     * 初始化toolTip
     */
    public void setConfigure(int contentType, int initTime)
    {
        if (contentType == 0 && curConType != contentType)
        {
            textComponent.setContentType("text/html");
        }
        else if (contentType == 1 && curConType != contentType)
        {
            textComponent.setContentType("text/plain");
        }
        curConType = contentType;
        this.initTime = initTime;
        //this.vanishTime = vanishTime;
        //this.lastTime = lastTime;
    }

    /**
     * 坐标转换，标签跟随鼠标移动
     */
    private void followWithMouse(MouseEvent e)
    {
        if (windowLayer == null)
        {
            return;
        }

        Point screenPoint = e.getLocationOnScreen();

        SwingUtilities.convertPointFromScreen(screenPoint, windowLayer);

        int rx = rootPane.getX();
        int ry = rootPane.getY();
        int rw = rootPane.getWidth();
        int rh = rootPane.getHeight();

        int newLocationX = screenPoint.x;
        int newLocationY = screenPoint.y;

        Dimension tipSize = scrollPane.getPreferredSize();

        if (newLocationX < tipSize.width + constPoint.x)
        {
            newLocationX = newLocationX + constPoint.x;
            vertical = "1";
        }
        else
        {
            newLocationX = newLocationX - tipSize.width - constPoint.x;
            vertical = "0";
        }
        if (newLocationY < tipSize.height + constPoint.y)
        {
            newLocationY = newLocationY + constPoint.y;
            horizontal = "1";
        }
        else
        {
            newLocationY = newLocationY - tipSize.height - constPoint.y;
            horizontal = "0";
        }

        this.setLocation(newLocationX, newLocationY);
        // textComponent.getPreferredSize()在html初始化计算的时候有问题，重算一次
//        if (!curTipSize.equals(textComponent.getPreferredSize()))
//        {
//            this.setSize(textComponent.getPreferredSize().width, textComponent.getPreferredSize().height);
//        }
    }

    private void setTipState(int state)
    {
        tipTimer.stop();//停止上一次的任务
        if (state == 0)
        {
            //进入组件，延迟显示
            tipTimerListener.state = 0;
            tipTimer.setInitialDelay(initTime);
            tipTimer.start();
        }
        else if (state == 1)
        {
            //鼠标移出，组件消失
            tipTimerListener.state = 1;
            PopTimingTip.this.setVisible(false);
        }
    }

    private class TipTimerListener implements ActionListener
    {
        int state;

        public void actionPerformed(ActionEvent e)
        {
            if (state == 0)
            {
                PopTimingTip.this.setVisible(true);
            }
        }
    }

    /**
     * 鼠标移除后及时清除侦听防止侦听器溢出
     */
    private void removeTipAndListener()
    {
        if (tipParent == null)
        {
            return;
        }
        tipParent.removeMouseListener(tipListener);
        tipParent.removeMouseMotionListener(tipListener);
        if (windowLayer != null)
        {
            windowLayer.remove(this);
        }
    }

    private class TipListener extends MouseAdapter
    {
        public void mouseEntered(MouseEvent e)
        {
            setTipState(0);
            followWithMouse(e);
        }

        /**
         * 鼠标移出对象时，移除对象的侦听和ToolTip
         *
         * 鼠标移动到气泡的panel上也会触发事件
         */
        public void mouseExited(MouseEvent e)
        {
            Point point = e.getLocationOnScreen();
            SwingUtilities.convertPointFromScreen(point, scrollPane);
            System.out.println(point);
            if (point.getX() < scrollPane.getWidth() && point.getY() < scrollPane.getHeight()
                    && (vertical + horizontal).equals("00"))
            {
                System.out.println("左上靠近");
                return;
            }
            if (point.getX() < scrollPane.getWidth() && point.getY() > 0
                    && (vertical + horizontal).equals("01"))
            {
                System.out.println("左下靠近");
                return;
            }
            if (point.getX() > 0 && point.getY() < scrollPane.getHeight()
                    && (vertical + horizontal).equals("10"))
            {
                System.out.println("右上靠近");
                return;
            }
            if (point.getX() > 0 && point.getY() > 0
                    && (vertical + horizontal).equals("11"))
            {
                System.out.println("右下靠近");
                return;
            }

            setTipState(1);
            followWithMouse(e);
            removeTipAndListener();
        }

        //在组件上移动时触发
        public void mouseMoved(MouseEvent e)
        {
            if (tipParent instanceof JTable)
            {
                JTable table = (JTable) tipParent;
                Point point = e.getPoint();
                int rowIndex = table.rowAtPoint(point);
                int columnIndex = table.columnAtPoint(point);
                if (columnIndex == 0 || columnIndex == table.getColumnCount() - 1)
                {
                    PopTimingTip.getInstance().hideTipText();
                    return;
                }
            }
            setTipState(0);
            followWithMouse(e);
            System.out.println("tip mouse moved");
        }

        public void mouseClicked(MouseEvent e)
        {
            if ((e.getModifiers() & MouseEvent.BUTTON3_MASK) != 0)
            {
                //右键点击，tip消失
                setTipState(1);
                followWithMouse(e);
                removeTipAndListener();
            }
            if ((e.getModifiers() & MouseEvent.BUTTON2_MASK) != 0)
            {
            }
        }
    }
}
