//example of event handling in outside class

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandelingEx3 extends  Frame  {
    Button b;
    Label l1; // used for non editable text
    EventHandelingEx3() {
        b=new Button("button1");
        b.setBounds(100,100,100,25);
        outer out=new outer(this);
        b.addActionListener(out);
        add(b);
        l1=new Label("status :");
        l1.setBounds(50,250,200,50);
        add(l1);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventHandelingEx3 e=new EventHandelingEx3();
    }
}
//creating anohter class for event
class outer implements  ActionListener {
    EventHandelingEx3 e1;
    outer(EventHandelingEx3 e1) {
        this.e1=e1;
    }
    public void actionPerformed(ActionEvent ae) {

        e1.l1.setText("button 1 is clicked");
        System.out.println("button 1 is clicked");

    }
}
