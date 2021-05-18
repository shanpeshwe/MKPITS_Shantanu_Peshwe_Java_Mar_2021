import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;

public class printWriterEx1 {
    public static void main(String[] args)throws Exception {
        //data to write on console using printwriter
        PrintWriter writer=new PrintWriter(System.out);
        writer.write("java course.");
        writer.flush();
        writer.close();
        //data to write in txt file using printwriter
        PrintWriter writer1=null;
        writer1=new PrintWriter("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\test1.txt");
        writer1.write("java,spring,android,html,php,etc");
        writer1.flush();
        writer1.close();

    }
}
