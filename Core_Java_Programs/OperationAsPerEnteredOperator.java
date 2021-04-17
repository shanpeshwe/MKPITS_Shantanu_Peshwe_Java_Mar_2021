//perform operation as per entered operator

import java.util.Scanner;

public class OperationAsPerEnteredOperator {
    public static void main(String[] args){
        int num1, num2;
        float res;
        char ch = 'y';
        char op;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter 2 numbers : ");
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println("Enter the Operator + , - , * ,/ : ");
            op=sc.next().charAt(0);
            res = 0;

            if (op == '+')
                res = (float)num1 + num2;
            else if (op == '-')
                res = (float)num1 - num2;
            else if (op == '*')
                res = (float)num1 * num2;
            else if (op == '/')
                res = (float)num1 / num2;
            else
                System.out.println("Invalid character entered");
            System.out.println("Result = "+res);
            System.out.println("Do you want to continue y or no : ");
            ch=sc.next().charAt(0);
        } while (ch == 'y');
        System.out.println("\nBye");
    }
}
