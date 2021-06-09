//create a registration form

import javax.swing.*;
import java.awt.event.*;
import  java.sql.*;
public class RegistrationForm extends  JFrame {
    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup bg;
    JCheckBox cb1,cb2;
    JComboBox city;
    RegistrationForm()
    {
        JLabel l14=new JLabel("Register form");
        l14.setBounds(100,40,240,25);
        add(l14);
        JLabel l1=new JLabel("username :");
        l1.setBounds(10,80,240,25);
        add(l1);

        JTextField t1=new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);

        JLabel l2=new JLabel("Password");
        l2.setBounds(10,120,240,25);
        add(l2);

        JPasswordField t2=new JPasswordField( );
        //t2.setEchoChar('*');
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel lg=new JLabel("gender");
        lg.setBounds(10,160,240,25);
        add(lg);

        rb1=new JRadioButton("male" );
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2=new JRadioButton("female" );
        rb2.setBounds(400,160,100,25);
        add(rb2);
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel lc=new JLabel("course ");
        lg.setBounds(10,200,240,25);
        add(lg);

        cb1=new JCheckBox("java" );
        cb1.setBounds(260,200,100,25);
        add(cb1);
        cb2=new JCheckBox("mysql" );
        cb2.setBounds(400,200,100,25);
        add(cb2);

        JLabel lci=new JLabel("city");
        lci.setBounds(10,240,240,25);
        add(lci);
        String[] ct= { "nagpur","mumbai","delhi"};
        city=new JComboBox(ct);
        city.setBounds(260,240,100,25);
        add(city);

        JLabel l21=new JLabel("Status");
        l21.setBounds(10,400,240,25);
        add(l21);

        JButton b1=new JButton("register");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = t1.getText();
                String p = t2.getText();
                String g=null;
                if(rb1.isSelected())
                    g="male";
                else if (rb2.isSelected())
                    g="female";
                // System.out.println("gender " +g);
                String course=null;
                if(cb1.isSelected())
                    course="java";
                if (cb2.isSelected())
                    course = course + " mysql";

                String city1=city.getSelectedItem().toString();

                Connection con=null;
                Statement st=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
                    //System.out.println("connected");
                    st=con.createStatement();

                    String sql="insert into registration(username,password,gender,course,city) values('"+un+"','"+p+"','"+g+"','"+course+"','"+city1+"')";
                    st.executeUpdate(sql);
                    l21.setText("registered succ.");
                    t1.setText("");
                    t2.setText("");
                    st.close();
                    con.close();
                }catch ( Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        setSize(700,500);
        setTitle("mkpits");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    public  static  void main(String[] arg)
    {
        RegistrationForm f=new RegistrationForm();
    }


}
