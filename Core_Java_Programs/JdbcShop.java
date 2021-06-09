//create a class JdbcShop having method to add, update, delete and search from shoptable .
//create a swing form to use the above class.
import java.sql.*;

public class JdbcShop {
    int shop_no;
    String city;
    String owner;
    String address;
    Connection con=null;
    Statement stmt=null;

    //For connection with MySql Database
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");

        }catch (Exception ee ) {
            System.out.println(ee.toString());
        }
    }

    //for executing query statement for MySql Database
    public void execute(String str){
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public  String addShop(int shop_no,String city,String owner,String address) {
        this.shop_no=shop_no;
        this.city=city;
        this.owner=owner;
        this.address=address;
        try {
            connect();
            String str = "insert into shop values(" + shop_no + ",'" + city + "','" + owner + "','" + address + "')";
            execute(str);
            return "Shop added successfully";
        }catch ( Exception ee) {
            return  ee.toString();
        }
    }

    public  String updateShop(int shop_no,String city,String owner,String address) {
        this.shop_no=shop_no;
        this.city=city;
        this.owner=owner;
        this.address=address;
        try {
            connect();
            String str = "update shop set city='" + city + "',owner='" + owner + "',address='" + address + "' where shop_no="+shop_no+"";
            execute(str);
            return "Shop updated successfully";
        }catch ( Exception ee) {
            return  ee.toString();
        }
    }

    public  String removeShop(int shop_no) {
        this.shop_no=shop_no;
        try {
            connect();
            String str = "delete from shop where shop_no="+shop_no+"";
            execute(str);
            return "Shop removed successfully";
        }catch ( Exception ee) {
            return  ee.toString();
        }
    }

    public  String searchShop(int shop_no) {
        this.shop_no=shop_no;
        int flag=0;
        String res=null;
        try {
            connect();
            String str = "select * from shop where shop_no="+shop_no+"";
            stmt = con.createStatement();
            ResultSet rs=   stmt.executeQuery(str);
            while (rs.next()) {
                flag=1;
                this.city=rs.getString("city");
                this.owner=rs.getString("owner");
                this.address=rs.getString("address");
            }
            rs.close();
            stmt.close();
            con.close();
            if(flag==0) {
                res="No record found";
            }
            return res;

        }catch ( Exception ee) {
            return  ee.toString();
        }
    }
}
