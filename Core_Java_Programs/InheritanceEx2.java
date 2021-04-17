//create  a parent class person having field name and address  and  create a derived class student
//inherited from person class having additional fields rno and marks.
// and methods getstudentddata and displaystudent data.
import java.util.*;

class person1
{
    String name;
    String address;
}
//creating a derieved class student
class student1 extends  person
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks,String name,String address)
    {
        this.rno=rno;
        this.marks=marks;
        this.name=name;
        this.address=address;
    }
    public void displaystudentdata()
    {
        System.out.println(rno + " : " + name + " : " + address +" : "+ marks);
    }
}

public class InheritanceEx2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter student details");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        student1 s=new student1();
        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();
    }
}