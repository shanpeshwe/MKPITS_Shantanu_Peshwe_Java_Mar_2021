//Ex-2 practise for AWT
import java.awt.*;

class Second extends Frame{
    Second(){
        Button b=new Button("Hello");
        b.setBounds(100,100,80,30);
        add(b);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Second s=new Second();
    }
}