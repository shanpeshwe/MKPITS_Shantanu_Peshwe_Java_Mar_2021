//wap to create a float array 0 10 elements to store salary of 10 employees
import java.util.*;

public class Enter10EmployeeSalaryAndDisplay {
    public static void main(String[] args) {
        float salary[]=new float[10];
        int cnt,a;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Enter the salary of "+cnt+" : ");
            salary[cnt]=sc.nextFloat();
        }

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Salary of "+cnt+" = "+salary[cnt]);
        }
    }
}
