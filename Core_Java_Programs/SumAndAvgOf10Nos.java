//Write a program to read 10 numbers from keyboard and find their sum and average.

import java.util.*;

public class SumAndAvgOf10Nos {
    public static void main(String[] args)
    {
        int cnt,n,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input the 10 numbers : ");
        for (cnt=1;cnt<=10;cnt++)
        {
            System.out.println("Enter Number-"+cnt+" :");
            n=sc.nextInt();
            sum=sum+n;
        }
        avg=(float)sum/10.0f;
        System.out.println("The sum of 10 no is : "+sum);
        System.out.println("The Average is : "+avg);
    }
}