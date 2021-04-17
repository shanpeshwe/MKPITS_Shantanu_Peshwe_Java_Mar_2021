//Find greater of two numbers

import java.util.*;

public class GreaterOf2Numbers {
    public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        num1=sc.nextInt();
        System.out.println("Enter number 2 : ");
        num2=sc.nextInt();

        if(num1>num2){
            System.out.println("Num1 is greater than num2");
        }
        else if(num2>num1){
            System.out.println("Num2 is greater than Num1");
        }
    }
}
