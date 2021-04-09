//Accept a number and print table of that number using for loop
import java.util.*;

public class PrintMultiplicationTableOfEnteredNum {
        public static void main(String[] args)
        {
            int cnt,num,res;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter any number : ");
            num=sc.nextInt();
            System.out.println("Multiplication Table of "+num+" is as follows : ");
            for(cnt=1;cnt<=10;cnt++)
            {
                res=num*cnt;
                System.out.println(num+"\tx\t"+cnt+"\t=\t"+res+"");
            }
        }
}