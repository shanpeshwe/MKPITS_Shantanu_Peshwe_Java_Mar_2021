//In this example, we are printing the data of two files testin.txt and testout.txt.

import java.io.*;
class InputStreamExample {
    public static void main(String args[])throws Exception{
        FileInputStream input1=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testout.txt");
        FileInputStream input2=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\testin.txt");
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
