//Write a program to find the largest of three numbers

import java.util.*;

public class GreatestAmong3Nos {
    public static void main(String[] args)
    {
        int num1, num2, num3;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num1 : ");
        num1=sc.nextInt();
        System.out.print("\nEnter num2 : ");
        num2=sc.nextInt();
        System.out.print("\nEnter num3 : ");
        num3=sc.nextInt();

        if (num1>num2)
            if(num1>num3)
                System.out.println("Num1 "+num1+" is the greatest number");
            else
                System.out.print("Num3 "+num3+" is greatest number");
        else if (num2>num3)
            System.out.print("Num2 "+num2+" is greatest number");
        else
            System.out.print("Num3 "+num3+" is greatest number");
    }
}