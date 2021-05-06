//checkbox for and to show how many correct answers selected from checkbox

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtFrameEx5 {
    AwtFrameEx5(){
        Frame f=new Frame("checkbox Example");
        final Label l=new Label("capital of maharashtra : ");
        l.setAlignment(l.CENTER);
        l.setSize(400,100);
        l.setBounds(10,110,200,30);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox checkbox1=new Checkbox("nagpur",cbg,false);
        checkbox1.setBounds(180,100,70,50);
        Checkbox checkbox2=new Checkbox("mumbai",cbg,true);
        checkbox2.setBounds(250,100,70,50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(l);
        CheckboxGroup cbg1=new CheckboxGroup();
        Checkbox chekbox3=new Checkbox("delhi",cbg1,false);
        chekbox3.setBounds(180,200,70,50);
        Checkbox checkbox4=new Checkbox("mumbai",cbg1,true);
        checkbox4.setBounds(250,200,70,50);
        final Label l2=new Label("capital of india : ");
        l2.setAlignment(l2.CENTER);
        l2.setSize(400,100);
        l2.setBounds(10,210,200,30);
        f.add(chekbox3);
        f.add(checkbox4);
        f.add(l2);

        Label lq=new Label("info ");
        lq.setBounds(10,300,300,50);
        f.add(lq);


        Button b=new Button("result");
        b.setBounds(100,260,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int cnt=0;
                if (checkbox2.getState()==true)
                    cnt=cnt+1;

                if (chekbox3.getState()==true)
                    cnt=cnt+1;

                lq.setText("score out of 2 is " + cnt);
            }
        });

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AwtFrameEx5 a=new AwtFrameEx5();
    }
}
