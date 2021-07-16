<%-- 
    Document   : process
    Created on : Jul 13, 2021, 3:05:28 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exception Handeling in JSP</title>
    </head>
    <body>
        <%@ page errorPage="error.jsp" %>  
        <%

            String num1 = request.getParameter("n1");
            String num2 = request.getParameter("n2");

            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int c = a / b;
            out.print("division of numbers is: " + c);

        %> 

    </body>
</html>
