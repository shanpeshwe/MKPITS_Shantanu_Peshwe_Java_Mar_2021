//operation of deposit and withdraw from saving or current using downcasting to select account type

import java.util.*;

interface Account3{
    int interest=500;
    void operation3(String type2,int amount);
}

class Saving3 implements Account3 {
    int balance=1000;
    public void operation3(String type2, int amount) {
        if (type2.equals("deposit")) {
            balance = balance + amount + interest;
            System.out.println("Balance is : " + balance);
        }
        else if (type2.equals("withdraw")) {
            if (amount > balance) {
                System.out.println("Insufficient Funds");
            }
            else {
                balance = balance - amount;
                System.out.println("Balance is : " + balance);
            }
        }
        else{
            System.out.println("Invalid method type entered");
        }
    }
}

class Current3 implements Account3{
    int balance=1000;
    public void operation3(String type2, int amount) {
        if (type2.equals("deposit")) {
            balance = balance + amount;
            System.out.println("Balance is : " + balance);
        }
        else if (type2.equals("withdraw")) {
            if (amount > balance) {
                System.out.println("Insufficient Funds");
            }
            else {
                balance = balance - amount;
                System.out.println("Balance is : " + balance);
            }
        }
        else{
            System.out.println("Invalid method type entered");
        }
    }
}

class Call3 {
    void select(Account3 type1, String type2, int amount) {
        if (type1 instanceof Saving3) {
            Saving3 s = (Saving3) type1;//Downcasting
            s.operation3(type2, amount);
        }
        if (type1 instanceof Current3) {
            Current3 c = (Current3) type1;//Downcasting
            c.operation3(type2, amount);
        }
    }
}//end of call calss

class Test3{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Account3 act=null;
        System.out.println("Enter the account saving or current :");
        String type1=sc.next();
        System.out.println("Enter withdraw or deposit :");
        String type2=sc.next();
        System.out.println("Enter amount :");
        int amount=sc.nextInt();


    if(type1.equals("saving")) {
        act=new Saving3();
    }
    else if(type1.equals("current")) {
        act=new Current3();
    }
    else{
        System.out.println("Invalid Account type entered");
    }
    Call3 c=new Call3();
    c.select(act,type2,amount);
    }
}