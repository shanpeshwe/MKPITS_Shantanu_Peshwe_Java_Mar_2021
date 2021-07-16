<%-- 
    Document   : RegistrationForm
    Created on : Jul 11, 2021, 2:06:51 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <%=
          "User Registered Successfully!"       
        %>
        <br>
        <hr>
        <%=
          "Details are as follows :"
        %>
        <br>
        <%  
            out.print("Name : "+request.getParameter("name")+"<br>");
            out.print("Gender : "+request.getParameter("gender")+"<br>");
            out.print("Address : "+request.getParameter("address")+"<br>");
            out.print("City : "+request.getParameter("city")+"<br>");
            out.print("Contact Number : "+request.getParameter("number")+"<br>");
            out.print("City : "+request.getParameter("city")+"<br>");
            out.print("Courses : "+request.getParameter("c1")+request.getParameter("c2")+request.getParameter("c3")+request.getParameter("c4"));
        %>
    </body>
</html>
