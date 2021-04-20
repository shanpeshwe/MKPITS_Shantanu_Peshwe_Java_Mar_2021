//create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.
import java.util.*;

class Account{
    int accountno;
    int balance=1000;

    String deposit(int accountno, int amount){
    return "Account class deposit method";
    }

    String withdraw(int accountno, int amount){
        return "Account class withdrawl method";
    }
}

class Saving extends Account{
    int interest=500;

    String deposit(int accountno, int amount){
        this.accountno=accountno;
        balance=balance+interest+amount;
        return"Amount deposited for account no :"+accountno+", Balance is :"+balance;
    }

    String withdraw(int accountno, int amount){
        this.accountno=accountno;

        if(amount>balance){
            return "Insufficient Funds";
        }

        balance=balance-amount;
        return"Amount withdrawn for account no :"+accountno+", Balance is :"+balance;
    }
}

public class OverridingEx4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account no : ");
        int accountno= sc.nextInt();
        System.out.println("Enter Amount : ");
        int amount= sc.nextInt();
        System.out.println("Do you want to deposit or withdraw");
        String ans=sc.next();
        String str;

        Saving s=new Saving();
        if(ans.equals("deposit")){
            str=s.deposit(accountno,amount);
            System.out.println(str);
        }
        else if (ans.equals("withdraw")){
            str=s.withdraw(accountno,amount);
            System.out.println(str);
        }
        else{
            System.out.println("Invalid entry");
        }
    }
}