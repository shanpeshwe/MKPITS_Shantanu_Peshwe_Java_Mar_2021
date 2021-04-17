//check prime number using do while loop
import java.util.*;

public class CheckPrimeNumberUsindDoWhileLoop {
    public static void main(String[] args){
        int num,cnt=2,rem;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();

        do {
            rem=num%cnt;
            if(rem==0)
            {
                break;
            }
            cnt++;
        }while(cnt<num);
        if(cnt == num) {
            System.out.println("Number is prime no.");
        }
        else {
            System.out.println("Number is not a prime no.");
        }
    }
}
