<%-- 
    Document   : customerindb
    Created on : 21 Aug, 2021, 2:05:16 PM
    Author     : sony
--%>

<%@page import="com.cablecms.AddCustomer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String firstname, lastname, phoneno, address, email,packageamount,area,balance,setupboxno,status;
            firstname = request.getParameter("firstname");
            lastname = request.getParameter("lastname");
            phoneno = request.getParameter("phoneno");
            address = request.getParameter("address");
            email = request.getParameter("email");
            packageamount = request.getParameter("packageamount");
            area = request.getParameter("area");
            balance = request.getParameter("balance");
            setupboxno = request.getParameter("setupboxno");
            status = request.getParameter("status");
            String res2=AddCustomer.addcustomer(firstname, lastname, phoneno, address, email, packageamount, area,balance,setupboxno,status);
            out.println(res2);
        %>
    </body>
</html>
