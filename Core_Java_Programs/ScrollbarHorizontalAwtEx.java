import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarHorizontalAwtEx {
    ScrollbarHorizontalAwtEx(){
        Frame f=new Frame("scrollbar Horizontal Example");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        final Scrollbar s=new Scrollbar();
        s.setOrientation(0);
        s.setBounds(100,100,250,20);
        f.add(s);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Horizontal scrollbar value is :" + s.getValue());
            }
        });
    }

    public static void main(String[] args) {
        ScrollbarHorizontalAwtEx a=new ScrollbarHorizontalAwtEx();
    }
}
