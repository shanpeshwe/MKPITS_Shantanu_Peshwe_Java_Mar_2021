<%-- 
    Document   : Addition
    Created on : Jul 8, 2021, 6:04:08 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition</title>
    </head>
    <body>
        <%! 
            int num1,num2,res;
            int addition(int num1,int num2) {
                res=num1+num2;
                return res;
            }
        %>
        
        <%
            num1=Integer.parseInt(request.getParameter("num1"));
            num2=Integer.parseInt(request.getParameter("num2"));
            int res=addition(num1,num2);
        %>
        
        <%="Sum of "+num1+" and "+num2+" : " +res %>
    </body>
</html>
