<%-- 
    Document   : connection
    Created on : 15 Aug, 2021, 12:01:57 AM
    Author     : HP
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<h1>Connected</h1>

<%!
String res=null;
Connection con=null;
Statement stmt=null;

//method to connect to mysql database
public String connect() {

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:8080/cruddatabase","root","");
        //con.open();
        res="connected";
       }
    catch(Exception e)
    {
        //out.print(e);
        res=e.toString();
    }
    return res;

}
%>


<br>

<a href="login.html"> go to home page</a>
</body>
</html>