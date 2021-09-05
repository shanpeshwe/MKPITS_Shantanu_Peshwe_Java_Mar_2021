/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cablecms;

import java.sql.Statement;
import java.sql.Connection;


/**
 *
 * @author COM
 */
public class AddAdmin {
    public static String addAdmin(String companyname, String username, String email, String contactnumber, String password) {
                Statement stmt = null;
                String res1=null;
                try {
                    Connection con = DbConnect.getConnection();
                    String qr = "insert into admin (companyname,username,emailaddress,contactnumber,password) values ('" + companyname + "','" + username + "','" + email + "','" + contactnumber + "','" + password + "')";
                    stmt = con.createStatement();
                    stmt.executeUpdate(qr);
                    res1="record inserted successfully";
                } catch (Exception e) {
                    System.out.println(e);
                }
                return res1;
            }
}
