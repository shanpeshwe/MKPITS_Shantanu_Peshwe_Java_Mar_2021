import java.io.*;
public class BufferOutputStreamEx1 {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to mkpits.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
