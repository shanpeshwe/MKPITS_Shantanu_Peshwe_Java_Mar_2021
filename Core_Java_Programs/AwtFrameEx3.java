//frame by creating the object of frame class

import java.awt.*;

class Third {
    Third(){
        Frame f=new Frame("Object");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);

        Button b=new Button("Exit");
        b.setBounds(100,100,80,30);
        f.add(b);
    }

    public static void main(String[] args) {
        Third t=new Third();
    }
}
