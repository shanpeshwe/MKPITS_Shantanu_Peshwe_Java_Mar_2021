//Super Ex.4

//creating a parent class person
import  java.util.*;
class person {
    String name;
    String address;

    void getdata(String name,String address) {
        this.name=name;
        this.address=address;
    }

    void  displaydata() {
        System.out.println("name = " +name + "  address= "+ address);
    }
}

//creating a derieved class student
class student extends  person {
    int rno;
    int marks;
    public void getdata(int rno,int marks,String name,String address) {
        getdata(name,address); // calling base class method with 2 par.
        this.rno=rno;
        this.marks=marks;
    }

    void displaydata() {
        super.displaydata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

public class SuperEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  student details Roll No., Name, Address and Marks :");
        int rno = scan.nextInt();
        String name = scan.next();
        String address = scan.next();
        int marks = scan.nextInt();

        student s = new student(); // creating child class object
        s.getdata(rno, marks, name, address);
        s.displaydata();
    }
}