//Java AWT Scrollbar Example

import java.awt.*;
public class ScrollbarAwtEx {
    ScrollbarAwtEx(){
        Frame f=new Frame("scrollbar Example");
        Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
       ScrollbarAwtEx s1 = new ScrollbarAwtEx();
    }
}
