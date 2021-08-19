<%-- 
    Document   : register
    Created on : Aug 18, 2021, 3:30:07 PM
    Author     : COM
--%>

<%@page import="com.cablecms.loginauthentication"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Authentication</title>
    </head>
    <body>
        <%
            String username, password;
            username = request.getParameter("username");
            password = request.getParameter("password");
            String res2 = loginauthentication.loginauthentication(username, password);
            out.println(res2);

            //To forward page based on admin authentication
            if (res2.equals("User Not Found, Please register below!!")) {%>
        <!-- To Add register page -->
        <jsp:include page="register.jsp" />
        <%
        } else {%>
        <!-- To Add register page -->
        <jsp:include page="dashboard.jsp" />
        <%
            }
        %>
    </body>
</html>
