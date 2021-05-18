import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx1 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\test.txt");
        PrintStream pout=new PrintStream(fout);
        pout.println(20);
        pout.println("hello java");
        pout.println(20.25f);
        pout.println(222.222);
        System.out.println("success");
    }
}
