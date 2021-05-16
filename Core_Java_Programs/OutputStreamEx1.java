//Java FileOutputStream Example 1: write byte

import java.io.FileOutputStream;
public class OutputStreamEx1 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
            fout.write(66);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
