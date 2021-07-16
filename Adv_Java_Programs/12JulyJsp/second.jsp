<%-- 
    Document   : second
    Created on : Jul 12, 2021, 4:39:48 PM
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

            String name = (String) session.getAttribute("user");
            out.print("Hello " + name);

        %>  

    </body>
</html>
