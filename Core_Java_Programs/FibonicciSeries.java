/*Write a program to display the first n terms of Fibonacci series.
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34
*/

import java.util.*;

public class FibonicciSeries {
    public static void main(String[] args)
    {
        int num,cnt,sum=0,temp=1,a;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of terms to display : ");
        num=sc.nextInt();

        for(cnt=0;cnt<num;cnt++)
        {
            System.out.print("\t"+sum);
            a=sum+temp;
            sum=temp;
            temp=a;
        }
    }
}
