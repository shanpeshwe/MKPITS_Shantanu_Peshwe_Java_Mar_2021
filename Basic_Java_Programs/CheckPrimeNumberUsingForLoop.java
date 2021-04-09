//check number prime or not usinf for loop
import java.util.*;

public class CheckPrimeNumberUsingForLoop {
    public static void main(String[] args){
        int cnt,rem,num,num1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        num1=num;

        for (cnt=2;cnt<num;++cnt)
        {
            rem=num%cnt;
            if(rem==0)
            {
                break;
            }
        }
        if (cnt==num1)
        {
            System.out.println("Entered number is prime number");
        }
        else
        {
            System.out.println("Entered number is not a prime number");
        }
    }
}
