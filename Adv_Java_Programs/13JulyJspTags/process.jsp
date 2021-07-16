<%-- 
    Document   : process
    Created on : Jul 13, 2021, 3:53:26 PM
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
          String name=request.getParameter("name");
          if(name.equals("admin")){
            %>
            <jsp:forward page="printdate.jsp"/>
            <%
            }
          else{
                out.print("Invalid Name");
            }      
        %>    
    </body>
</html>
