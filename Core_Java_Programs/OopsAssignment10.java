//Write a program that would print the information (name, year of joining, salary, address)
// of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Samuel             2000                68D- WallsStreat
//John                1999                26B- WallsStreat

class Employee{
    String name;
    int yoj;
    String address;

    void displaydata(){
        System.out.println(name+"\t\t\t"+yoj+"\t\t\t"+address);
    }
}

public class OopsAssignment10 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Robert";
        e1.yoj=1994;
        e1.address="64C - WallsStreet";

        Employee e2=new Employee();
        e2.name="Samuel";
        e2.yoj=2000;
        e2.address="68D - WallsStreet";

        Employee e3=new Employee();
        e3.name="John";
        e3.yoj=1999;
        e3.address="26B - WallsStreet";

        System.out.println("Name\t\tYear of Joining\t\t\tAddress");
        e1.displaydata();
        e2.displaydata();
        e3.displaydata();
    }
}