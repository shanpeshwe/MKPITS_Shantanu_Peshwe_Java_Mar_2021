//constructor chaining

public class ExampleOfThis4 {
    static class Customer
    {
        int custno;
        String custname;
        int amount;

        public Customer(int custno)
        {
            this.custno=custno;
        }

        public Customer(int custno,String custname)
        {
            this(custno);
            this.custname=custname;
        }

        public Customer(int custno,String custname,int amount)
        {
            this(custno,custname);
            this.amount=amount;
        }

        void displaydata()
        { System.out.println(custno + " : " + custname + " : " + amount );
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Customer c=new Customer(1);
            c.displaydata();
            Customer c1=new Customer(12,"raj");
            c1.displaydata();
            Customer c11=new Customer(12,"raj",888);
            c11.displaydata();
        }
    }
}