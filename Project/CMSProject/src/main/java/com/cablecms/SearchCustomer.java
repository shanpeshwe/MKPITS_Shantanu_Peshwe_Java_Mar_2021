/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cablecms;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchCustomer {

    public static ResultSet searchCustomer (String name, String status) {
        Statement stmt = null;
        ResultSet resultSet = null;
        String qr;
        try {
            Connection con = DbConnect.getConnection();
            if (name != null && name.length() > 0 && status != null && status.length() > 0) {
                qr = "select `firstname`, `lastname`,`area`,`packageamount`,`balance`,`status` from `customer` where `firstname`='" + name + "' and `status`='" + status + "' ";
            } else if (status != null && status.length() > 0) {
                qr = "select `firstname`, `lastname`,`area`,`packageamount`,`balance`,`status` from `customer` where `status`='" + status + "' ";
            } else if (name != null && name.length() > 0) {
                qr = "select `firstname`, `lastname`,`area`,`packageamount`,`balance`,`status` from `customer` where `firstname`='" + name + "' "; 
            } else {
                qr = "select `firstname`, `lastname`,`area`,`packageamount`,`balance`,`status` from `customer`";
            }
            PreparedStatement ps = con.prepareStatement(qr);
            resultSet = ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultSet;
    }
}
