//function returning a value and with parameters
//create a function calcualte with 2 int parameters and return the sum of 2 no.
import java.util.*;

public class ExampleOfFunctionWithReturnTypeAndWithParamaters2 {
    public static int sum()
    {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=num1+num2;
        return sum;
    }

    public static void main(String[] args)
    {
        int res;
        res=sum();
        System.out.println("Sum of 2 numbers = "+res);
    }
}
