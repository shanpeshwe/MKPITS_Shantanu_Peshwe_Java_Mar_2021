<%-- 
    Document   : IncludeTag
    Created on : Jul 14, 2021, 5:54:26 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Include Tag</title>
    </head>
    <body>
        <h2>this is index page</h2>  
      
        <jsp:include page="printdate.jsp" />  
      
        <h2>end section of index page</h2>  

    </body>
</html>
