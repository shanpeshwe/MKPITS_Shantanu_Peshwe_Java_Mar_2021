//real time downcasting ex-2

import java.util.*;

interface Account2{
    void deposit(int amt);
}

class saving2 implements Account2{
    public void deposit(int amt){
        System.out.println("deposit of saving");
    }
}

class current2 implements Account2{
    public void deposit(int amt){
        System.out.println("deposit of current");
    }
}

class Call2{
    void invoke(Account2 act){//upcasting
        if(act instanceof saving2){
            saving2 s=(saving2)act;//Downcasting
            s.deposit(200);
        }
        if(act instanceof current2){
            current2 c=(current2) act;//Downcasting
            c.deposit(200);
        }

    }
}//end of Call class

class Test2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Account2 ac=null;
        System.out.println("enter account type saving or current");
        String at=scan.next();
        if(at.equals("saving")) {
            ac=new saving2();
        }
        else if(at.equals("current")) {
            ac=new current2();
        }
        Call2 c=new Call2();
        c.invoke(ac);
    }
}
