import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEventEx extends Frame implements KeyListener
{
    TextField tf;
    public  KeyEventEx()
    {
        Label l=new Label("enter characters");
        l.setBounds(10,30,100,30);
        add(l);
        tf=new TextField(20);
        tf.addKeyListener(this);
        tf.setBounds(120,30,100,30);
        add(tf);
        setSize(500,300);
        setLayout(null);
        setVisible(true);
    }
    public static  void main(String[] arg)
    {
        KeyEventEx k=new KeyEventEx();

    }
    public void keyPressed(KeyEvent e)
    {
        System.out.println(" recently typed character in the textfield are  " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e)
    {
        //showStatus(" recently typed character in the textfield are" );
        //  tf.setText("hello");
    }
    public void keyTyped(KeyEvent e)
    {
        //   System.out.println(" recently typed character in the textfield are : " + e.getKeyChar());
    }
}
