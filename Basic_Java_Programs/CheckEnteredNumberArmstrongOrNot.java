//check entered number is armstrong number or not
import java.util.*;

public class CheckEnteredNumberArmstrongOrNot {
    public static void main(String[] args){
        int num,num1,rem,res=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        num1=num;
        while(num1!=0) {
            rem=num1%10;
            res=res+(rem*rem*rem);
            num1/=10;
        }

        if (res==num) {
            System.out.println(num+" is an Armstrong number");
        }
        else {
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
