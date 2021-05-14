import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderForm {
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField tf1,tf2,tf3,tf4,tf5,tf6;
    TextArea ta;
    Button b,b1,b2;
    OrderForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter order details");
        l1.setBounds(200,50,150,20);
        f.add(l1);

        l2=new Label("order id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf1=new TextField();
        tf1.setBounds(130,120,100,20);
        f.add(tf1);

        l3=new Label("order date");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf2=new TextField();
        tf2.setBounds(120,170,100,20);
        f.add(tf2);

        l4=new Label("disc rate");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf3=new TextField();
        tf3.setBounds(120,210,100,20);
        f.add(tf3);

        Label l5=new Label("order price");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf4=new TextField();
        tf4.setBounds(120,250,100,20);
        f.add(tf4);
        Label l6=new Label("order qty");
        l6.setBounds(10,300,100,20);
        f.add(l6);
        tf5=new TextField();
        tf5.setBounds(120,300,100,20);
        f.add(tf5);
        Label l7=new Label("order status");
        l7.setBounds(10,350,100,20);
        f.add(l7);
        tf6=new TextField();
        tf6.setBounds(120,350,100,20);
        f.add(tf6);


        Label lq=new Label("info");
        lq.setBounds(10,500,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,550,300,300);
        f.add(ta);

        b=new Button("Add order");
        b.setBounds(20,400,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oid=tf1.getText();
                String odate=tf2.getText();
                String discrate=tf3.getText();
                String oprice=tf4.getText();
                String oqty=tf5.getText();
                String ostatus=tf6.getText();
                String res=o.addorder(oid,odate,discrate,oprice,oqty,ostatus);
                lq.setText(res);
                displaydata();
            }
        });
        b1=new Button("Remove order");
        b1.setBounds(150,400,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=o.removeorder();
                lq.setText(res);
                displaydata();
            }
        });
        b2=new Button("update order");
        b2.setBounds(280,400,100,30);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=o.updateorder();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    Order o=new Order();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("order id  : " + o.getO_id() + "\n");
        sb.append("order date: " + o.getO_dt() + "\n");
        sb.append("disc rate: " + o.getDisc_rate() + "\n");
        sb.append("order price : " + o.getO_price() + "\n");
        sb.append("oredr qty : " + o.getO_qty() + "\n");
        sb.append("status : " + o.getStatus() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {

        OrderForm o1=new OrderForm();
    }
}

