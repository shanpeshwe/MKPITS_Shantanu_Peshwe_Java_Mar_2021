<%-- 
    Document   : welcome4.jsp
    Created on : Jul 8, 2021, 2:55:33 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaration tag Example</title>
    </head>
    <body>
        <%!int a=20;%>
        <%!   
            int cube(int n){  
            return n*n*n;  
        }
        %>
        <br><br>
        <%= "Cube of 3 is:"+cube(3) %>  
        <br><br>
        <%="Value of variable : "+a %>
    </body>
</html>
