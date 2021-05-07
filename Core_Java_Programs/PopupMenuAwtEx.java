
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuAwtEx {
    PopupMenuAwtEx(){
        Frame f=new Frame("PopupMenu Example");
        final PopupMenu popupmenu=new PopupMenu("Edit");
        MenuItem cut=new MenuItem("cut");
        cut.setActionCommand("cut");
        MenuItem copy=new MenuItem("copy");
        copy.setActionCommand("copy");
        MenuItem paste=new MenuItem("paste");
        paste.setActionCommand("paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                popupmenu.show(f,e.getX(),e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        PopupMenuAwtEx p=new PopupMenuAwtEx();
    }
}
