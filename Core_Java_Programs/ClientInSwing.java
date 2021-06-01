
import java.net.*;
import java.io.*;
import  java.awt.*;
import  java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class ClientInSwing extends  Frame {
    Label l1;
    TextField t1 ;
    Button b1,b2;
    TextArea ta;
    Socket s;
    DataOutputStream dout;
    StringBuilder sb;
    public static Timer t;
    ClientInSwing() {
        sb=new StringBuilder();
        l1=new Label("Enter Message ");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new Button("Recieve");
        b1.setBounds(100,100,200,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DataInputStream din=new DataInputStream(s.getInputStream());
                    String str=din.readUTF();
                    sb.append("Server : "+str+"\n");
                    ta.setText(sb.toString());
                } catch (Exception ee) {
                    ta.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2=new Button("Send");
        b2.setBounds(320,100,200,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dout = new DataOutputStream(s.getOutputStream());
                    String str=t1.getText();
                    dout.writeUTF(str);
                    sb.append("Client : " + str + "\n");
                    ta.setText(sb.toString());
                    dout.flush();
                }catch ( Exception ee) {
                    ta.setText(ee.toString());
                }
            }
        });
        add(b2);
        ta=new TextArea();
        ta.setBounds(50,150,500,200);
        add(ta);

        setLayout(null);
        setTitle("client");
        setSize(600,500);
        setVisible(true);
        try {
            s=new Socket("localhost",6666);
        }catch ( Exception ee) {
            System.out.println(ee.toString());
        }
    }

    public static void main(String[] args) {
        ClientInSwing client=new ClientInSwing();
    }
}
