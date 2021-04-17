//Example of Constructor

public class Student2 {
        int id;
        String name;
        //creating constructor
        public  Student2(int i,String n)
        {
            id=i;
            name=n;
        }
        public void displayInformation()
        {
            System.out.println("id is " + id + " : name is " + name);

        }
    }

    class teststudent3
    {
        public static void main(String[] arg)
        {
            Student2 s1=new Student2(12,"raman");// it will call costructor automaically
            s1.displayInformation();
        }
    }