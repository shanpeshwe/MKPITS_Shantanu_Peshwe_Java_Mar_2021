//Java AWT MenuItem and Menu Example

import java.awt.*;
public class MenuAwtEx {
    MenuAwtEx(){
        Frame f = new Frame();
        MenuBar mb=new MenuBar();
        Menu menu=new Menu("Menu");
        Menu subMenu=new Menu("sub Menu");
        MenuItem i1=new MenuItem("item 1");
        MenuItem i2=new MenuItem("item 2");
        MenuItem i3=new MenuItem("item 3");
        MenuItem i4=new MenuItem("item 4");
        MenuItem i5=new MenuItem("item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        subMenu.add(i4);
        subMenu.add(i5);
        menu.add(subMenu);
        mb.add(menu);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        MenuAwtEx e=new MenuAwtEx();
    }
}
