//perform addition or subtraction using checkbox on awt

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBoxAwtEx3 {
    CheckBoxAwtEx3(){
    Frame f=new Frame("Add or Sub 2 Nos.");

    Label l1=new Label();
    l1.setBounds(100,200,300,20);
    f.add(l1);
    Label l2=new Label();
    l2.setBounds(100,250,300,20);
    f.add(l2);

    TextField t1=new TextField();
    t1.setBounds(10,50,100,20);
    f.add(t1);
    TextField t2=new TextField();
    t2.setBounds(110,50,100,20);
    f.add(t2);

    Checkbox cb1 = new Checkbox("add");
    cb1.setBounds(100,100, 50,50);
    Checkbox cb2 = new Checkbox("Sub", true);
    cb2.setBounds(100,150, 50,50);

    f.add(cb1);
    f.add(cb2);
    Button b11=new Button("result");
    b11.setBounds(10,300,100,50);
    b11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            l1.setText("");
            l2.setText("");
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int res=0;
            StringBuilder sb=new StringBuilder();
            if(cb1.getState()==true) {
                res=n1+n2;
                sb.append("add is " + res );
            }
            if(cb2.getState()==true) {
                res=n1-n2;
                sb.append("sub is " + res);
            }
            l1.setText(sb.toString());
        }
    });
    f.add(b11);

    f.setSize(400,450);
    f.setLayout(null);
    f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxAwtEx3();
    }
}
