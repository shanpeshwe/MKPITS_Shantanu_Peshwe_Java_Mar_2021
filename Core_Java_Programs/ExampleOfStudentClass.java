//Example of student class

public class ExampleOfStudentClass {
    public static  void main(String[] arg)
    {
        //creating object of student class
        Student s1=new Student();
        s1.getstudentdata(123,"amit");
        s1.displaystudentdata();
    }
}
//creating a class student
class Student {
    //member variable
    int rno;
    String name;
    // member functions
    void getstudentdata(int r, String n) {
        rno = r;
        name = n;
    }

    void displaystudentdata() {
        System.out.println("rno = " + rno);
        System.out.println("name = " + name);
    }
}

