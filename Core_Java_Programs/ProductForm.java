import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductForm {
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField tf,tf1,tf2,tf3,tf4,tf5,tf6;
    TextArea ta;
    Button b1;
    ProductForm(){
        Frame f=new Frame("My shop");
        l1=new Label("Enter Product details");
        l1.setBounds(200,50,180,20);
        f.add(l1);

        l2=new Label("product id");
        l2.setBounds(10,120,100,20);
        f.add(l2);
        tf=new TextField();
        tf.setBounds(130,120,100,20);
        f.add(tf);

        l3=new Label("product name");
        l3.setBounds(10,170,100,20);
        f.add(l3);
        tf1=new TextField();
        tf1.setBounds(120,170,100,20);
        f.add(tf1);
        l4=new Label("product qty");
        l4.setBounds(10,210,100,20);
        f.add(l4);
        tf2=new TextField();
        tf2.setBounds(120,200,100,20);
        f.add(tf2);

        l5=new Label("Batch name");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        tf3=new TextField();
        tf3.setBounds(120,250,100,20);
        f.add(tf3);

        l6=new Label("SP");
        l6.setBounds(10,300,100,20);
        f.add(l6);
        tf4=new TextField();
        tf4.setBounds(120,300,100,20);
        f.add(tf4);

        l6=new Label("mfg date");
        l6.setBounds(10,350,100,20);
        f.add(l6);
        tf5=new TextField();
        tf5.setBounds(120,350,100,20);
        f.add(tf5);

        l7=new Label("exp date");
        l7.setBounds(10,400,100,20);
        f.add(l7);
        tf6=new TextField();
        tf6.setBounds(120,400,100,20);
        f.add(tf6);

        Label lq=new Label("info");
        lq.setBounds(10,450,650,50);
        f.add(lq);
        ta=new TextArea();
        ta.setBounds(10,500,300,100);
        f.add(ta);

        Button b=new Button("Add Product");
        b.setBounds(150,420,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pid=tf.getText();
                String p_name=tf1.getText();
                String p_qty=tf2.getText();
                String b_name=tf3.getText();
                String s_p=tf4.getText();
                String mfG_date=tf5.getText();
                String ex_date=tf6.getText();
                String res=p.addproduct(pid,p_name,p_qty,b_name,s_p,mfG_date,ex_date);
                lq.setText(res);
                displaydata();
            }
        });
        Button b1=new Button("Remove product");
        b1.setBounds(300,420,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=p.removeproduct();
                lq.setText(res);
                displaydata();
            }
        });
        Button b2=new Button("order product");
        b2.setBounds(400,420,100,30);
        f.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=p.orderproduct();
                lq.setText(res);
                displaydata();
            }
        });
        Button b3=new Button("update product");
        b3.setBounds(500,420,100,30);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=p.updateproduct();
                lq.setText(res);
                displaydata();
            }
        });
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    Product p=new Product();
    public void displaydata()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("product id : " + p.getPi_id() + "\n");
        sb.append("product name : " + p.getP_name() + "\n");
        sb.append("product qty : " + p.getP_qty() + "\n");
        sb.append("batch name : " + p.getBatch_name() + "\n");
        sb.append("sp: " + p.getSp() + "\n");
        sb.append("mfg date : " + p.getMfg_dt() + "\n");
        sb.append("exp date : " + p.getExp_dt() + "\n");
        ta.setText(sb.toString());
    }

    public static void main(String[] args) {
        ProductForm p1=new ProductForm();
    }
}

