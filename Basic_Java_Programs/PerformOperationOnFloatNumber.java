//Perform Operation + or - on float numbers

import java.util.Scanner;

public class PerformOperationOnFloatNumber {
    public static void main(String[] args) {
        float num1,num2,res;
        char op;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1 :");
        num1=sc.nextFloat();
        System.out.println("Enter number 2 :");
        num2=sc.nextFloat();
        System.out.println("Enter the Operation + or - :");
        op=sc.next().charAt(0);

        if (op=='+') {
            res = num1 + num2;
            System.out.println("Sum of above numbers : " + res);
        }
        else if(op=='-') {
            res = num1 - num2;
            System.out.println("Subtraction of above numbers : " + res);
        }
        else {
            System.out.println("Invalid Character Entered");
        }
    }
}