//

public class Student {
    int id;
    String name;
    public void insertRecord(int i,String n)
    {
        id=i;
        name=n;
    }
    public void displayInformation()
    {
        System.out.println("id is " + id + " : name is " + name);

    }

}

class teststudent
{
    public static void main(String[] arg)
    {
        Student s1=new Student();
        s1.id=111;
        s1.name="manisha";
        System.out.println("id is " + s1.id);
        System.out.println("name is " + s1.name);
    }
}
