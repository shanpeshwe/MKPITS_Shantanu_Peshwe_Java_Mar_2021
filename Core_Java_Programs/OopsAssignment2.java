//Assign and print the roll number, phone number and address of two students
// having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Student2{
    int rollno;
    String name;
    String phoneno;
    String address;

    void display() {
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+rollno);
        System.out.println("Address : "+address);
        System.out.println("Phone No. : "+phoneno);
    }
}

public class OopsAssignment2 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.name="Sam";
        s2.name="John";
        s1.phoneno="9823098230";
        s2.phoneno="9823898238";
        s1.address="Nagpur";
        s2.address="Amravati";
        s1.rollno=11;
        s2.rollno=12;
        System.out.println("Student 1 Data :");
        s1.display();
        System.out.println();
        System.out.println("Student 2 Data :");
        s2.display();
    }
}
