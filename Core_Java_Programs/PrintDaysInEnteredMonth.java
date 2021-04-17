//Write a program to read any Month Number in integer and
//display the number of days for this month

import java.util.*;
public class PrintDaysInEnteredMonth {
    public static void main(String[] args)
    {
        int m;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any month from 0 to 12 : ");
        m=sc.nextInt();

        switch(m)
        {
            case 1:
                System.out.print("January : 31 Days");
                break;
            case 2:
                System.out.print("February : 28 Days");
                break;
            case 3:
                System.out.print("March : 31 Days");
                break;
            case 4:
                System.out.print("April : 30 Days");
                break;
            case 5:
                System.out.print("May : 31 Days");
                break;
            case 6:
                System.out.print("June : 30 Days");
                break;
            case 7:
                System.out.print("July : 31 Days");
                break;
            case 8:
                System.out.print("August : 31 Days");
                break;
            case 9:
                System.out.print("September : 30 Days");
                break;
            case 10:
                System.out.print("October : 31 Days");
                break;
            case 11:
                System.out.print("November : 30 Days");
                break;
            case 12:
                System.out.print("December : 31 Days");
                break;
            default:
                System.out.print("invalid Entry");
                break;
        }
    }
}