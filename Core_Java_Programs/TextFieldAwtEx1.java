//example of text field in awt

import java.awt.*;
import java.awt.event.*;

public class TextFieldAwtEx1 extends Frame{
    TextField tf1,tf2,tf3;
    Button b1,b2;

    TextFieldAwtEx1(){
        tf1=new TextField();
        tf1.setBounds(50,50,150,20);
        tf2=new TextField();
        tf2.setBounds(50,100,150,20);
        tf3=new TextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);

        b1=new Button("+");
        b1.setBounds(50,200,50,50);
        b2=new Button("-");
        b2.setBounds(120,200,50,50);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(tf1.getText());
                int b= Integer.parseInt(tf2.getText());
                int c=0;
                c=a+b;
                tf3.setText(String.valueOf(c));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a= Integer.parseInt(tf1.getText());
                int b= Integer.parseInt(tf2.getText());
                int c=0;
                c=a-b;
                tf3.setText(String.valueOf(c));
            }
        });
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldAwtEx1();
    }
}
