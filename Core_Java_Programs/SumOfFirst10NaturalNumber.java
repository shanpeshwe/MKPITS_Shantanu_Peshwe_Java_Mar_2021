//Write a C program to find the sum of first 10 natural numbers.

public class SumOfFirst10NaturalNumber {
    public static void main(String[] args)
    {
        int i;
        int sum=0;
        for (i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of first 10 natural numbers = "+sum);
    }
}
