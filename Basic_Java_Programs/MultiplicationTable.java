//Write a program in C to display the multiplication table of a given integer.
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        int j,n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input any number : ");
        n=sc.nextInt();
        System.out.println();
        for(j=1;j<=10;j++)
        {
            System.out.println(n+" X "+j+" = "+n*j );
        }
    }
}
