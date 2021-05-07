//Java AWT Panel Example

import java.awt.*;
public class PanelAwtEx {
    PanelAwtEx(){
        Frame f=new Frame("panel Example");
        Panel p=new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.gray);
        Button b1=new Button("button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        Button b2=new Button("button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
        p.add(b1);
        p.add(b2);
        f.add(p);

        Panel p1=new Panel();
        p1.setBounds(250,80,200,200);
        p1.setBackground(Color.orange);
        Button b3=new Button("button 3");
        b3.setBounds(50,100,80,30);
        b3.setBackground(Color.yellow);
        Button b4=new Button("button 4");
        b4.setBounds(100,100,80,30);
        b4.setBackground(Color.green);
        p1.add(b3);
        p1.add(b4);
        f.add(p1);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        PanelAwtEx e=new PanelAwtEx();
    }
}
