//salary breakup snow using AWT

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryBreakupUsingAwt {
    SalaryBreakupUsingAwt(){
        JFrame f=new JFrame("Calculation for Salary Breakup");
        f.setSize(600,500);

        JLabel l1=new JLabel("Employee Name");
        l1.setBounds(50,50,200,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(150,50,100,20);
        f.add(t1);

        JLabel l2=new JLabel("Designation");
        l2.setBounds(50,75,200,20);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(150,75,100,20);
        f.add(t2);

        JLabel l3=new JLabel("Basic Salary");
        l3.setBounds(50,100,200,20);
        f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(150,100,100,20);
        f.add(t3);

        JTextArea l6=new JTextArea();
        l6.setBounds(50,200,300,200);
        f.add(l6);
        JButton b6=new JButton("Result");
        b6.setBounds(150,125,100,50);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                float hra,da,tsalary,bsalary;
                bsalary=(float)Integer.parseInt(t3.getText());
                hra=(float)(0.25f*bsalary);
                da=(float)(0.35f*bsalary);
                tsalary=bsalary+hra+da;
                sb.append(l1.getText()+" : "+t1.getText()+"\n");
                sb.append(l2.getText()+" : "+t2.getText()+"\n");
                sb.append(l3.getText()+" : "+t3.getText()+"\n");
                sb.append("HRA : "+hra+"\n");
                sb.append("DA : "+da+"\n");
                sb.append("Total Salary : "+tsalary);
                l6.setText(sb.toString());
            }
        });
        f.add(b6);

        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new SalaryBreakupUsingAwt();
    }
}