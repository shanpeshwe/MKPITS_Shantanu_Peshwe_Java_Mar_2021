<%-- 
    Document   : welcome
    Created on : Jul 8, 2021, 2:24:13 PM
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
        <%  
            String name=request.getParameter("uname");  
            out.print("welcome "+name);  
        %>  

    </body>
</html>
