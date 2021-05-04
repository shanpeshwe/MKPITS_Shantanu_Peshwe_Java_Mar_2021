//check box example with item listener

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxAwtEx2 {
    CheckBoxAwtEx2(){
        Frame f=new Frame();
        f.setTitle("Checkbox Example");

        final Label l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        f.add(l);

        Checkbox cb1=new Checkbox("C++");
        cb1.setBounds(100,100,50,50);
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("C++ Checkbox: "+(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        f.add(cb1);

        Checkbox cb2=new Checkbox("Java");
        cb2.setBounds(100,150,50,50);
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Java Checkbox :"+(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        f.add(cb2);

        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
    new CheckBoxAwtEx2();
    }
}
