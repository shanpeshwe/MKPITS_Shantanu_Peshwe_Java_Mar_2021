//register form code in AWT

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtRegisterForm {
    Label l1,l2,l3,l4;
    TextField tf;
    Button b1;
    AwtRegisterForm(){
        Frame f= new Frame("CheckboxGroup Example");
        l1=new Label("register yourself");
        l1.setBounds(200,50,100,20);
        f.add(l1);

        l2=new Label("your name");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("select course ");
        l3.setBounds(10,170,100,20);
        f.add(l3);

        Checkbox checkBox1 = new Checkbox("C++",  false);
        checkBox1.setBounds(130,150, 50,50);
        Checkbox checkBox2 = new Checkbox("Java",  true);
        checkBox2.setBounds(200,150, 50,50);
        f.add(checkBox1);
        f.add(checkBox2);

        l4=new Label("select gender ");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox checkBox11 = new Checkbox("Male", cbg1, false);
        checkBox11.setBounds(120,200, 50,50);
        Checkbox checkBox22 = new Checkbox("Female", cbg1, true);
        checkBox22.setBounds(180,200, 50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox11);
        f.add(checkBox22);

        Label  l41=new Label("select city ");
        l41.setBounds(10,250,100,20);
        f.add(l41);
        Choice c=new Choice();
        c.setBounds(130,250, 75,75);
        c.add("mumbai");
        c.add("pune");
        c.add("nagpur");
        c.add("nashik");
        c.add("aurangabad");
        f.add(c);

        Label lq=new Label("info:");
        lq.setBounds(10,350,650,50);
        f.add(lq);

        Button b=new Button("register");
        b.setBounds(150,300,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                sb.append(" name : " + tf.getText());
                if(checkBox1.getState()==true)
                    sb.append(", course : c++");
                if(checkBox2.getState()==true)
                    sb.append(", course : java");
                if(checkBox11.getState()==true)
                    sb.append(", gender : male");
                if(checkBox22.getState()==true)
                    sb.append(", gender : female");
                sb.append(", city : " + c.getItem(c.getSelectedIndex()));
                lq.setText(sb.toString());
            }
        });
        f.add(b);

        f.setSize(700,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AwtRegisterForm();
    }

}
