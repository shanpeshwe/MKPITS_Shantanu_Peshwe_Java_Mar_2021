//check entered number is prime number or not
import java.util.*;

public class CheckEnteredNumberPrimeOrNot {
    public static void main(String[] args){
        int num,cnt=2,rem;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number : ");
        num=sc.nextInt();

        while(cnt<num) {
            rem=num%cnt;
            if(rem==0)
            {
                break;
            }
            cnt++;
        }
        if (cnt==num)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not a prime number");
    }
}
