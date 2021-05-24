//rogram of synchronized method by using annonymous class
import java.util.*;

class TableEx3{
    synchronized void printable(int n){
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class SyncronizationEx3 {
    public static void main(String[] args) {
    final TableEx3 obj=new TableEx3();
    Thread t1=new Thread(){
        public void run(){
            obj.printable(5);
        }
    };
    Thread t2=new Thread(){
        public void run(){
            obj.printable(100);
        }
    };
    t1.start();
    t2.start();
    }
}
