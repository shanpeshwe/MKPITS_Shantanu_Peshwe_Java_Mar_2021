//program using initializing using method.

public class TestStudent2 {
    public static void main(String[] arg)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(111,"monika");
        s2.insertRecord(112,"yogita");
        s1.displayInformation();
        s2.displayInformation();
    }
}
