import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharArrayEx2 {
    public static void main(String[] args) {
        try {
            StringBuilder sb=new StringBuilder();
            FileReader fr=new FileReader("c:\\xampp\\readme_de.txt");
            int i=0;
            while ((i=fr.read())!=-1)
                sb.append((char)i);
            fr.close();

            CharArrayWriter ca=new CharArrayWriter();
            ca.write(sb.toString());
            FileWriter f1=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\a.txt");
            FileWriter f2=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\b.txt");
            FileWriter f3=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\c.txt");
            FileWriter f4=new FileWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\d.txt");
            ca.writeTo(f1);
            ca.writeTo(f2);
            ca.writeTo(f3);
            ca.writeTo(f4);
            f1.close();
            f2.close();
            f3.close();
            f4.close();
            System.out.printf("success");
        }catch (Exception ee)
        {

        }
    }
}
