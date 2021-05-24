import java.io.*;

public class GarbageCollectionEx2 {
    public void finalise(){
        System.out.println("finalize method is called");
        try {
            fout.close();
        }catch (Exception ee)
        {

        }
    }
    static FileOutputStream fout;

    public static void main(String[] args) {
        try {
            fout=new FileOutputStream("H://abc.txt");
            fout.write(60);
        }catch (Exception ee)
        {

        }
        GarbageCollectionEx2 g1=new GarbageCollectionEx2();
        g1=null;
        System.gc();
        System.out.println("g1 object will be destroyed by GC");

    }
}
