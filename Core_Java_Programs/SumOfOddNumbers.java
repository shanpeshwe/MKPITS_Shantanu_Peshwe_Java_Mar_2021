//Write a program in C to display the n terms of odd natural number and their sum
import java.util.*;

public class SumOfOddNumbers {
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input number of terms : ");
        n=sc.nextInt();
        System.out.println("The odd numbers are :");
        for(i=1;i<=n;i++)
        {
            System.out.print("\t"+(i*2-1));
            sum=sum+(i*2-1);
        }
        System.out.println();
        System.out.println("The Sum of odd Number upto "+n+" terms : "+sum);
    }
}