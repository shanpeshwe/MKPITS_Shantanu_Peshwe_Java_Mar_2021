//class having constructor and method with the same name of class

public class Student {int id;
    String name;
    int age;

    //creating constructor with 2 parameters
    public  Student(int i,String n)
    {
        id=i;
        name=n;
    }

    //overloading constructor with 3 parameters
    public  Student(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }

    public void displayInformation()
    {
        System.out.println("id is " + id + " : name is " + name + "age is "+ age);

    }

    public void Student()
    {
        System.out.println("hello from student method");
    }
}

class teststudent
{
    public static void main(String[] arg)
    {
        Student s1=new Student(12,"raman");// it will call costructor 2automaically
        s1.displayInformation();
        Student s2=new Student(13,"manish",22); // call 3 paremter const
        s2.displayInformation();
        s2.Student();
    }
}
