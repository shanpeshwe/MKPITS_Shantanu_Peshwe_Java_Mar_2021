//to invoke current class constructor

public class ExampleOfThis3 {
    static class Customer
    {
        int custno;
        String custname;
        int amount;

        public Customer()
        {
            amount =1000;
            System.out.println("amount = " + amount);
        }

        public Customer(int custno,String custname)
        {
            this();
            this.custno=custno;
            this.custname=custname;

        }

        void displaydata()
        {
            System.out.println(custno + " : " + custname);
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Customer c=new Customer(222,"rajesh");
            c.displaydata();
        }
    }
}