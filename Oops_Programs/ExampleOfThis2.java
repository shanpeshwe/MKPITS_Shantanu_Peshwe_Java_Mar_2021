//to refer to current class method

public class ExampleOfThis2 {
    static class Customer
    {
        int custno;
        String custname;

        void getdata(int custno,String custname)
        {
            this.custno=custno;
            this.custname=custname;
            this.displaydata();
        }

        void displaydata()
        {
            System.out.println(custno + " : " + custname);
        }
    }

    public static class Test{
        public static void main(String[] args) {
            Customer c=new Customer();
            c.getdata(111,"raju");
        }
    }
}
