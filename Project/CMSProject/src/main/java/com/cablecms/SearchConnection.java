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
public class SearchConnection {

    public static ResultSet searchConnection(String name,String setupboxno) {
        Statement stmt = null;
        ResultSet resultSet = null;
        String qr;
        try {
            Connection con = DbConnect.getConnection();
            if (name != null && name.length() > 0 && setupboxno != null && setupboxno.length() > 0) {
                qr = "select `setupboxno`, `firstname`,`lastname`,`status` from `customer` where `firstname`='" + name + "' and `setupboxno`='" + setupboxno + "'";
            } else if (setupboxno != null && setupboxno.length() > 0) {
                qr = "select `setupboxno`, `firstname`,`lastname`,`status` from `customer` where `setupboxno`='" + setupboxno + "' ";
            } else if (name != null && name.length() > 0) {
                qr = "select `setupboxno`, `firstname`,`lastname`,`status` from `customer` where `firstname`='" + name + "' "; 
            } else {
                qr = "select `setupboxno`, `firstname`,`lastname`,`status` from `customer`";
            }
            PreparedStatement ps = con.prepareStatement(qr);
            resultSet = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultSet;
    }
}
