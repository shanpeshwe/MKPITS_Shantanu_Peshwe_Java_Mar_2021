//create a program to view records into company table.(accept the value from the user).

import java.sql.*;
import java.util.*;

public class JdbcViewRecordFromCompanyTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        Scanner sc=new Scanner(System.in);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            stm=con.createStatement();
            String str="select * from company where ID=3";
            ResultSet rs=stm.executeQuery(str);
            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
