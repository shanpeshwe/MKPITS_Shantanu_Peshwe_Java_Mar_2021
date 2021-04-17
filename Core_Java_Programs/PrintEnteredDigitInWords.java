//Write a program in C to read any digit, display in the word

import java.util.*;

public class PrintEnteredDigitInWords {
    public static void main(String[] args)
    {
        int d;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any digit from 0 to 9 : ");
        d=sc.nextInt();

        switch(d)
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("invalid digit");
                break;
        }
    }
}