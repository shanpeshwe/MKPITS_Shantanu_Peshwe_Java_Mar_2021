////example of set and get method for arraylist using Swing Terminal


import  javax.swing.*;
import  java.awt.event.*;
import java.util.ArrayList;

public class ArrayListStudentDetails {
    JFrame f=new JFrame("Add Student Details");
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JTextArea ta;
    JButton b1,b2,b3,b4;
    ArrayList<String> student =new ArrayList<String>();
    public ArrayListStudentDetails() {
        l1=new JLabel("Enter Student Name");
        l1.setBounds(10,30,200,20);
        f.add(l1);
        t1=new JTextField();
        t1.setBounds(220,30,200,20);
        f.add(t1);
        l3=new JLabel("Enter Age");
        l3.setBounds(10,60,200,20);
        f.add(l3);
        t3=new JTextField();
        t3.setBounds(220,60,200,20);
        f.add(t3);
        l4=new JLabel("Enter Roll Number");
        l4.setBounds(10,90,200,20);
        f.add(l4);
        t4=new JTextField();
        t4.setBounds(220,90,200,20);
        f.add(t4);


        b1=new JButton("Add student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sb=new String();
                sb=("Name : "+t1.getText()+"; Age : "+t3.getText()+"; Roll No. : "+t4.getText());
                student.add(sb);
                t1.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
        f.add(b1);
        b2=new JButton("Display student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str : student) {
                    sb.append(str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        f.add(b2);
        ta=new JTextArea("Student list");
        ta.setBounds(100,200,300,150);
        f.add(ta);

        l2=new JLabel("Enter index no to view ");
        l2.setBounds(10,360,200,30);
        f.add(l2);
        t2=new JTextField();
        t2.setBounds(220,360,200,30);
        f.add(t2);
        b3=new JButton("Get Details");
        b3.setBounds(100,400,150,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=student.get(Integer.parseInt(t2.getText()));
                ta.setText("student at index " + t2.getText() + " : " + res );
            }
        });
        f.add(b3);
        b4=new JButton("Set Details");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sb=new String();
                sb=("Name : "+t1.getText()+"; Age : "+t3.getText()+"; Roll No. : "+t4.getText());
                student.set(Integer.parseInt(t2.getText()),sb) ;
            }
        });
        f.add(b4);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        ArrayListStudentDetails arl=new ArrayListStudentDetails();
    }
}
