//input for 3 sub marks and get total, per and grade using swing terminal

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalPerGradeUsingSwing {
    TotalPerGradeUsingSwing(){
        JFrame f=new JFrame("Calculate total, percentage and grade");
        f.setSize(600,600);

        JLabel l1=new JLabel("Name");
        l1.setBounds(50,50,100,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(150,50,100,20);
        f.add(t1);

        JLabel l2=new JLabel("Roll No.");
        l2.setBounds(50,75,100,20);
        f.add(l2);
        JTextField t2=new JTextField();
        t2.setBounds(150,75,100,20);
        f.add(t2);

        JLabel l3=new JLabel("Sub1");
        l3.setBounds(50,100,100,20);
        f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(150,100,100,20);
        f.add(t3);

        JLabel l4=new JLabel("Sub2");
        l4.setBounds(50,125,100,20);
        f.add(l4);
        JTextField t4=new JTextField();
        t4.setBounds(150,125,100,20);
        f.add(t4);

        JLabel l5=new JLabel("Sub3");
        l5.setBounds(50,150,100,20);
        f.add(l5);
        JTextField t5=new JTextField();
        t5.setBounds(150,150,100,20);
        f.add(t5);

        JTextArea l6=new JTextArea();
        l6.setBounds(50,300,300,300);
        f.add(l6);
        JButton b6=new JButton("Result");
        b6.setBounds(150,200,100,50);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int total;
                total=Integer.parseInt(t3.getText())+Integer.parseInt(t4.getText())+Integer.parseInt(t5.getText());
                float per;
                per=(float)(total/300.0f)*100.0f;
                sb.append(l1.getText()+" : "+t1.getText()+"\n");
                sb.append(l2.getText()+" : "+t2.getText()+"\n");
                sb.append("Total : "+total+"\n");
                sb.append("Percentage : "+per+" %\n");
                if(per>70){
                    sb.append("Grade : A");
                }
                else if(per>40){
                    sb.append("Grade : B");
                }
                else if(per<40){
                    sb.append("Failed the Exam");
                }
                l6.setText(sb.toString());
            }
        });
        f.add(b6);

        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        TotalPerGradeUsingSwing ex = new TotalPerGradeUsingSwing();
    }
}
