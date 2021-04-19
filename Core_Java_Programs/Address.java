//In this example, Employee has an object of Address, address object contains its own informations
// such as city, state, country etc.
// In such case relationship is Employee HAS-A address.

public class Address {
    String city,state,country;
    public Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
    static class Employee{
        int id;
        String name;
        Address address;
        public Employee(int id,String name,Address address){
            this.id=id;
            this.name=name;
            this.address=address;
        }
        void Display(){
            System.out.println(id+name);
            System.out.println(address.city+address.state+address.country);
        }
    }

    public static void main(String[] args) {
        Address a1=new Address("a1","b1","c1");
        Address a2=new Address("a2","b2","c2");

        Employee e1=new Employee(111,"Shan",a1);
        e1.Display();

        Employee e2=new Employee(222,"shantanu",a2);
        e2.Display();
    }
}