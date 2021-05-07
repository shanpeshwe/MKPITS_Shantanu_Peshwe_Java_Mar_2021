//Java AWT List Example

import java.awt.*;
public class ListAwtEx1 {
    ListAwtEx1(){
        Frame f=new Frame();
        List l1=new List(5);
        l1.setBounds(100,100,75,75);
        l1.add("itme 1");
        l1.add("itme 2");
        l1.add("itme 3");
        l1.add("itme 4");
        l1.add("itme 5");
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ListAwtEx1 l=new ListAwtEx1();
    }
}
