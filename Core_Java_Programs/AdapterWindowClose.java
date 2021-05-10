//windowlistener to close window



import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterWindowClose extends Frame {
    AdapterWindowClose(){
        addMouseListener(new mym(this));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        setSize(200,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AdapterWindowClose ad=new AdapterWindowClose();
    }
}
class mym extends MouseAdapter{
    AdapterWindowClose ad;
    mym(AdapterWindowClose ad)
    {
        this.ad=ad;
    }
    public void mouseclicked(MouseEvent me){
        System.out.println("mouse clicked");
    }
}
