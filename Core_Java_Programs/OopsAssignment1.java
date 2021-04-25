//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{
    String name;
    int roll_no;
}

public class OopsAssignment1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.roll_no=2;
        s.name="John";
        System.out.println("Student name is "+s.name+" and roll number is "+s.roll_no);
    }
}