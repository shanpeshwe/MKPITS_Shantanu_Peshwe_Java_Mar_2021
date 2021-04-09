//function returning a value and with parameters
//create a function calcualte with 2 int parameters and return the sum of 2 no.
import java.util.*;

public class ExampleOfFunctionWithReturnTypeAndWithParamater {
    public static int sum(int n1, int n2)
    {
        int sum;
        sum=n1+n2;
        return sum;
    }

    public static void main(String[] args)
    {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        res=sum(num1,num2);
        System.out.println("Sum of 2 numbers = "+res);
    }
}
