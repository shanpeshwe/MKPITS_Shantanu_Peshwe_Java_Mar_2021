import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mkpits", "root", "");
            //here mkpits is database name, root is username and password is not set so blank
            System.out.println("conncect");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}