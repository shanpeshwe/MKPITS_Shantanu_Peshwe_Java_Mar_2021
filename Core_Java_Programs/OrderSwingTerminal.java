//design to take input of order

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class OrderSwingTerminal {
    OrderSwingTerminal(){
        JFrame f=new JFrame("Order Entry");

        JLabel l1=new JLabel("Order Number");
        l1.setBounds(50,50,100,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(250,50,100,20);
        f.add(t1);

        JLabel l2=new JLabel("Product Name");
        l2.setBounds(50,100,100,20);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(250,100,100,20);
        f.add(t2);

        JLabel l3=new JLabel("Quantity");
        l3.setBounds(50,150,100,20);
        f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(250,150,100,20);
        f.add(t3);

        JLabel l4=new JLabel("Rate");
        l4.setBounds(50,200,100,20);
        f.add(l4);
        JTextField t4=new JTextField();
        t4.setBounds(250,200,100,20);
        f.add(t4);

        JTextArea ta5=new JTextArea();
        ta5.setBounds(50,300,300,200);
        f.add(ta5);
        JButton b1=new JButton("Order");
        b1.setBounds(100,250,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                sb.append(l1.getText()+" : "+t1.getText()+"\n");
                sb.append(l2.getText()+" : "+t2.getText()+"\n");
                sb.append(l3.getText()+" : "+t3.getText()+"\n");
                sb.append(l4.getText()+" : "+t4.getText()+"\n");
                int t = Integer.parseInt(t3.getText())*Integer.parseInt(t4.getText());
                sb.append("Total Amount : "+t);
                ta5.setText(sb.toString());
            }
        });
        f.add(b1);

        f.setSize(500, 700);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new OrderSwingTerminal();
    }
}
