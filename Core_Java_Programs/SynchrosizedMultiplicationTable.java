import java.util.*;

public class SynchrosizedMultiplicationTable {

    synchronized void Table(int n){
        int i,res;
        for(i=1;i<11;i++){
            res=n*i;
            System.out.println(n+" x "+i+" = "+res);
        }
    }

    public static void main(String[] args) {
        SynchrosizedMultiplicationTable s=new SynchrosizedMultiplicationTable();

        Thread t1=new Thread(){
            public void run(){
                s.Table(1);
            }
        };
        t1.start();

        Thread t2=new Thread(){
            public void run(){
                s.Table(2);
            }
        };
        t2.start();

        Thread t3=new Thread(){
            public void run(){
                s.Table(3);
            }
        };
        t3.start();

        Thread t4=new Thread(){
            public void run(){
                s.Table(4);
            }
        };
        t4.start();

        Thread t5=new Thread(){
            public void run(){
                s.Table(5);
            }
        };
        t5.start();
    }
}
