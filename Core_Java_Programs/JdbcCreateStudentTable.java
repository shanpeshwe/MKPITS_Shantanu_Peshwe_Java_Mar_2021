import java.sql.*;

public class JdbcCreateStudentTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/mkpits","root","");
            stm=con.createStatement();
            String str="create table student(roll_no int auto_increment primary key ,name varchar(30))";
            stm.executeUpdate(str);
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
