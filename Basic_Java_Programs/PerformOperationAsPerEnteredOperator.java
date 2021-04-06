//wap to accept 2 no. and operator like +,-
//and display the result

import java.util.*;

public class PerformOperationAsPerEnteredOperator {
    public static void main(String[] args) {
        int num1,num2,res;
        char op;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1 :");
        num1=sc.nextInt();
        System.out.println("Enter number 2 :");
        num2=sc.nextInt();
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
