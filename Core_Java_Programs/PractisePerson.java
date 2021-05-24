public class PractisePerson {
    String name;
    String address;
    String mobile_no;

    void getdata(String name,String address,String mobile_no){
        this.name=name;
        this.address=address;
        this.mobile_no=mobile_no;
    }

    void displaydata(){
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+this.address);
        System.out.println("Mobile No. : "+this.mobile_no);
    }
}

    class student extends PractisePerson {
        int roll_no;

        void getdata(String name, String address, String mobile_no, int roll_no) {

            getdata(name, address, mobile_no);
            this.roll_no = roll_no;
        }

        void displaydata() {
            super.displaydata();
            System.out.println("Roll No. : " + this.roll_no);
        }

    }

    class parttimestudent extends student{
    int hrs;
    void getdata(String name, String address, String mobile_no, int roll_no,int hrs) {

        getdata(name, address, mobile_no,roll_no);
        this.hrs = hrs;
    }
        void displaydata() {
            super.displaydata();
            System.out.println("Hours : " + this.hrs);
        }
    }

     class test{
        public static void main(String[] args) {
        student s1=new student();
            String name="Shantanu";
            String address="Nagpur";
            String mobile_no= "1234567890";
            int roll_no=123;
            int hrs=3;
            s1.getdata(name,address,mobile_no,roll_no);
            s1.displaydata();

            parttimestudent ps1=new parttimestudent();
            ps1.getdata(name,address,mobile_no,roll_no,hrs);
            ps1.displaydata();
        }
    }
