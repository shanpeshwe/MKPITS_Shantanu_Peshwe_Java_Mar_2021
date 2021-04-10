/*Write a program to find the number and sum of all integer between 100 and 200 which are divisible by 9.
Numbers between 100 and 200, divisible by 9 :
108 117 126 135 144 153 162 171 180 189 198
The sum : 1683*/
import java.util.*;

public class SumOfAllNumbersDivisibleBy8Betn100And200 {
    public static void main(String[] args)
    {
        int num,rem,sum=0;

        System.out.println("Numbers divisible by 9 between 100 and 200 are : ");
        for(num=100;num<=200;num++)
        {
            rem=num%9;
            if(rem==0)
            {
                System.out.println(num);
                sum=sum+num;
            }
        }
        System.out.println("And sum of above numbers = "+sum);
    }
}