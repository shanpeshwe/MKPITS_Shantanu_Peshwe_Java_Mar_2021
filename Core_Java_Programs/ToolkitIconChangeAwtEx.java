//Java AWT Toolkit Example: Change TitleBar Icon

import java.awt.*;
public class ToolkitIconChangeAwtEx {
    ToolkitIconChangeAwtEx(){
        Frame f=new Frame();
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\COM\\Desktop\\MK Placement\\Java\\IconEx1.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ToolkitIconChangeAwtEx t=new ToolkitIconChangeAwtEx();
    }
}
