//wap to accept empno empname and basic_salary then calculate hra (15% of basic salary) , da (25% of basic) , ta (55% of basic) , total salary(basic_Salary + hra + da+ ta)

import java.util.Scanner;

public class SalaryBreakupPrintInFormat {
    public static void main(String[] args)
    {
        int cnt,empno,basicsal;
        String empname;
        float hra,da,ta,totalsal;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Employment No : ");
        empno=sc.nextInt();
        System.out.println("Enter the Employee Name : ");
        empname=sc.next();
        System.out.println("Enter the basic salary : ");
        basicsal=sc.nextInt();

        hra=0.15f*basicsal;
        da=0.25f*basicsal;
        ta=0.55F*basicsal;
        totalsal=basicsal+hra+ta+da;

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Emp.No.\tEmp.Name\t\t Basic Salary\t\t HRA\t\t DA\t\t TA\t\t Total Salary");
        System.out.println(empno+"\t\t\t" +empname+"\t\t\t"+ basicsal+"\t\t \t"+hra+" \t\t"+ da+" \t "+ta+" \t"+totalsal);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}
