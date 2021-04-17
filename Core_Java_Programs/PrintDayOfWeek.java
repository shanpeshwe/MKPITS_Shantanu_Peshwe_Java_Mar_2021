//Write a program in C to read any day number in integer and
//display day name in the word
import java.util.*;

public class PrintDayOfWeek {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter day number from 1 to 7 : ");
        n=sc.nextInt();

        if (n ==1)
        {
            System.out.println("\nMonday");
        }
        else if(n==2)
            System.out.println("\nTuesday");
        else if(n==3)
            System.out.println("\nWednesday");
        else if(n==4)
            System.out.println("\nThursday");
        else if(n==5)
            System.out.println("\nFriday");
        else if(n==6)
            System.out.println("\nSaturday");
        else if(n==7)
            System.out.println("\nSunday");
        else
            System.out.println("\nEnter a valid number");
    }
}
