//example of hierarchical inheritance.
//create a base class person and create a student class derieved from person class
//and create another class employee derieved from person class
import  java.util.*;

class person6 {
    String name;
    String address;

    void getpersondata(String name,String address) {
        this.name=name;
        this.address=address;
    }

    void  displaypersondata() {
        System.out.println("name = " +name + "  address= "+ address);
    }
}

//creating a derieved class student
class student6 extends  person6 {
    int rno;
    int marks;

    public void getstudentdata(int rno,int marks,String name,String address) {
        getpersondata(name,address); // calling base class method with 2 par.
        this.rno=rno;
        this.marks=marks;
    }

    public void displaystudentdata() {
        displaypersondata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

//creating employee class
class employee extends  person6 {
    int empno;
    int salary;
    public void getemployeedata(int empno,int salary,String name,String address) {
        getpersondata(name,address); // calling base class method with 2 par.
        this.empno=empno;
        this.salary=salary;
    }

    public void displayemployeedata() {
        displaypersondata();
        System.out.println("empno " + empno);
        System.out.println("salary " + salary);
    }
}

public class HierarchalInheritanceEx{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter  student Rollno, name, address and marks :");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();

        student6 s=new student6(); // creating child class object
        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();

        System.out.println();
        System.out.println("enter  employee details");
        System.out.println("enter  empno");
        int empno=scan.nextInt();
        System.out.println("enter  employee name");
        String empname=scan.next();
        System.out.println("enter  employee address");
        String empaddress=scan.next();
        System.out.println("enter  employee salary");
        int salary=scan.nextInt();

        employee emp=new employee(); // creating child class object
        emp.getemployeedata(empno,salary,name,address);
        emp.displayemployeedata();
    }
}