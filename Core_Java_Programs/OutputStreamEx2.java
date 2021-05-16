//Java FileOutputStream example 2: write string

import java.io.FileOutputStream;
public class OutputStreamEx2 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
            String s="Welcome to mkpits.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
