//create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving inherited from account class and override the deposit and withdrawl method.
//create a subclass current  inherited from account  and override the deposit and withdrawl method.
import com.sun.source.tree.PackageTree;

import java.util.*;

class Account2{
    int accountno;
    int balance=1000;

    String deposit(int accountno, int amount){
        return "account class deposit method";
    }

    String withdraw(int accountno, int amount){
        this.accountno=accountno;
        if(amount>balance){
            return "Insufficient Funds";
        }
        balance=balance-amount;
        return "Account number "+accountno+", has balance = "+balance;
    }
}

class Saving2 extends Account2{
    int interest=500;
    String deposit(int accountno, int amount){
        this.accountno=accountno;
        balance=balance+interest+amount;
        return "Account number "+accountno+", has balance = "+balance;
    }
}

class Current2 extends Account2{
    String deposit(int accountno, int amount) {
        this.accountno = accountno;
        balance = balance + amount;
        return "Account number " +accountno + ", has balance = "+balance;
    }
}

public class PolymorphismEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account type saving or current :");
        String ans= sc.next();
        System.out.println("Enter account Number :");
        int accountno=sc.nextInt();
        System.out.println("Enter withdraw or deposit :");
        String typ=sc.next();
        System.out.println("Enter Amount : ");
        int amount=sc.nextInt();
        String str;
        Account2 act=null;

        if (ans.equals("saving")){
            act=new Saving2();
        }
        else if (ans.equals("current")) {
            act = new Current2();
        }
        else {
            System.out.println("Invalid Entry");
        }

        if(typ.equals("withdraw")){
            str=act.withdraw(accountno,amount);
            System.out.println(str);
        }
        else if(typ.equals("deposit")){
            str=act.deposit(accountno,amount);
            System.out.println(str);
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
}