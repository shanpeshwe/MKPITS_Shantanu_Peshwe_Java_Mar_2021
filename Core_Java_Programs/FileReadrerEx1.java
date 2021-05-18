import java.io.FileReader;

public class FileReadrerEx1 {
    public static void main(String[] args)throws Exception {
        FileReader fr=new FileReader("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\test.txt");
        int i=0;
        while ((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();

    }
}
