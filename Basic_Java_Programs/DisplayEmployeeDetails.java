//wap to accept empno,basic_salary, empname, designation and then display emp details
import java.util.*;

public class DisplayEmployeeDetails {
    public static void main(String[] args){
        int empno,basic_salary;
        String empname;
        String designation;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee number : ");
        empno=sc.nextInt();
        System.out.println("Enter employee name : ");
        empname=sc.next();
        System.out.println("Enter basic salary : ");
        basic_salary=sc.nextInt();
        System.out.println("Enter employee designation : ");
        designation=sc.next();

        System.out.println("Name : "+empname);
        System.out.println("Employee no. : "+empno);
        System.out.println("basic Salary : "+basic_salary);
        System.out.println("Designation : "+designation);
    }
}
