//create a class student having member variable rno and name
//and member functions getdata and showdata.
import java.util.*;

public class ExampleOfClassAndMember {

    public static class Student {
        //member variable
        int rno;
        String name;
        // member functions
        void getstudentdata(int r,String n )
        {
            rno=r;
            name=n;
        }
        void showstudentdata()
        {
            System.out.println("rno = " + rno);
            System.out.println("name = " + name);
        }
        public static void main(String[] arg)
        {
            Scanner s=new Scanner(System.in);
            Student stud=new Student();
            System.out.println("enter rno and name");
            int r=s.nextInt();
            String n=s.next();

            stud.getstudentdata(r,n);
            stud.showstudentdata();
        }
    }

}
