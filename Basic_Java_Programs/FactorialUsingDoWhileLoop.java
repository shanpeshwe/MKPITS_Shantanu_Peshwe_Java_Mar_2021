//factorial of a number using do while loop
import java.util.*;

public class FactorialUsingDoWhileLoop {
    public static void main(String[] args){
        int num, fact=1;
        int temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        num=sc.nextInt();
        temp=num;

        do {
            fact = num * fact;
            num--;
        } while (num > 0);
        System.out.println("Factorial of "+temp+" is : "+fact);
    }
}
