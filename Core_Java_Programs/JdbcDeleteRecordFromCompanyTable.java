//create a program to delete records into company table.(accept the value from the user).

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.*;

public class JdbcDeleteRecordFromCompanyTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        Scanner sc=new Scanner(System.in);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            stm=con.createStatement();
            String str="delete from company where ID=2";
            stm.executeUpdate(str);
            System.out.println("Record deleted successfully");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
