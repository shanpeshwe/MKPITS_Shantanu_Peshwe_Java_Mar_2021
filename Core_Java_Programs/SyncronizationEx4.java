//accoutn class using anonymous class
import java.util.*;

//shared resource
class account1{
    int bal=1000;
    synchronized void deposit(){
        for (int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
            Scanner sc=new Scanner(System.in);
            System.out.println("enter amount to deposit");
            int amt=sc.nextInt();
            bal=bal+amt;
            System.out.println("amount deposit,bal is " + bal);

        }
    }
}
public class SyncronizationEx4 {
    public static void main(String[] args) {
        account1 a1=new account1();
        Thread t1=new Thread(){
            public void run(){
                a1.deposit();
                try {
                    Thread.sleep(1000);
                }catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        };
        t1.start();
        Thread t2=new Thread(){
            public void run(){
                a1.deposit();
                try {
                    Thread.sleep(1000);
                }catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        };
        t2.start();
    }
}
