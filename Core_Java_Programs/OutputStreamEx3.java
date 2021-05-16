//example 3

import java.io.FileOutputStream;

public class OutputStreamEx3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
            String s="welcome to MKPITS Ex2.";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Successful");
        } catch (Exception e) {System.out.println(e);}

    }
}
