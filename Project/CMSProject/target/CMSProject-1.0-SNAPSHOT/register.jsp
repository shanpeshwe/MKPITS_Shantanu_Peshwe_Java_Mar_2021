<%-- 
    Document   : register
    Created on : Aug 18, 2021, 3:30:07 PM
    Author     : COM
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Register Page</title>
    </head>
    <body>
        <%!
            String res;
            String res1;
            Connection con;
            Statement stmt;

            //method to connect to mysql database
            public String connect() {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms_project", "root", "");
                    //con.open();
                    res = "connected";
                } catch (Exception e) {
                    //out.print(e);
                    res = e.toString();
                }
                return res;
            }

            

            public String addadmin(String companyname, String username, String email, String contactnumber, String password) {
                Statement stmt = null;
                try {
                    String str = connect();
                    String qr = "insert into admin (companyname,username,emailaddress,contactnumber,password) values ('" + companyname + "','" + username + "','" + email + "','" + contactnumber + "','" + password + "')";
                    stmt = con.createStatement();
                    stmt.executeUpdate(qr);
                    res1 = "record inserted successfully";
                } catch (Exception e) {
                    res1 = e.toString();
                }
                return res1;
            }
        %>

        <%
            String companyname, username, email, contactnumber, password;
            companyname = request.getParameter("companyname");
            username = request.getParameter("username");
            email = request.getParameter("email");
            contactnumber = request.getParameter("contactnumber");
            password = request.getParameter("password");
            String res=addadmin(companyname, username, email, contactnumber, password);
            out.println(res);
        %>

        <%= companyname%>
        <%= username%>
        <%= email%>
        <%= contactnumber%>
        <%= password%>
        <%= res%>
    </body>
</html>
