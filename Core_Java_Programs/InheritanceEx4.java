//calling getpersondata method from getstudentdata method .
import java.util.*;

class person4
{
    String name;
    String address;
    public void getpersondata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void  displaypersondata()
    {
        System.out.println("name = " +name + "  address= "+ address);
    }
}

//creating a derieved class student
class student4 extends  person4
{
    int rno;
    int marks;
    public void getstudentdata(int rno,int marks,String name,String address)
    {
        getpersondata(name,address); // calling base class method with 2 par.
        this.rno=rno;
        this.marks=marks;
    }
    public void displaystudentdata()
    {
        displaypersondata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

public class InheritanceEx4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter student Roll no, name, Address and marks :");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        student4 s=new student4(); // creating child class object

        s.getstudentdata(rno,marks,name,address);
        s.displaystudentdata();
    }
}