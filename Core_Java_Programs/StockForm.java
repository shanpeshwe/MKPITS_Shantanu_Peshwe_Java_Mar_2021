import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockForm {
    Label l1,l2,l3,l4,l5,l6;
    TextField tf,tf1,tf2,tf3,tf4,tf5;
    TextArea ta;
    Button b1;
    StockForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter stock details");
        l1.setBounds(200,50,180,20);
        f.add(l1);

        l2=new Label("stock id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("product id");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf1=new TextField();
        tf1.setBounds(120,170,100,20);
        f.add(tf1);
        l4=new Label("stk disc ");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf2=new TextField();
        tf2.setBounds(120,200,100,20);
        f.add(tf2);

        l5=new Label("stk qty");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf3=new TextField();
        tf3.setBounds(120,250,100,20);
        f.add(tf3);

        l6=new Label("Date");
        l6.setBounds(10,300,100,20);
        f.add(l6);
        tf4=new TextField();
        tf4.setBounds(120,300,100,20);
        f.add(tf4);

        Label lq=new Label("info");
        lq.setBounds(10,450,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,500,300,100);
        f.add(ta);

        Button b=new Button("Availability");
        b.setBounds(150,420,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid=tf.getText();
                String pid=tf1.getText();
                String stkdisc=tf2.getText();
                String stkqty=tf3.getText();
                String date=tf4.getText();
                String res=s1.availability(sid,pid,stkdisc,stkqty,date);
                lq.setText(res);
                displaydata();
            }
        });
        Button b1=new Button("Add stock");
        b1.setBounds(300,420,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s1.addstock();
                lq.setText(res);
                displaydata();
            }
        });
        Button b2=new Button("Remove stock");
        b2.setBounds(400,420,100,30);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s1.removestock();
                lq.setText(res);
                displaydata();
            }
        });
        Button b3=new Button("update stock");
        b3.setBounds(500,420,100,30);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=s1.updatestock();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    Stock s1=new Stock();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("stock id : " + s1.getS_id() + "\n");
        sb.append("stock disc : " + s1.getStk_disc() + "\n");
        sb.append("stock qty : " + s1.getStk_qty() + "\n");
        sb.append("stock date  : " + s1.getDate() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {
        StockForm s1=new StockForm();
    }
}


