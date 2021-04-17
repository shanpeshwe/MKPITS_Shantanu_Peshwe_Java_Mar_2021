//Addition of two numbers

import java.util.*;

public class AdditionOf2Numbers
{
    public static void main(String[] args)
    {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        num1=sc.nextInt();
        System.out.println("Enter number 2 :");
        num2=sc.nextInt();

        sum=num1+num2;

        System.out.println("Sum of entered numbers : "+sum);
    }
}
