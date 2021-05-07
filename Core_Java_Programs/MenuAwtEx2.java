
import java.awt.*;
public class MenuAwtEx2 {
    MenuAwtEx2(){
        Frame f=new Frame("Menu and Menuitem Example");
        MenuBar mb=new MenuBar();

        Menu menu=new Menu("file");
        Menu submenu=new Menu("project");
        MenuItem i1=new MenuItem("new");
        MenuItem i2=new MenuItem("open");
        MenuItem i3=new MenuItem("close");
        MenuItem i4=new MenuItem("Rename");
        MenuItem i5=new MenuItem("Delete");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        Menu menu1=new Menu("Edit");
        MenuItem i11=new MenuItem("cut");
        MenuItem i12=new MenuItem("copy");
        MenuItem i13=new MenuItem("paste");
        menu1.add(i11);
        menu1.add(i12);
        menu1.add(i13);
        mb.add(menu1);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        MenuAwtEx2 e=new MenuAwtEx2();
    }

}
