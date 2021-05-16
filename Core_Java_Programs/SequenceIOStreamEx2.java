//In this example, we are writing the data of two files testin.txt and testin1.txt into
// another file named testout.txt.

import java.io.*;
class Input1{
    public static void main(String args[])throws Exception{
        FileInputStream fin1=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testin.txt");
        FileInputStream fin2=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testin1.txt");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}
