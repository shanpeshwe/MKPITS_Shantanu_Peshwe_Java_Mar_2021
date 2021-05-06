//check entered character is vovel or not

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckForVovelInAwt {
    CheckForVovelInAwt(){
        JFrame f=new JFrame("Check for Vovel");

        JLabel l1=new JLabel("Enter any Letter");
        l1.setBounds(50,50,200,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(250,50,100,20);
        f.add(t1);

        JLabel l2=new JLabel();
        l2.setBounds(50,200,300,20);
        f.add(l2);
        JButton b1=new JButton("Check");
        b1.setBounds(100,100,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            char ch;
            String s=t1.getText();
            ch=s.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                l2.setText("Character '"+ch+"' is a Vovel");
            }
            else{
                l2.setText("Character '"+ch+"' is not a Vovel");
            }
            }
        });
        f.add(b1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckForVovelInAwt();
    }
}