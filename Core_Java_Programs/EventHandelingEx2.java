//create a ui to accept 2 no. and display the resut on button click.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandelingEx2 extends  Frame implements ActionListener {
    Button b,b1,b2;
    Label l1,l2,l3; // used for non editable text
    TextField t1,t2;
    EventHandelingEx2() {
        l1=new Label("enter no1:");
        l1.setBounds(10,50,100,20);
        add(l1);
        t1=new TextField();
        t1.setBounds(120,50,100,20);
        add(t1);

        l2=new Label("enter no2:");
        l2.setBounds(10,100,100,20);
        add(l2);
        t2=new TextField();
        t2.setBounds(120,100,100,20);
        add(t2);

        b=new Button("add");
        b.setBounds(50,150,50,25);
        b.addActionListener(this); //register the component with listener
        add(b);
        b1=new Button("sub");
        b1.setBounds(100,150,50,25);
        b1.addActionListener(this); //register the component with listener
        add(b1);
        b2=new Button("mul");
        b2.setBounds(150,150,50,25);
        b2.addActionListener(this); //register the component with listener
        add(b2);

        l3=new Label("result:");
        l3.setBounds(10,200,100,20);
        add(l3);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int res=0;
        if(ae.getSource()== b ) {
            res=n1+n2;
        }
        if(ae.getSource()== b1 ) {
            res=n1-n2;
        }
        if(ae.getSource()== b2 ) {
            res=n1*n2;
        }
        l3.setText("result " + res);
    }
    public static void main(String[] args) {
        EventHandelingEx2 e=new EventHandelingEx2();
    }
}
