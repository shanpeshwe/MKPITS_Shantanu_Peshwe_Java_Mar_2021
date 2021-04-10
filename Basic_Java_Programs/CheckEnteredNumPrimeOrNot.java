//Write a program to determine whether a given number is prime or not.
import java.util.*;

public class CheckEnteredNumPrimeOrNot {
    public static void main(String[] args)
    {
        int num,cnt,rem;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number to Check : ");
        num=sc.nextInt();

        for (cnt=2;cnt<=num;cnt++)
        {
            rem=num%cnt;
            if(rem==0)
            {
                break;
            }
        }
        if(cnt<num)
        {
            System.out.println("Number "+num+" is not prime number");
        }
        if(cnt==num)
        {
            System.out.println("Number "+num+" is prime number");
        }
    }
}
