//create a function calculatefactorial(int num) to  calculate and display factorial of a number
import java.util.*;

public class FactorialOfaNumberUsingFunction {
    public static int calculatefactorial(int num)
    {
        int fact=1;
        do
        {
            fact=fact*num;
            num--;
        }while(num!=0);
        return fact;
    }

    public static void main(String[] args)
    {
        int num,res;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();
        res=calculatefactorial(num);
        System.out.println("Factorial of "+num+" is : "+res);
    }
}
