//awt to deposit and withdrawl in account

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtDepositWithdrawl {
    AwtDepositWithdrawl(){
        Frame f=new Frame("Transaction");

        Label l1=new Label("Enter Account Number");
        l1.setBounds(50,50,200,20);
        f.add(l1);
        TextField t1=new TextField();
        t1.setBounds(250,50,300,20);
        f.add(t1);

        Label l2=new Label("Enter Amount");
        l2.setBounds(50,100,200,20);
        f.add(l2);
        TextField t2=new TextField();
        t2.setBounds(250,100,200,20);
        f.add(t2);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox c1=new Checkbox("Deposit",cbg,true);
        c1.setBounds(150,150,100,50);
        Checkbox c2=new Checkbox("Withdraw",cbg,false);
        c2.setBounds(350,150,100,50);
        f.add(c1);
        f.add(c2);

        Label l3=new Label();
        l3.setBounds(50,300,500,20);
        f.add(l3);

        Button b=new Button("OK");
        b.setBounds(225,200,100,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int bal=1000;
                StringBuilder sb=new StringBuilder();
                sb.append("Account number : "+t1.getText());
                sb.append(", Amount : "+t2.getText());
                if(c1.getState()==true) {
                    sb.append(", Method : Deposit");
                    bal = bal + Integer.parseInt(t2.getText());
                    sb.append(", Balance : " + bal);
                }
                else if(c2.getState()==true) {
                    sb.append(", Method : Withdraw");
                    bal = bal - Integer.parseInt(t2.getText());
                    sb.append(", Balance : " + bal);
                }
                l3.setText(sb.toString());
            }
        });
        f.add(b);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtDepositWithdrawl();
    }
}

