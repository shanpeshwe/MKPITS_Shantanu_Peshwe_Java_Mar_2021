<%-- 
    Document   : second1
    Created on : Jul 12, 2021, 4:46:46 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>pageContext implicit object</title>
    </head>
    <body>
        <%

            String name = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
            out.print("Hello " + name);

        %>  

    </body>
</html>
