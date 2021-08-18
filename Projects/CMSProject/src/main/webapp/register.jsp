<%-- 
    Document   : register
    Created on : Aug 18, 2021, 3:30:07 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Register Page</title>
    </head>
    <body>
        <%! 
            String companyname,username,email,contactnumber,password,repeatpassword;
            //String check(String n,String p) {
               // if(n.equals("admin") && p.equals("admin")) {
               //     return "login successfull";
               // }
               // else{
               //     return "invalid credentials";
               // }
            //}
        %>
        
        <%
            this.companyname=request.getParameter("companyname");
            this.username=request.getParameter("username");
            this.email=request.getParameter("email");
            this.contactnumber=request.getParameter("contactnumber");
            this.password=request.getParameter("password");
            this.repeatpassword=request.getParameter("repeatpassword");
            
        %>
       
        <%= companyname%>
        <%= username%>
        <%= email%>
        <%= contactnumber%>
        <%= password%>
        <%= repeatpassword%>
    </body>
</html>
