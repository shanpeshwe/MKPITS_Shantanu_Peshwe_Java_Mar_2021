//Calculate average age of 5
import java.util.*;

public class CalculateAverageAgeOf5UsingWhileLoop {
     public static void main(String[] args) {
        int cnt = 1,age,total=0;
        float avg;
        Scanner sc=new Scanner(System.in);

        while (cnt <= 5) {
            System.out.println("Enter the age in years : ");
            age= sc.nextInt();
            total = total + age;
            cnt++;
        }
        avg = total / 5.0f;
        System.out.println("Average age is : "+avg+" years");
    }
}
