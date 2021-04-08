//wap to create a array 5 element to store salary of 5 employees then sum the salary and display it.
import java.util.*;

public class EnterSalaryArrayAndPrintSum {
    public static void main(String[] args) {
        float salary[]=new float[5]; //declaring an array of 5 elements
        //accepting no. from the user and storing it in an array
        int cnt;
        float sum=0.0f;
        float avg=0.0f;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt  < 5 ; cnt++)
        {
            System.out.println("enter salary of employee "+cnt);
            salary[cnt]=sc.nextFloat();
            sum=sum + salary[cnt];
        }
        System.out.println("total salary = "+sum);
        avg=sum / 5;
        System.out.println("average salary "+avg);
    }
}
