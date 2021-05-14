import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    MenuBar mb = new MenuBar();
    Menu m1 = new Menu("File");
    Menu m2 = new Menu("Close");

    MenuItem mi11=new MenuItem("Exit");
    MenuItem mi1 = new MenuItem("Shop");
    MenuItem mi2 = new MenuItem("Supplier");
    MenuItem mi3 = new MenuItem("Stock");
    MenuItem mi4 = new MenuItem("Order");
    MenuItem mi5 = new MenuItem("Employee");
    MenuItem mi6=new MenuItem("Customer");
    MenuItem mi7=new MenuItem("Billing");
    MenuItem mi8=new MenuItem("Product");

    private final JDesktopPane desktopPane = new JDesktopPane();

    public MainFrame() {
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);
        m1.add(mi6);
        m1.add(mi8);
        m2.add(mi11);
        m1.add(mi7);

        mb.add(m1);
        mb.add(m2);

        mi11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");
                System.exit(0);
            }
        });
        this.setMenuBar(mb);

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShopForm s = new ShopForm();
            }
        });

        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SupplierForm su = new SupplierForm();
            }
        });

        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StockForm su = new StockForm();
            }
        });

        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderForm su = new OrderForm();
            }
        });

        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeForm su = new EmployeeForm();
            }
        });

        mi6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerForm su = new CustomerForm();
            }
        });

        mi7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BillingForm su = new BillingForm();
            }
        });

        mi8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductForm su = new ProductForm();
            }
        });

        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600, 600));
    }

    public static void main (String[]args){

        MainFrame frame = new MainFrame();
        frame.pack();
        frame.setVisible(true);
    }
}