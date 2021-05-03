import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;

class awtex1 {
    int pn=0;
    int n=0;
    char op;
    awtex1() {
        Frame f=new Frame();
        TextField t1=new TextField();
        t1.setBounds(10,40,240,25);
        f.add(t1);
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3 =new Button("+");
        Button b4 =new Button("=");
        Button b5 =new Button("-");
        b1.setBounds(10,50,80,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if(str.equals("+") || str.equals("-"))  {
                    t1.setText(" ");
                    t1.setText( "1");
                }
                else {

                    t1.setText(str + "1");
                }
            }
        });
        f.     add(b1);

        b2.setBounds(90,50,80,50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t1.getText();
                if(str.equals("+") || str.equals("-")) {
                    t1.setText(" ");
                    t1.setText( "2");
                }
                else {

                    t1.setText(str + "2");
                }
            }
        });
        f.      add(b2);

        b3.setBounds(170,50,80,50);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("+");
                op='+';

            }
        });
        f.  add(b3);

        b4.setBounds(10,100,80,50);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n=Integer.parseInt(t1.getText());
                int r=0;
                if(op=='+')
                    r =n+pn;
                else if(op=='-')
                    r=pn-n;
                t1.setText(String.valueOf(r));
            }
        });
        f.  add(b4);

        b5.setBounds(10,180,80,50);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn=Integer.parseInt(t1.getText());
                t1.setText("-");
                op='-';
            }
        });
        f.  add(b5);

        f.setSize(260,300);
        f. setTitle("calculator");
        f.   setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        awtex1 a=new awtex1();
    }
}
