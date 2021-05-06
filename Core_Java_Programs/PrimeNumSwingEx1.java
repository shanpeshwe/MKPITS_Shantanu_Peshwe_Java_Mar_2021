//Example of swing terminal for prime number

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PrimeNumSwingEx1 {
    PrimeNumSwingEx1(){
        JFrame f=new JFrame("To check prime number");

        JLabel l1=new JLabel("enter number to check");
        l1.setBounds(50,50,200,20);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(250,50,100,20);
        f.add(t1);

        JLabel l2=new JLabel();
        l2.setBounds(50,150,200,20);
        f.add(l2);
        JButton b1=new JButton("Check");
        b1.setBounds(150,100,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i,m=0,flag=0;
                int n= Integer.parseInt(t1.getText());
                m=n/2;
                if(n==0||n==1){
                    l2.setText(n+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            l2.setText(n+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        l2.setText(n+" is prime number");
                    }
                }//end of else
            }
        });
        f.add(b1);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeNumSwingEx1();
    }
}
