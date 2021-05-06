//use swing to show area and circumference of a circle of entered radius

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class AreaCircumOfCircleBySwing {
    AreaCircumOfCircleBySwing(){
        JFrame f=new JFrame("Area and Circumference of Circle");

        JLabel l1=new JLabel("Enter radius of circle");
        l1.setBounds(50,50,200,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(250,50,100,20);
        f.add(t1);

        Checkbox c1=new Checkbox("Area");
        c1.setBounds(100,75,50,50);
        f.add(c1);

        Checkbox c2=new Checkbox("Circumference",true);
        c2.setBounds(200,75,100,50);
        f.add(c2);

        JLabel l2=new JLabel();
        l2.setBounds(50,200,300,20);
        f.add(l2);
        JButton b1=new JButton("calculate");
        b1.setBounds(100,150,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float area = 0.0f;
                float circumference = 0.0f;
                float pi = 3.14f;
                int r = Integer.parseInt(t1.getText());
                StringBuilder sb = new StringBuilder();
                if(c1.getState()==true){
                    area=pi*r*r;
                    sb.append("Area is : "+area);
                }
                if(c2.getState()==true){
                    circumference=pi*2*r;
                    sb.append(" and Circumference is : "+circumference);
                }
                l2.setText(sb.toString());
            }
        });
        f.add(b1);

                f.setSize(400, 300);
                f.setLayout(null);
                f.setVisible(true);
            }
            public static void main(String[] args) {
                new AreaCircumOfCircleBySwing();
    }
}