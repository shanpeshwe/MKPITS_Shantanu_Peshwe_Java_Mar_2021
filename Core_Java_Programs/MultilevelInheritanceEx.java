//example of multilevel inheritance
//create a class person , then create a class student
//derived from person class and then create a class parttimestudent derieved from student class
import  java.util.*;

class person5 {
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
class student5 extends person5 {
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
//creating parttimestudent
//creating a derieved class student
class parttimestudent extends  student5{
    int hours;

    public void getparttimestudentdata(int rno,int marks,String name,String address,int hours)
    {
        getstudentdata(rno,marks,name,address); // calling base class method with 2 par.
        this.hours=hours;
    }
    public void displayparttimestudentdata()
    {
        displaystudentdata();
        System.out.println("no of hours " + hours);
    }
}

public class MultilevelInheritanceEx {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter part-time student Roll no., Name, Address, Marks and hours :");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        int hours=scan.nextInt();
        parttimestudent s=new parttimestudent(); // creating child class object

        s.getparttimestudentdata(rno,marks,name,address,hours);
        s.displayparttimestudentdata();
    }
}