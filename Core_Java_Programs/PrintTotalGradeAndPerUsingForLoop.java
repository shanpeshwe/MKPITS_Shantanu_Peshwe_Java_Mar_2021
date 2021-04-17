//Accept 5 subject marks and print total, percentage and grade using for loop
import java.util.*;

public class PrintTotalGradeAndPerUsingForLoop {
    static public void main(String[] args) {
        int sub,total=0,cnt;
        float per;
        Scanner sc=new Scanner(System.in);

        for(cnt=1;cnt<=5;cnt++)
        {
            System.out.println("Enter the marks in subject : ");
            sub= sc.nextInt();
            total=total+sub;
        }
        System.out.println("Total marks of 5 subjects : "+total+" / 500");
        per=(float)(total*100.0f)/500.0f;
        System.out.println("Percentage : "+per);
        while (per<=100 && per>=75) {
            System.out.println("Grade : Distinction");
            break;
        }
        while (per<75 && per>=60) {
            System.out.println("Grade : First Division");
            break;
        }
        while (per<60 && per>=40) {
            System.out.println("Grade : Second Division");
            break;
        }
        while (per<40) {
            System.out.println("Grade : You are Fail");
            break;
        }
    }
}
