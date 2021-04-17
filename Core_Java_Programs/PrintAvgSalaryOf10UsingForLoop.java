//Accept salary of 10 and print average salary using for loop
import java.util.*;

public class PrintAvgSalaryOf10UsingForLoop {
    public static void main(String[] args) {
        int cnt,salary,total=0;
        float avg;
        Scanner sc=new Scanner(System.in);

        for(cnt=1;cnt<=10;cnt++)
        {
            System.out.println("Enter the Salary of "+cnt+" Person : ");
            salary=sc.nextInt();
            total=total+salary;
        }
        avg=(float)total/10.0f;
        System.out.println("Average Salary : "+avg);
    }
}
