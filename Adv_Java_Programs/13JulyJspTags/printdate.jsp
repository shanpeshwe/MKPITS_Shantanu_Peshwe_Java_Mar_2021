<%-- 
    Document   : printdate
    Created on : Jul 13, 2021, 3:37:54 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forwarded Page2</title>
    </head>
    <body>
        <% out.print("Today is :"+java.util.Calendar.getInstance().getTime()); %>  
        <br><br>
        <%= request.getParameter("name") %>  
    </body>
</html>
