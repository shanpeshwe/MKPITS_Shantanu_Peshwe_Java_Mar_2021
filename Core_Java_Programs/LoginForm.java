//create a login form and check the credentials from the register table .

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import  java.sql.*;

public class LoginForm extends  JFrame {
    public LoginForm() {
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
        t2.setBounds(260,120,240,25);
        add(t2);

        JLabel l21=new JLabel("Status");
        l21.setBounds(10,400,240,25);
        add(l21);


        JButton b1=new JButton("Login");
        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = t1.getText();
                String p = t2.getText();

                Connection con=null;
                Statement st=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
                    //System.out.println("connected");
                    st=con.createStatement();

                    String str="select * from registration where username='"+un+"' and password='"+p+"'";
                    ResultSet rs=st.executeQuery(str);
                    int flag=0;
                    while (rs.next()) {
                        flag=1;
                    }
                    if(flag==1) {
                        l21.setText("Login successfull");
                        logi.setVisible(false);
                        JdbcShopForm ss=new JdbcShopForm();
                    }
                    else {
                        l21.setText("invaid credentials , try again !");
                    }
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
        JButton b2=new JButton("reset");
        b2.setBounds(200,360,80,20);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
        add(b2);
        setSize(700,500);
        setTitle("Login Form");
        setLayout(null);
        setVisible(true);

    }
    static LoginForm logi=null;
    public static void main(String[] args) {
        logi=new LoginForm();

    }
}
