//create a function checkprimeno(int num) to check and display wheter the number is prime or not.
import java.util.*;

public class PrimeNumberUsingFunction {
    public static void checkprimeno (int num)
    {
        int cnt=2,rem;
        while (cnt<num)
        {
            rem=num%cnt;
            if(rem==0)
            {
                break;
            }
            cnt++;
        }
        if(cnt==num)
        {
            System.out.println(num+" is a Prime Number");
        }
        else
        {
            System.out.println(num+" is not a Prime Number");
        }

    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number :");
        num=sc.nextInt();
        checkprimeno(num);
    }
}
