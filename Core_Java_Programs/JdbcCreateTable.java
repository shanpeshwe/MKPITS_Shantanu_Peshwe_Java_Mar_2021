import java.sql.*;

public class JdbcCreateTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            System.out.println("Connection created successfully");
            stm=con.createStatement();
            String str="create table employee(empid int primary key,empname varchar(50))";
            stm.executeUpdate(str);
            System.out.println("table Employee created successfully");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
