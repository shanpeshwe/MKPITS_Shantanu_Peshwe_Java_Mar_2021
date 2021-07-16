<%-- 
    Document   : welcome2
    Created on : Jul 12, 2021, 4:45:45 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String name = request.getParameter("uname");
            out.print("Welcome " + name);

            pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);
        %> 
        <br><br>
        <a href="second1.jsp">second jsp page</a>  
    </body>
</html>
