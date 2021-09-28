package com.tool.app.ui.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/03 09:57:36
 */
public class JsToggleButton extends JPanel
{
    public Color bgColor = new Color(0xFFFFFF);
    public Color lineColor = new Color(0xFFFFFF);
    public Color darkColor = new Color(0xE1E1E1);
    public Color lightColor = new Color(0x33B4FF);

    public int padding = 2;

    private boolean selected = true;

    public JsToggleButton()
    {
        this.addMouseListener(new MouseListener()
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

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = width;
        int h = width / 2;
        if (h > height)
        {
            h = height;
            w = height * 2;
        }
        Rectangle r = new Rectangle((width - 2) / 2, (height - h) / 2, w, h);
        Rectangle r1 = new Rectangle(r.x, r.y, r.width / 2, r.height);
        Rectangle r2 = new Rectangle(r.x + r.width / 2, r.y, r.width / 2, r.height);
        Shape arc1 = new Arc2D.Double(r1, 90, 100, Arc2D.OPEN);
        Shape arc2 = new Arc2D.Double(r2, 270, 180, Arc2D.OPEN);

        Path2D outline = new Path2D.Double();
        outline.append(arc1.getPathIterator(null), false);
        outline.append(arc2.getPathIterator(null), true);
        outline.closePath();
        g2d.setPaint(lineColor);
        g2d.draw(outline);
        g2d.setPaint(bgColor);
        g2d.fill(outline);

        if (selected)
        {
        }
        else
        {

        }
    }

    private void drawCircleInside(Graphics2D g2d, Rectangle rect, int deflate, Paint lineColor, Paint fillColor)
    {
        Rectangle r = new Rectangle(rect);
        r.x += deflate;
        r.y += deflate;

        r.width -= (deflate * 2);
        r.height -= (deflate * 2);

        Shape shape = new Ellipse2D.Double(r.x, r.y, r.width, r.height);

        g2d.setPaint(lineColor);
        g2d.draw(shape);

        g2d.setPaint(fillColor);
        g2d.fill(shape);
    }

    public interface StateListener
    {
        void stateChanged(Object source);
    }

    private StateListener stateListener;

    public void setStateListener(StateListener listener)
    {
        this.stateListener = listener;
    }

    private void onMouseClicked()
    {
        toggle();
        if (stateListener != null)
        {
            stateListener.stateChanged(this);
        }
    }

    public boolean isSelected()
    {
        return this.selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
        repaint();
    }

    public void toggle()
    {
        this.selected = !this.selected;
        repaint();
    }
}
