import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListWithActionListenerAwtEx {
    ListWithActionListenerAwtEx(){
        Frame f=new Frame();
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(500,100);
        Button b=new Button("show");
        b.setBounds(200,150,80,30);
        final List l1=new List(4,false);
        l1.setBounds(100,100,70,70);
        l1.add("c");
        l1.add("c++");
        l1.add("java");
        l1.add("php");
        final List l2=new List(4,true);
        l2.setBounds(100,200,70,70);
        l2.add("turbo c++");
        l2.add("spring");
        l2.add("hibernate");
        l2.add("codeigniter");
        f.add(l1);
        f.add(l2);
        f.add(l);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="programming language selected : " +l1.getItem(l1.getSelectedIndex());
                data +=",Framework Selected :";
                for (String frame:l2.getSelectedItems()){
                    data +=frame +"";
                }
                l.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        ListWithActionListenerAwtEx a=new ListWithActionListenerAwtEx();
    }
}
