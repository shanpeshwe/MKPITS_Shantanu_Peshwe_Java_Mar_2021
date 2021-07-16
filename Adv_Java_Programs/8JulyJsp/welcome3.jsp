<%-- 
    Document   : welcome3
    Created on : Jul 8, 2021, 2:39:03 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%
            String n=request.getParameter("uname");
            String p=request.getParameter("pass");
            
            if(n.equals("admin") && p.equals("admin")){
                out.print("Login Successful");
                out.print("Welcome : "+n);
            }
            else{
                out.print("invalid Login");
            }          
        %>   
        <br>
        <br>
        Current Time : <%= java.util.Calendar.getInstance().getTime()%>
    </body>
</html>
