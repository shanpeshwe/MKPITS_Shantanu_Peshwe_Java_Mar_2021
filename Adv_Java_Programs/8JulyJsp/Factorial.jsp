<%-- 
    Document   : Factorial.jsp
    Created on : Jul 8, 2021, 5:14:37 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial</title>
    </head>
    <body>
        <%! 
            int num,i,fact=1;
            int factorial(int num) {
                for(i=1;i<=num;i++){
                fact=fact*i;
                }
                return fact;
            }
        %>
        
        <%
            num=Integer.parseInt(request.getParameter("num"));
            int res=factorial(num);
        %>
        
        <%="Factiorial of entered number "+num+ " : " +res %>            
    </body>
</html>
