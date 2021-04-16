//create a class customer having field custno and custname and method getdata and showdata

public class ExampleOfThis1 {
    static class Customer
    {
        int custno;
        String custname;

        void getdata(int custno,String custname)
        {
            this.custno=custno;
            this.custname=custname;
        }

        void displaydata()
        {
            System.out.println(custno + " : " + custname);
        }
    }

    static class Test{
        public static void main(String[] args) {
            Customer c=new Customer();
            c.getdata(111,"raju");
            c.displaydata();
        }
    }
}
