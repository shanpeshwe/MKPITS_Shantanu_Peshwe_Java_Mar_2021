<%-- 
    Document   : ForwardActionTagWithParameter
    Created on : Jul 13, 2021, 3:48:17 PM
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
        <h2>this is index page</h2>  
      
        <jsp:forward page="printdate.jsp" >  
        <jsp:param name="name" value="mkpits.com" />  
        </jsp:forward>  

    </body>
</html>
