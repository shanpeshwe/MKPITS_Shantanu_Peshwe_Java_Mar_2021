//design calculator layout
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUsingAwt {
    int pn=0;
    int n=0;
    char op;
    String str;

    CalculatorUsingAwt(){
        Frame f=new Frame();
        f.setTitle("Calculator");
        f.setSize(220,310);

        TextField t=new TextField();
        t.setBounds(10,30,200,60);
        f.add(t);

        //first row
        Button b01=new Button("%");
        b01.setBounds(10,100,50,40);
        b01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                t.setText("%");
                op='%';
            }
        });
        f.add(b01);

        Button b02=new Button("CE");
        b02.setBounds(60,100,50,40);
        b02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("0"); }
        });
        f.add(b02);

        Button b03=new Button("C");
        b03.setBounds(110,100,50,40);
        b03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                pn/=10;
                t.setText(String.valueOf(pn)); }
        });
        f.add(b03);

        Button b04=new Button("/");
        b04.setBounds(160,100,50,40);
        b04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                t.setText("/");
                op='/';
            }
        });
        f.add(b04);

        //second row
        Button b11=new Button("7");
        b11.setBounds(10,140,50,40);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("7");
                }
                else{
                    t.setText(str+"7");
                }
            }
        });
        f.add(b11);

        Button b12=new Button("8");
        b12.setBounds(60,140,50,40);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("8");
                }
                else{
                    t.setText(str+"8");
                }
            }
        });
        f.add(b12);

        Button b13=new Button("9");
        b13.setBounds(110,140,50,40);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("9");
                }
                else{
                    t.setText(str+"9");
                }
            }
        });
        f.add(b13);

        Button b14=new Button("x");
        b14.setBounds(160,140,50,40);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                t.setText("x");
                op='x';
            }
        });
        f.add(b14);

        //third row
        Button b21=new Button("4");
        b21.setBounds(10,180,50,40);
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("4");
                }
                else{
                    t.setText(str+"4");
                }
            }
        });
        f.add(b21);

        Button b22=new Button("5");
        b22.setBounds(60,180,50,40);
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("5");
                }
                else{
                    t.setText(str+"5");
                }
            }
        });
        f.add(b22);

        Button b23=new Button("6");
        b23.setBounds(110,180,50,40);
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("6");
                }
                else{
                    t.setText(str+"6");
                }
            }
        });
        f.add(b23);
        Button b24=new Button("-");
        b24.setBounds(160,180,50,40);
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                t.setText("-");
                op='-';
            }
        });
        f.add(b24);

        //fourth row
        Button b31=new Button("1");
        b31.setBounds(10,220,50,40);
        b31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("1");
                }
                else{
                    t.setText(str+"1");
                }
            }
        });
        f.add(b31);

        Button b32=new Button("2");
        b32.setBounds(60,220,50,40);
        b32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("2");
                }
                else{
                    t.setText(str+"2");
                }
            }
        });
        f.add(b32);

        Button b33=new Button("3");
        b33.setBounds(110,220,50,40);
        b33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("3");
                }
                else{
                    t.setText(str+"3");
                }
            }
        });
        f.add(b33);

        Button b34=new Button("+");
        b34.setBounds(160,220,50,40);
        b34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn= Integer.parseInt(t.getText());
                t.setText("+");
                op='+';
            }
        });
        f.add(b34);

        //fifth row
        Button b41=new Button("00");
        b41.setBounds(10,260,50,40);
        b41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("00");
                }
                else{
                    t.setText(str+"00");
                }
            }
        });
        f.add(b41);

        Button b42=new Button("0");
        b42.setBounds(60,260,50,40);
        b42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText("0");
                }
                else{
                    t.setText(str+"0");
                }
            }
        });
        f.add(b42);

        Button b43=new Button(".");
        b43.setBounds(110,260,50,40);
        b43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str=t.getText();
                if(str.equals("+")||str.equals("-")||str.equals("x")||str.equals("/")||str.equals("%")){
                    t.setText("");
                    t.setText(".");
                }
                else{
                    t.setText(str+".");
                }
            }
        });
        f.add(b43);

        Button b44=new Button("=");
        b44.setBounds(160,260,50,40);
        b44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float r=0.0f;
                if(op=='%'){
                    r =(float)pn/100;
                    t.setText(String.valueOf(r));
                }
                n = Integer.parseInt(t.getText());
                if (op == '+')
                    r = pn + n;
                else if (op == '-')
                    r = pn - n;
                else if (op == 'x')
                    r = pn * n;
                else if(op=='/')
                    r =(float)pn/n;
                t.setText(String.valueOf(r));
            }
        });
        f.add(b44);

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorUsingAwt c=new CalculatorUsingAwt();
    }
}
