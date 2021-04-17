//factorial of entered number using do while loop

import java.util.*;

public class FactorialUsingWhileLoop {
    public static void main(String[] args){
        int num, fact;
        char ch='y';
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter the number : ");
            num=sc.nextInt();
            fact = 1;
            while(num>0)
            {
                fact = fact * num;
                num--;
            }
            System.out.println("Factorial of the enter number is : "+fact);
            System.out.println("Do you want to continue y or n : ");
            ch=sc.next().charAt(0);
        } while (ch == 'y');
    }
}
