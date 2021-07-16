<%-- 
    Document   : ImportAttribute
    Created on : Jul 13, 2021, 3:14:23 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Import attribute</title>
    </head>
    <body>
        <%@ page import="java.util.Date" %>  
        Today is: <%= new Date()%>  

        <%@ page info="composed by Sonoo Jaiswal" %>  

    </body>
</html>
