//program to check whether a given number is an armstrong number or not.
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        int n,r,sum=0,temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number=");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
            System.out.println("armstrong  number ");
        else
            System.out.println("not armstrong number");
    }
}
