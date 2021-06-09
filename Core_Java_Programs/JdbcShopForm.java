//create a class JdbcShop having method to add, update, delete and search from shoptable .
//create a swing form to use the above class.
import java.awt.event.*;
import javax.swing.*;
import  java.sql.*;
public class JdbcShopForm extends  JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    Connection con=null;
    Statement stmt=null;
    JdbcShop s1=null;

    public void clearTextBox(){
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }

    public JdbcShopForm() {
        s1=new JdbcShop();
        l1=new JLabel("shop no.");
        l1.setBounds(20,50,200,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(230,50,200,20);
        add(t1);
        l2=new JLabel("City.");
        l2.setBounds(20,100,200,20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(230,100,200,20);
        add(t2);

        l3=new JLabel("Owner.");
        l3.setBounds(20,150,200,20);
        add(l3);
        t3=new JTextField();
        t3.setBounds(230,150,200,20);
        add(t3);

        l4=new JLabel("Address.");
        l4.setBounds(20,200,200,20);
        add(l4);
        t4=new JTextField();
        t4.setBounds(230,200,200,20);
        add(t4);
        b1=new JButton("Save");
        b1.setBounds(100,250,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result= s1.addShop(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),t4.getText());
                    l5.setText(result);
                    clearTextBox();
                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(220,250,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result= s1.updateShop(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),t4.getText());
                    l5.setText(result);
                    clearTextBox();
                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b2);
        b3=new JButton("Delete");
        b3.setBounds(330,250,100,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result= s1.removeShop(Integer.parseInt(t1.getText()));
                    l5.setText(result);
                    clearTextBox();
                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(450,50,100,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String r=s1.searchShop(Integer.parseInt(t1.getText()));
                    t2.setText(s1.city);
                    t3.setText(s1.owner);
                    t4.setText(s1.address);
                    l5.setText(r);
                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);


        l5=new JLabel("Status.");
        l5.setBounds(10,300,400,20);
        add(l5);
        setTitle("Shop Entry Form");
        setSize(600,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JdbcShopForm sf=new JdbcShopForm();
    }
}
