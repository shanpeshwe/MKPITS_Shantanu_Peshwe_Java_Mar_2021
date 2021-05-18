import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterEx1 {
    public static void main(String[] args)throws Exception {
        CharArrayWriter out=new CharArrayWriter();
        out.write("welocme to mkpits");
        FileWriter f1=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\a.txt");
        FileWriter f2=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\b.txt");
        FileWriter f3=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\c.txt");
        FileWriter f4=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.printf("success");

    }
}
