/*Write a program to display the number in reverse order.
Input a number: 123
Expected Output :
The number in reverse order is : 321*/
import java.util.*;

public class PrintNumInReverseOrder {
    public static void main(String[] args)
    {
        int num,rem;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            System.out.print(rem);
        }
    }
}