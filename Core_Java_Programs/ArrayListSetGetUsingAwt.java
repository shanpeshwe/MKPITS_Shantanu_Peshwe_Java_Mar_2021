//example of set and get method for arraylist using AWT

import java.awt.*;
import  java.awt.event.*;
import java.util.ArrayList;

public class ArrayListSetGetUsingAwt {
    Frame f=new Frame("Student Name");
    Label l1,l2;
    TextField t1,t2;
    TextArea ta;
    Button b1,b2,b3,b4;
    ArrayList<String> student =new ArrayList<String>();
    public ArrayListSetGetUsingAwt() {
        l1=new Label("Enter student name");
        l1.setBounds(10,50,200,30);
        f.add(l1);
        t1=new TextField();
        t1.setBounds(220,50,200,30);
        f.add(t1);

        b1=new Button("Add student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(t1.getText());
                t1.setText("");
            }
        });
        f.add(b1);

        b2=new Button("Display student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str : student) {
                    sb.append("Student name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        f.add(b2);

        ta=new TextArea("Student list : ");
        ta.setBounds(100,200,300,150);
        f.add(ta);

        l2=new Label("Enter index no. to view ");
        l2.setBounds(10,360,200,30);
        f.add(l2);
        t2=new TextField();
        t2.setBounds(220,360,200,30);
        f.add(t2);

        b3=new Button("Get Name");
        b3.setBounds(100,400,150,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=student.get(Integer.parseInt(t2.getText()));
                ta.setText("Student name at index " + t2.getText() + " : " + res );
            }
        });
        f.add(b3);

        b4=new Button("Set method");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.set(Integer.parseInt(t2.getText()),t1.getText()) ;
            }
        });
        f.add(b4);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        ArrayListSetGetUsingAwt arl=new ArrayListSetGetUsingAwt();
    }
}
