

import java.net.*;
import java.io.*;
import  java.awt.*;
import  java.awt.event.*;
import java.util.Timer;

public class ServerInSwing extends  Frame{
    Label l1;
    TextField t1 ;
    Button b1,b2;
    TextArea ta;
    ServerSocket ss;
    Socket s;
    StringBuilder sb;
    DataOutputStream dout;
    public static Timer t;

    ServerInSwing() {
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
                    sb.append("Client : "+str+"\n");
                    ta.setText(sb.toString());
                }catch ( Exception ee) {
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
                    sb.append("Server : "+str+"\n");
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
        setSize(600,500);
        setTitle("server ");
        setVisible(true);
        try {
            ss=new ServerSocket(6666);
            s=ss.accept();

        }catch ( Exception ee) {

        }


    }

    public static void main(String[] args) {

        ServerInSwing server=new ServerInSwing();

    }

}
