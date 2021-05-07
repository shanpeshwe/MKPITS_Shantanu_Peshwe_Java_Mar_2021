//Java AWT Scrollbar Example with AdjustmentListener

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarWithAjustmentListenrAwtEx {
    ScrollbarWithAjustmentListenrAwtEx(){
        Frame f=new Frame("scrollbar Example");
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        final Scrollbar s=new Scrollbar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("vertical scrollbar value is :" + s.getValue());
            }
        });
    }

    public static void main(String[] args) {
        ScrollbarWithAjustmentListenrAwtEx a=new ScrollbarWithAjustmentListenrAwtEx();
    }
}
