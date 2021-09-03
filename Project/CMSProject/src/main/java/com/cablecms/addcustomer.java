package com.cablecms;

//import static java.awt.Event.INSERT;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author sony
 */
public class AddCustomer {

    public static String addcustomer(String firstname, String lastname, String phoneno, String address, String email, String packageamount, String area, String balance, String setupboxno, String status) {
        Statement stmt;
        String res1;
        try {
            Connection con = DbConnect.getConnection();
            String qr = "INSERT INTO customer(firstname,lastname,phoneno,address,email,packageamount,area,balance,setupboxno,status) VALUES ('" + firstname + "','" + lastname + "','" + phoneno + "','" + address + "','" + email + "','" + packageamount + "','" + area + "','" + balance + "','" + setupboxno + "','" + status + "')";
            //String qr ="INSERT INTO customer(firstname) VALUES('ratan')";                  
            stmt = con.createStatement();
            stmt.executeUpdate(qr);
            res1 = "record inserted successfully ";
        } catch (Exception e) {
            System.out.println(e);
            res1 = e.toString();
        }
        return res1;
    }
}
