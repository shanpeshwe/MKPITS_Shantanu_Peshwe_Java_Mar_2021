import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToSqlEx {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/mkpits","root","");
            System.out.println("Connected Successfully");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
