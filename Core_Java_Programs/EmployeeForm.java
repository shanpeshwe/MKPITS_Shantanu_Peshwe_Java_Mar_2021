
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeForm {
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField tf1,tf2,tf3,tf4,tf5;
    TextArea ta;
    EmployeeForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter Employee details");
        l1.setBounds(200,50,100,20);
        f.add(l1);

        l2=new Label("employee id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf1=new TextField();
        tf1.setBounds(130,120,100,20);
        f.add(tf1);

        l3=new Label("emp name");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf2=new TextField();
        tf2.setBounds(130,170,100,30);
        f.add(tf2);


        l4=new Label("select sex");
        l4.setBounds(10,230,120,20);
        f.add(l4);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("male",cbg1,false);
        checkbox1.setBounds(120,230,50,50);
        Checkbox checkbox2=new Checkbox("female",cbg1,true);
        checkbox2.setBounds(180,230,100,50);
        f.add(checkbox1);
        f.add(checkbox2);

        l5=new Label("selct shift");
        l5.setBounds(10,300,120,20);
        f.add(l5);
        CheckboxGroup cbg2=new CheckboxGroup();
        Checkbox checkbox3=new Checkbox("morning",cbg2,false);
        checkbox3.setBounds(120,300,50,50);
        Checkbox checkbox4=new Checkbox("night",cbg2,true);
        checkbox4.setBounds(180,300,100,50);
        f.add(checkbox3);
        f.add(checkbox4);

        l6=new Label("emp address");
        l6.setBounds(10,350,100,20);
        f.add(l6);
        tf3=new TextField();
        tf3.setBounds(120,350,100,20);
        f.add(tf3);

        l7=new Label("emp mobile");
        l7.setBounds(10,400,100,20);
        f.add(l7);
        tf4=new TextField();
        tf4.setBounds(120,400,100,20);
        f.add(tf4);

        Label l8=new Label("emp salary");
        l8.setBounds(10,450,100,20);
        f.add(l8);
        tf5=new TextField();
        tf5.setBounds(120,450,100,20);
        f.add(tf5);

        Label lq=new Label("info");
        lq.setBounds(10,500,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,550,200,200);
        f.add(ta);

        Button b=new Button("view product");
        b.setBounds(210,550,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eid=tf1.getText();
                String ename=tf2.getText();
                String empaddr=tf3.getText();
                String g=null;
                if (checkbox1.getState()==true)
                    g= "male";
                if (checkbox2.getState()==true)
                    g= "female";
                String s=null;
                if (checkbox3.getState()==true)
                    s= "morning";
                if (checkbox4.getState()==true)
                    s= "night";
                String empmob=tf4.getText();
                String empsal=tf5.getText();
                String res=e1.viewproduct(eid,ename,g,empsal,s,empaddr,empmob);
                lq.setText(res);
                displaydata();
                //display

            }
        });
        Button b1=new Button("view customer");
        b1.setBounds(110,600,100,20);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=e1.viewcustomer();
                lq.setText(res);
                displaydata();
            }
        });
        Button b2=new Button("view customer");
        b2.setBounds(210,600,100,20);
        f.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=e1.viewcustomer();
                lq.setText(res);
                displaydata();
            }
        });
        Button b3=new Button("view supplier");
        b3.setBounds(300,600,100,20);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=e1.viewsupplier();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);

    }
    Employee e1=new Employee();
    public void displaydata(){
        StringBuilder sb=new StringBuilder();
        sb.append("emp id : " + e1.getEid() + "\n");
        sb.append("emp name : " + e1.getEname() + "\n");
        sb.append("emp sex : " + e1.getSex() + "\n");
        sb.append("emp shift : " + e1.getShift() + "\n");
        sb.append("emp addr : " + e1.getE_addr() + "\n");
        sb.append("emp mob : " + e1.getE_mob() + "\n");
        sb.append("emp salary : " + e1.getSalary() + "\n");;
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {
        EmployeeForm e1=new EmployeeForm();
    }
}

