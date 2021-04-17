//create  a parent class person having field name and
// address and methods getpersondata and displaypersondata  and  create a derived class student
//inherited from person class having additional fields rno and marks.
//and methods getstudentddata and displaystudent data.
import java.util.*;

class Person2{
    String name;
    String address;

    public void getpersondata(String name,String address) {
    this.name=name;
    this.address=address;
    }

    public void displaypersondata(){
    System.out.println("Name : "+name+" and Address : "+address);
    }
}

class Student2 extends Person2{
    int rollno;
    int marks;

    public void getpersondata(int rollno,int marks) {
    this.rollno=rollno;
    this.marks=marks;
    }

    public void displaystudentdata(){
        System.out.println("roll no. : "+rollno+" and Marks : "+marks);
    }
}

public class InheritanceEx3 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Name, Address, rollnumber and marks : ");
    String name=sc.next();
    String address=sc.next();
    int rollno=sc.nextInt();
    int marks=sc.nextInt();
    Student2 s=new Student2();

    s.getpersondata(name,address);
    s.getpersondata(rollno,marks);
    s.displaypersondata();
    s.displaystudentdata();
    }
}