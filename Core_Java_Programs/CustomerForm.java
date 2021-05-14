import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerForm {
    JLabel l1,l2,l3,l4,l5;
    JTextField tf1,tf2,tf3,tf4;
    JTextArea ta;
    JButton b,b1;
    CustomerForm(){
        JFrame f=new JFrame("Customer Details");
        l1=new JLabel("Enter Customer Details");
        l1.setBounds(100,50,200,20);
        f.add(l1);

        l2=new JLabel("Customer ID");
        l2.setBounds(10,120,150,20);
        f.add(l2);
        tf1=new JTextField();
        tf1.setBounds(160,120,100,20);
        f.add(tf1);

        l3=new JLabel("Customer Name");
        l3.setBounds(10,170,150,20);
        f.add(l3);
        tf2=new JTextField();
        tf2.setBounds(160,170,100,20);
        f.add(tf2);

        l4=new JLabel("Customer Address");
        l4.setBounds(10,210,150,20);
        f.add(l4);
        tf3=new JTextField();
        tf3.setBounds(160,210,100,20);
        f.add(tf3);


        l5=new JLabel("Customer Mob.");
        l5.setBounds(10,250,150,20);
        f.add(l5);
        tf4=new JTextField();
        tf4.setBounds(160,250,100,20);
        f.add(tf4);


        JLabel lq=new JLabel("Info");
        lq.setBounds(10,350,650,50);
        f.add(lq);
        ta=new JTextArea();
        ta.setBounds(10,400,300,200);
        f.add(ta);

        b=new JButton("Place Order");
        b.setBounds(50,300,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cid=tf1.getText();
                String cname=tf2.getText();
                String caddr=tf3.getText();
                String cmob=tf4.getText();
                String res=c.placeorder(cid,cname,caddr,cmob);
                lq.setText(res);
                displaydata();
            }
        });
        b1=new JButton("Receive Product");
        b1.setBounds(150,300,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=c.receiveproduct();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    Customer c=new Customer();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("customer id : " + c.getCid() + "\n");
        sb.append("customer name : " + c.getCname() + "\n");
        sb.append("customer address : " + c.getC_addr() + "\n");
        sb.append("customer mobile: " + c.getC_mob() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args)
    {
        CustomerForm c1=new CustomerForm();
    }
}

