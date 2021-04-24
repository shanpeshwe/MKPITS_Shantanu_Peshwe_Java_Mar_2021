//Example of Super 6

//creating a parent class person
import  java.util.*;

class person3 {
    String name;
    String address;

    person3(String name,String address) {
        this.name=name;
        this.address=address;
    }

    void  displaydata() {
        System.out.println("name = " +name + "  address= "+ address);
    }
}

//creating a derieved class student
class student3 extends  person3 {
    int rno;
    int marks;

    student3(int rno,int marks,String name,String address) {
        super(name,address); // calling base class constructor with 2 par.
        this.rno=rno;
        this.marks=marks;
    }

    void displaydata() {
        super.displaydata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

public class SuperEx6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter  student details Rollno, Name, Address and marks :");
        int rno=scan.nextInt();
        String name=scan.next();
        String address=scan.next();
        int marks=scan.nextInt();
        student3 s=new student3(rno,marks,name,address); // creating child class object
        s.displaydata();
    }
}