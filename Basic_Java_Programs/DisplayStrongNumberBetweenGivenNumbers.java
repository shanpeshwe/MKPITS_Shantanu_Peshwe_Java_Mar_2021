/*Write a program to find Strong Numbers within a range of numbers.
Input starting range of number : 1
Input ending range of number: 200
Expected Output :
The Strong numbers are :
1 2 145 */
import java.util.*;

public class DisplayStrongNumberBetweenGivenNumbers {
     public static void main(String[] args)
    {
        int i, n, n1, s1,j,k,en,sn;
        int fact;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input starting range of number : ");
        sn=sc.nextInt();
        System.out.println("Input ending range of number: ");
        en=sc.nextInt();
        System.out.println("The Strong numbers are :");

        for(k=sn;k<=en;k++)
        {
            n1=k;
            s1=0;

            for(j=k;j>0;j=j/10)
            {

                fact = 1;
                for(i=1; i<=j % 10; i++)
                {
                    fact = fact * i;
                }
                s1 = s1 + fact;
            }

            if(s1==n1)

                System.out.println(n1);
        }
        System.out.println();
    }
}