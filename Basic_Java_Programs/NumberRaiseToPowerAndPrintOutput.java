//Write a program in C to display the power of the number upto given an integer. eg 2 raise 3 = 8

import java.util.*;

public class NumberRaiseToPowerAndPrintOutput {
    public static void main(String[] args)
    {
        int num,a,cnt,sum=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        System.out.println("Enter the raise to power : ");
        a=sc.nextInt();

        for (cnt=1;cnt<=a;cnt++)
        {
            sum=sum*num;
        }
        System.out.println(num+" to the power "+a+" = "+sum);
    }
}
