//Find Greater of 3 numbers
import java.util.*;

public class GreaterOf3Numbers {
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num1 : ");
        num1=sc.nextInt();
        System.out.println("Enter num2 : ");
        num2=sc.nextInt();
        System.out.println("Enter num3 : ");
        num3=sc.nextInt();

        if(num1>num2 && num1>num3){
                System.out.println("Num1 is the greatest number");
        }
        if(num2>num1 && num2>num3){
                System.out.println("Num2 is greatest number");
        }
        if(num3>num1 && num3>num2){
            System.out.println("Num3 is greatest number");
        }
    }
}
