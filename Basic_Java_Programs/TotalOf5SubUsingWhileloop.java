//total,per and grade using for loop
import java.util.*;

public class TotalOf5SubUsingWhileloop {
    public static void main(String[] args){
        int sub, total = 0, cnt = 1;
        float per;
        Scanner sc=new Scanner(System.in);

        while (cnt <= 5)
        {
            System.out.println("Enter the Subject Marks out of 100 : ");
            sub=sc.nextInt();
            total = total + sub;
            cnt++;
        }
        System.out.println("Total Marks = "+total+" / 500");
        per = (total / 500.0f) * 100;
        System.out.println("Percentage = "+per);
        while (per >= 75)
        {
            System.out.println("Grade : Distinction");
            per = 0;
        }
        while (per >= 60 && per < 75)
        {
            System.out.println("Grade : First Class");
            per = 0;
        }
        while (per >= 40 && per < 60)
        {
            System.out.println("Grade : Second Class");
            per = 0;
        }
        while (per < 40 && per>0)
        {
            System.out.println("Yoy have failed the exam");
            per = 0;
        }
    }
}
