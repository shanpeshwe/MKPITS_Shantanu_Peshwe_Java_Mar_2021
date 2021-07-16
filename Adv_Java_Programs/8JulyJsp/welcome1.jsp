<%-- 
    Document   : welcome1
    Created on : Jul 8, 2021, 2:31:21 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%= "Welcome "+request.getParameter("uname") %>  
        <br><br>
        Current Time : <%= java.util.Calendar.getInstance().getTime() %>  
    
</html>
