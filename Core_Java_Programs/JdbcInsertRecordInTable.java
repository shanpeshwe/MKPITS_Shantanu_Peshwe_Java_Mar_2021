//insert record in employee created table

import java.sql.*;
import java.util.*;

public class JdbcInsertRecordInTable {
    public static void main(String[] args) {
        Connection con = null;
        Statement stm = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter empno: ");
        int empid = sc.nextInt();
        System.out.println("enter empname: ");
        String empname = sc.next();

        try {
            //code to connect java with mysql database
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits", "root", "");
            System.out.println("connected successfully ");
            stm = con.createStatement();
            String str = "insert into employee(empid,empname) values(" + empid + ",'" + empname + "')";
            stm.executeUpdate(str);
            System.out.println("record inserted successfully");
            con.close();
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }

    }
}
