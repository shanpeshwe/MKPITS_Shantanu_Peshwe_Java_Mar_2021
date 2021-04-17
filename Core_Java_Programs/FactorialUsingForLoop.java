//factorial of entered number using for loop
import java.util.*;

public class FactorialUsingForLoop {
    public static void main(String[] args){
        int num,cnt,fact=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        num=sc.nextInt();

        for(cnt=num;cnt>0;cnt--) {
            fact=fact*cnt;
        }
        System.out.println("Factorial of the number "+num+" : "+fact);
    }
}
