<%-- 
    Document   : Multiplication
    Created on : Jul 8, 2021, 5:36:42 PM
    Author     : COM
--%>

<%@page import="java.lang.System.out"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplication Table</title>
    </head>
    <body>
        <%!
            int num,i=1,res;
            String str;
            
            void multiplication(int num){
                for(i=1;i<=num;i++){
                    res=num*i;
                    out.print(num+" x "+i+" = "+res);
                }
        } 
        %>
        
        <%
            num=Integer.parseInt(request.getParameter("num"));
            multiplication(num);
            
        %>
        
        
    </body>
</html>
