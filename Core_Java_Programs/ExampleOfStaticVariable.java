public class ExampleOfStaticVariable {
    static class Employee1
    {
        int empno;
        String empname;
        static String company="mkpits";
        public Employee1(int e,String en)
        {
            empno=e;
            empname=en;
        }
        public void display()
        {
            System.out.println(empno + empname + company);
        }
    }
        public static void main(String[] args) {
            Employee1 emp1=new Employee1(11,"amit");
            Employee1 emp2=new Employee1(12,"raj");
            emp1.display();
            emp2.display();

            Employee1.company="mk placements";
            emp1.display();
            emp2.display();

            Employee1.company="MKPITS";
            emp1.display();
            emp2.display();
        }
    }