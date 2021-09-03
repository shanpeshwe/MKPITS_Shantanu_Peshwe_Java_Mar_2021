/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cablecms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author COM
 */
public class LoginAuthentication {

    public static String loginAuthentication(String username, String password) {
        Statement stmt = null;
        String res1 = "User Not Found, Please register below!!";

        try {
            Connection con = DbConnect.getConnection();
            String qr = "select * from admin where username = '" + username + "' and password = '" + password + "'";
            PreparedStatement ps = con.prepareStatement(qr);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                username = resultSet.getString("username");
                password = resultSet.getString("password");
                res1 = "Login Successful";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return res1;
    }
}
