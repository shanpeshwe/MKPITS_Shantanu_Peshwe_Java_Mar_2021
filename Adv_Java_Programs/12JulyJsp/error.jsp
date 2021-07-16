<%-- 
    Document   : error
    Created on : Jul 12, 2021, 4:50:55 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>exception implicit object</title>
    </head>
    <body>

        <%@ page isErrorPage="true" %>  

        <h3>Sorry an exception occured!</h3>  

        Exception is: <%= exception%>


    </body>
</html>
