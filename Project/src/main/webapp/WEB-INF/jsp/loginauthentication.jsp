<%-- 
    Document   : register
    Created on : Aug 18, 2021, 3:30:07 PM
    Author     : COM
--%>

<%@page import="com.cablecms.LoginAuthentication"%>

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
            String res2 = LoginAuthentication.loginAuthentication(username, password);
            out.println(res2);

            //To forward page based on admin authentication
            if (res2.equals("User Not Found, Please register below!!")) {%>
        <!-- To Add register page -->
        <jsp:include page="register.jsp" />
        <%
            } else {
                session.setAttribute("username", username);
                response.sendRedirect("dashboard.jsp");
            }%>

    </body>
</html>
