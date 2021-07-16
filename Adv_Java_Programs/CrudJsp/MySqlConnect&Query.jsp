<%-- 
    Document   : index
    Created on : Jul 14, 2021, 9:50:20 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String res=null;
            Connection con=null;  
            Statement stmt=null;

            //method to connect to mysql database
            public String connect() {
                try{  
                    Class.forName("com.mysql.jdbc.Driver");  
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddatabase","root","");  
                    //con.open();
                    res="connected";
                }catch(Exception e){
                    //out.print(e);
                    res=e.toString();
                }  
                return res;
            }


            //method to insert record in student table
            public String insertRecord(String n,String a) {
            String res1=null;
            try {
                String res=connect();
                //out.print(res);
                String qr="insert into student(studname,address) values('"+n+"','"+a+"')";
                stmt=con.createStatement();
                stmt.executeUpdate(qr);
                res1="record inserted";
            }catch(Exception ee) { res1=ee.toString();}
                return res1;
            }


            //method to update record in student table
            public String updateRecord(String n,String a) {
                String res1=null;
                try {
                    String res=connect();
                    //out.print(res);
                    String qr="update student set address ='"+a+"' where studname='"+n+"'";
                    stmt=con.createStatement();
                    stmt.executeUpdate(qr);
                    res1="record updated";
                }catch(Exception ee) {res1=ee.toString(); }
                return res1;
            }

            //method to delete record in student table
            public String deleteRecord(String n) {
                String res1=null;
                try {
                    String res=connect();
                    //out.print(res);
                    String qr="delete from student  where studname='"+n+"'";
                    stmt=con.createStatement();
                    stmt.executeUpdate(qr);
                    res1="record deleted";
                }catch(Exception ee) { res1=ee.toString();}
                return res1;
            }

            //method to view record in student table
            public ResultSet viewRecord() {
                ResultSet rs=null;
                String res1=null;
                try {
                    String res=connect();
                    //out.print(res);
                    String qr="select * from student";
                    stmt=con.createStatement();
                    rs=stmt.executeQuery(qr);
                }catch(Exception ee) {
                    res1=ee.toString();
                }
                return rs;
            }
        %>
        
        
        <%@ page import="java.sql.*" %>  
    
        <%
            out.println("student list <hr>");
            ResultSet rs;
            rs=viewRecord();
            while(rs.next()) {
                int id=rs.getInt("stud_id");
                String res1=rs.getString("studname");
               String add=rs.getString("address");
               out.print("id " + id + " name " + res1 + " address  " + add + "<Br>");
            }
            //out.println("name " + rec);
            String b=request.getParameter("button1");
            out.println(b);
            String sn=request.getParameter("name");
            String ad=request.getParameter("address");
            String res=null;
            if(b.equals("save")) {
                res=insertRecord(sn,ad);
            }
            else if(b.equals("update")){
                res=updateRecord(sn,ad);
            }
            else if(b.equals("delete")){
                res=deleteRecord(sn);
            }
            out.println(res);
            //  return con;  
        %>
        <br>
        <a href="MySqlConnect&Query.html"> go to home page</a>

    </body>
</html>
