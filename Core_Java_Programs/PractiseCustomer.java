import java.util.Scanner;

public class PractiseCustomer {
    private int c_id;
    private String c_name;
    private String c_address;

    public PractiseCustomer(){
        this.c_id=123;
        this.c_name="shan";
        this.c_address="Nagpur";
    }

    public PractiseCustomer(int c_id, String c_name, String c_address){
        this.c_id=c_id;
        this.c_name=c_name;
        this.c_address=c_address;
    }

    void setdata(int c_id,String c_name,String c_address){
        this.c_id=c_id;
        this.c_name=c_name;
        this.c_address=c_address;
    }

    void getdata(){
        System.out.println("Customer ID : "+this.c_id);
        System.out.println("Customer Name : "+this.c_name);
        System.out.println("Customer Address : "+this.c_address);

    }

    public static void main(String[] args) {
        int c_id;
        String c_name;
        String c_address;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Customer ID : ");
        c_id=sc.nextInt();
        System.out.println("Enter Customer Name : ");
        c_name=sc.next();
        System.out.println("Enter Customer Address : ");
        c_address=sc.next();
        PractiseCustomer c1=new PractiseCustomer(c_id,c_name,c_address);
        //c1.setdata(c_id,c_name,c_address);

        c1.getdata();
    }
}