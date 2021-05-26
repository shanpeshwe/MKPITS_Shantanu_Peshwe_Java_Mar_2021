import java.awt.*;
import  java.awt.event.*;
import java.util.ArrayList;

public class ArrayListUsingAwtEx1{
    Frame f=new Frame();
    Label l1;
    TextField t1;
    TextArea ta;
    Button b1,b2;
    ArrayList<String> student =new ArrayList<String>();
    public ArrayListUsingAwtEx1() {
        l1=new Label("Enter Student Name :");
        l1.setBounds(10,50,200,30);
        f.add(l1);
        t1=new TextField();
        t1.setBounds(220,50,200,30);
        f.add(t1);

        b1=new Button("Add Student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(t1.getText());
                t1.setText("");
            }
        });
        f.add(b1);

        b2=new Button("Display Student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str : student) {
                    sb.append("student name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        f.add(b2);

        ta=new TextArea("student list");
        ta.setBounds(100,200,300,150);
        f.add(ta);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        ArrayListUsingAwtEx1 arl=new ArrayListUsingAwtEx1();
    }
}
