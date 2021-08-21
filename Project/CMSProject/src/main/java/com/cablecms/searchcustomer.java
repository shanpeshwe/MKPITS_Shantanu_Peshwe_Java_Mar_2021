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
/**
 *
 * @author COM
 */
public class searchcustomer {
    public static ResultSet searchcustomer(){
        Statement stmt = null;
                ResultSet resultSet=null;
                
                try {
                    Connection con = dbconnect.getConnection();
                    String qr ="select `firstname`, `lastname`,`area`,`package`,`balance`,`status` from `customer`" ;
                    PreparedStatement ps = con.prepareStatement(qr);
                    resultSet=ps.executeQuery();
                } catch (Exception e) {
                    System.out.println(e);
                }
                return resultSet;
            }
    }
