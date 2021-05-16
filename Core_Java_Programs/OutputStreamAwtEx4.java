//awt example to write data to file

import  java.io.*;
import  java.awt.*;
import  java.awt.event.*;

public class OutputStreamAwtEx4 extends  Frame{
    Button b1;
    Label l1,l2,l3;
    TextField tf,tf1;
    OutputStreamAwtEx4() {
        l1=new Label("enter your name");
        l1.setBounds(10,40,100,20);
        add(l1);
        tf=new TextField();
        tf.setBounds(120,40,200,20);
        add(tf);
        l3=new Label("enter email");
        l3.setBounds(10,80,100,20);
        add(l3);
        tf1=new TextField();
        tf1.setBounds(120,80,200,20);
        add(tf1);


        l2=new Label("status");
        l2.setBounds(10,160,200,20);
        add(l2);

        b1=new Button("save");
        b1.setBounds(100,120,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="Name : " +tf.getText();

                String n1="\nEmail : " +tf1.getText();
                try {
                    FileOutputStream fo = new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\OutputStreamAwtEx4.txt");
                    byte b[]=n.getBytes();
                    fo.write(b);
                    b=n1.getBytes();
                    fo.write(b);
                    fo.close();
                    l2.setText("success");
                }catch (Exception ee) {
                System.out.println(ee);
                }
            }
        });
        add(b1);

        setSize(350,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        OutputStreamAwtEx4 ex=new OutputStreamAwtEx4();
    }
}
