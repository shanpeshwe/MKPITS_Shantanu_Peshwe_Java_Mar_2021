import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopForm{

    Label l1,l2,l3,l4,l5;
    TextField tf,tf1,tf2;
    TextArea ta;
    Button b1;

    ShopForm(){
        JFrame f=new JFrame("Shop Form");
        l1=new Label("Enter shop details");
        l1.setBounds(200,50,100,20);
        f.add(l1);

        l2=new Label("Shop No.");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("City");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        Choice c=new Choice();
        c.setBounds(130,170,75,75);
        c.add("Mumbai");
        c.add("Nagpur");
        c.add("Pune");
        c.add("Aurangabad");
        c.add("Nashik");
        f.add(c);

        l4=new Label("Owner");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf1=new TextField();
        tf1.setBounds(120,200,100,20);
        f.add(tf1);

        Label l41=new Label("Address");
        l41.setBounds(10,250,100,20);
        f.add(l41);

        tf2=new TextField();
        tf2.setBounds(120,250,100,20);
        f.add(tf2);

        Label lq=new Label("info");
        lq.setBounds(10,350,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,400,300,100);
        f.add(ta);

        Button b=new Button("Add shop");
        b.setBounds(150,300,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn=tf.getText();
                String ct=c.getItem(c.getSelectedIndex());
                String ow=tf1.getText();
                String ad=tf2.getText();
                String res=s.addShop(sn,ct,ow,ad);
                lq.setText(res);
                displaydata();
            }
        });
        Button b1=new Button("Remove shop");
        b1.setBounds(300,300,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s.removeShop();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    Shop s=new Shop();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("shop no : " + s.getShop_no() + "\n");
        sb.append("city : " + s.getCity() + "\n");
        sb.append("owner : " + s.getOwner() + "\n");
        sb.append("address : " + s.getAddress() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {
        ShopForm s1=new ShopForm();
    }
}
