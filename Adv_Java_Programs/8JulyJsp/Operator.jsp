<%-- 
    Document   : Operator
    Created on : Jul 8, 2021, 6:09:28 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operator</title>
    </head>
    <body>
        <%! 
            int num1,num2,res;
            String ch;
            int operation(int num1,int num2,String ch) {
                if(ch.equals("*")){
                    res=num1*num2;
                }
                if(ch.equals("+")){
                    res=num1+num2;
                }
                if(ch.equals("-")){
                    res=num1-num2;
                }
                return res;
            }
        %>
        
        <%
            num1=Integer.parseInt(request.getParameter("num1"));
            num2=Integer.parseInt(request.getParameter("num2"));
            ch=request.getParameter("op");
            int res=operation(num1,num2,ch);
        %>
        
        <%=ch+" of "+num1+" and "+num2+" : " +res %>
    </body>
</html>
