//create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 2 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method.
import java.util.*;

class Account2 {
    int accountno;
    int amount;
    int balance=1000;
    int interest=500;

    void Account2(int accountno, int amount) {
        this.accountno = accountno;
        this.amount = amount;
    }

    void display(){
        this.balance=balance;
        System.out.println("balance in Account no. "+accountno+" is : "+balance);
    }
}

class Saving2 extends Account2{
    void Saving2(int accountno,int amount){
        super.Account2(accountno,amount);
    }

    String deposit(int accountno,int amount){
        Account2(accountno,amount);
        balance=balance+amount+interest;
        super.display();
        return null;
    }

    String withdraw(int accountno,int amount){
        Account2(accountno,amount);
        if (amount>balance){
            System.out.println("Insufficient Funds");
            return null;
        }
        balance=balance-amount;
        super.display();
        return null;
    }

    void display(){
        System.out.println("display from Saving2");
    }
}

public class SuperAssignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account no.");
        int accountno=sc.nextInt();
        System.out.println("Enter deposit or withdraw :");
        String ans=sc.next();
        System.out.println("Enter the Amount :");
        int amount=sc.nextInt();
        Saving2 s=new Saving2();

        if (ans.equals("deposit")){
            s.deposit(accountno,amount);
        }
        else if (ans.equals("withdraw")){
            s.withdraw(accountno,amount);
        }
        else {
            System.out.println("Invalid Entry");
        }
    }
}