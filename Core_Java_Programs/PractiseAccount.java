import java.util.Scanner;

public abstract class PractiseAccount {
    int bal=1000;
    int acc_no;
    int amt;

    abstract void deposit(int amt,int acc_no);
}

class Saving extends PractiseAccount {
    int interest=500;
    void deposit(int amt,int acc_no){
        this.acc_no=acc_no;
        bal=bal+amt+interest;
        System.out.println("Account No. : "+this.acc_no);
        System.out.println("Balance is : "+bal);
    }
}

class Current extends PractiseAccount {
    void deposit(int amt,int acc_no){
        this.acc_no=acc_no;
        bal=bal+amt;
        System.out.println("Account No. : "+this.acc_no);
        System.out.println("Balance is : "+bal);
    }
}

class test2{
    public static void main(String[] args) {
        int amt;
        int acc_no;
        String acc_type;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Account Number : ");
        acc_no=sc.nextInt();
        System.out.println("Enter Amount :");
        amt=sc.nextInt();
        System.out.println("Enter Amount type 'Saving' or 'Current' :");
        acc_type=sc.next();

        PractiseAccount act=null;

        if(acc_type.equals("Current")){
                act=new Current();
                act.deposit(amt,acc_no);
        }
        else if(acc_type.equals("Saving")){
            act=new Saving();
            act.deposit(amt,acc_no);
        }
        else
            System.out.println("Invalid Account Type");
    }
}