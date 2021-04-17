//create a class employee having fields empno,empname, designation, salary
//and method getemployeedata and displayemployeedata
import java.util.*;

public class ExampleOfEmployeeClass {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    employee e1=new employee();

    e1.getemployeedata("Shantanu",123,10000,"Agent");
    e1.displayemployeedata();
    }
    static class employee{
        String empname;
        int empno;
        int salary;
        String designation;

        void getemployeedata(String en,int eno,int s,String d){
            empname=en;
            empno=eno;
            salary=s;
            designation=d;
        }
        void displayemployeedata(){
            System.out.println("Employee name : "+empname);
            System.out.println("Employee number : "+empno);
            System.out.println("Employee salary : "+salary);
            System.out.println("Employee designation : "+designation);
        }
    }
}
