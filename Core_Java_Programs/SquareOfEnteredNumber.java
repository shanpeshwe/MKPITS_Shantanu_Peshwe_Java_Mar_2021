//Square of the entered number

import java.util.*;

public class SquareOfEnteredNumber {
    public static void main(String[] args)
    {
        int num,sq;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        num=sc.nextInt();

        sq=num*num;

        System.out.println("Square of entered number : "+sq);
    }
}
