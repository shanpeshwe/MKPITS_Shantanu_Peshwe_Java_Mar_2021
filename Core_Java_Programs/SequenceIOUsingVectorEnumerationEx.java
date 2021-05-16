//SequenceInputStream example that reads data using enumeration

//If we need to read the data from more than two files, we need to use Enumeration.
// Enumeration object can be obtained by calling elements() method of the Vector class.
// Let's see the simple example where we are reading the data from 4 files: a.txt, b.txt, c.txt and d.txt.

        import java.io.*;
        import java.util.*;
class Input2{
    public static void main(String args[])throws IOException{
        //creating the FileInputStream objects for all the files
        FileInputStream fin=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\a.txt");
        FileInputStream fin2=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\b.txt");
        FileInputStream fin3=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\c.txt");
        FileInputStream fin4=new FileInputStream("C:\\Users\\COM\\Desktop\\MK Placement\\Java Input Output\\d.txt");
        //creating Vector object to all the stream
        Vector v=new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        //creating enumeration object by calling the elements method
        Enumeration e=v.elements();
        //passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }
}
