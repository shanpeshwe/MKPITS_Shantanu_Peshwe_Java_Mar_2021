//Java FileInputStream example 2: read all characters


import java.io.FileInputStream;
public class InputStreamEx2 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
