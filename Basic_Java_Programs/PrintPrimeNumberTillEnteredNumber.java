/*Write a program to find the prime numbers within a range of numbers.
Input starting number of range: 1
Input ending number of range : 50
Expected Output :
The prime number between 1 and 50 are :
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/
import java.util.*;

public class PrintPrimeNumberTillEnteredNumber {
    public static void main(String[] args)
    {
        int num,rem,sno,eno,cnt;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input starting number of range: ");
        sno=sc.nextInt();

        System.out.println("Input ending number of range : ");
        eno=sc.nextInt();
        System.out.println("The prime numbers between "+sno+" and "+eno+" are : ");

        for(num = sno;num<=eno;num++)
        {
            for (cnt=2;cnt<=num;cnt++)
            {
                rem=num%cnt;
                if(rem==0)
                {
                    break;
                }
            }
            if(cnt==num)
            {
                System.out.print("\t"+num);
            }
        }
    }
}