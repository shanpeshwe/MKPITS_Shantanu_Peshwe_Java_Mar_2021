//example of event handling with anonymous class.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandelingEx4 extends Frame  {
    Button b,b2;
    Label l1; // used for non editable text
    EventHandelingEx4() {
        b=new Button("button1");
        b.setBounds(100,100,100,25);
        //event handling with anonymous class
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("button1 is clicked");
                System.out.println("button1 is clicked");
            }
        });
        add(b);

        Button b2=new Button("button2");
        b2.setBounds(100,200,100,25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("button2 is clicked");
                System.out.println("button2 is clicked");
            }
        });
        add(b2);

        l1=new Label("status :");
        l1.setBounds(50,250,200,50);
        add(l1);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventHandelingEx4 e=new EventHandelingEx4();
    }
}
