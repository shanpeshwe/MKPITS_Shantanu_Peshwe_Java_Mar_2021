//adapter class demo

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Adapterdemo extends Frame{
    public Adapterdemo()
    {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Adapterdemo ad=new Adapterdemo();
    }
}
class MyMouseAdapter extends MouseAdapter
{
    Adapterdemo adapterdemo;
    public MyMouseAdapter(Adapterdemo adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouseclicked event
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouse clicked" + me.getX() + "," + me.getY());
    }
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
    Adapterdemo adapterdemo;
    public MyMouseMotionAdapter(Adapterdemo adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    //handle mouse dragged
    public void mouseDragged(MouseEvent me)
    {
        System.out.println("mouse dargged");
    }
}