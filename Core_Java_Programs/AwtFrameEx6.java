//Factorial of entered number in AWT

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
public class AwtFrameEx6 {
    AwtFrameEx6(){
        JFrame f=new JFrame("checkbox Example");
        final JLabel l=new JLabel("enter number : ");
        //l.setSize(400,100);
        l.setBounds(10,110,200,30);
        f.add(l);
        JTextField t1=new JTextField();
        t1.setBounds(230,110,100,30);
        f.add (t1);
        JLabel lq=new JLabel("factorial : ");
        lq.setBounds(10,300,300,50);
        f.add(lq);


        JButton b=new JButton("result");
        b.setBounds(100,200,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int fact=1;
                int a=Integer.parseInt(t1.getText());
                for(int i=1;i<=a;i++)
                {
                    fact=fact*i;
                }
                lq.setText("factorial is " + fact);
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtFrameEx6 a=new AwtFrameEx6();
    }
}
