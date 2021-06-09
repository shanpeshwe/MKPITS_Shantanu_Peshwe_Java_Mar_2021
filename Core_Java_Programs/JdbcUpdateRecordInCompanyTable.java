//create a program to update records into company table.(accept the value from the user).

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.*;

public class JdbcUpdateRecordInCompanyTable {
    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee Name : ");
        String NAME=sc.next();
        System.out.println("Enter Employee Age : ");
        Integer AGE=sc.nextInt();
        System.out.println("Enter Employee Address : ");
        String ADDRESS=sc.next();
        System.out.println("Enter Employee Salary : ");
        Double SALARY=sc.nextDouble();
        System.out.println("Enter Employee Joining date yyyy-mm-dd : ");
        String JOIN_DATE=sc.next();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits","root","");
            stm=con.createStatement();
            String str="update company set ID="+2+",NAME= '"+NAME+"' ,AGE= "+AGE+" ,ADDRESS= '"+ADDRESS+"' ,SALARY= "+SALARY+" ,JOIN_DATE=CURDATE() where ID=2";
            stm.executeUpdate(str);
            System.out.println("Record inserted successfully");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
