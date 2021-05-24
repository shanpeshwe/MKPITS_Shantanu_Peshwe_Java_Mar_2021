//example account class
import java.util.*;

//shared resource
class account{
    int bal=1000;
    synchronized void deposit(){
        for (int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
            Scanner sc=new Scanner(System.in);
            System.out.println("enter amount to be deposited :");
            int amt=sc.nextInt();
            bal=bal+amt;
            System.out.println("amount deposited,bal is " + bal);
        }
    }
}
//creating thread 1 class
class Accountthread1 extends Thread{
    account act;
    public Accountthread1(account act){
        this.act=act;
    }
    public void run(){
        act.deposit();
        try {
            Thread.sleep(1000);
        }catch (Exception ee)
        {

        }
    }
}
//creating thread 2 class
class Accountthread2 extends Thread{
    account act;
    public Accountthread2(account act){
        this.act=act;
    }
    public void run(){
        act.deposit();
        try {
            Thread.sleep(1000);
        }catch (Exception ee)
        {

        }
    }
}
public class SyncronizationEx2 {
    public static void main(String[] args) {
    account a=new account();
    Accountthread1 t1=new Accountthread1(a);
    t1.start();
    Accountthread2 t2=new Accountthread2(a);
    t2.start();
    }
}
