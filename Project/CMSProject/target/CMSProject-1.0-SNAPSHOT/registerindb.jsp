<%-- 
    Document   : register
    Created on : Aug 18, 2021, 3:30:07 PM
    Author     : COM
--%>

<%@page import="com.cablecms.AddAdmin"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Register Page</title>
    </head>
    <body>

        <%
            String companyname, username, email, contactnumber, password;
            companyname = request.getParameter("companyname");
            username = request.getParameter("username");
            email = request.getParameter("email");
            contactnumber = request.getParameter("contactnumber");
            password = request.getParameter("password");
            String res2=AddAdmin.addAdmin(companyname, username, email, contactnumber, password);
            out.println(res2);
        %>
        
        <!-- To Add login page -->
        <jsp:include page="login.jsp" />
    </body>
</html>
