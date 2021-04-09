//- function not returning any value and with parameters.
//create a function calculate with 2 integer parameters and calculate and display the addition of 2 no.
import java.util.*;

public class ExampleOfFunctionWithNoReturnTypeAndWithparamaters2 {
    public static void sum(int num1,int num2)
    {
        int sum;
        sum=num1+num2;
        System.out.println("Sum of 2 numbers = "+sum);
    }

    public static void main(String[] args)
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum(n1,n2);
        System.out.println("Return to Main");
    }
}
