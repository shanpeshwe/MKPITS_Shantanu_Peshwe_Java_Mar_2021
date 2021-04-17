/*Write a program in C to check whether a number is a palindrome or not.
Input a number: 121
Expected Output :
121 is a palindrome number.*/

import java.util.*;

public class CheckPalindromeNumber {
    public static void main(String[] args)
    {
        int num1,num2=0,rem,temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num1=sc.nextInt();
        temp=num1;
        while(num1!=0)
        {
            rem=num1%10;
            num1=num1/10;
            num2=num2*10+rem;
        }

        System.out.println("Num2 =  "+num2);
        if(num2==temp)
            System.out.println("Entered number "+temp+" is palindrome");
        else
            System.out.println("Entered number "+temp+" is not a palindrome");
    }
}
