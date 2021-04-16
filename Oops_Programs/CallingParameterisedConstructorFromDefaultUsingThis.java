//calling parameterized constrctor from default constructor using this key word

public class CallingParameterisedConstructorFromDefaultUsingThis {
    static class Student
    {
        //creating default costructor
        public Student()
        {
            this(55); // calling parameterized constructor
            System.out.println("hello from default constructor");
            //calling parameterized constructor
        }
        //creating a parameterised constructor
        public Student(int r)
        {
            System.out.println("rno = " + r);
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Student s=new Student();// this will call default constructor
        }
    }

}
