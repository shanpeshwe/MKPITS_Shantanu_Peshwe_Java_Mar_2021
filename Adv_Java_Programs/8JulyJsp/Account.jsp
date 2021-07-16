<%-- 
    Document   : account
    Created on : Jul 10, 2021, 1:24:37 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Page</title>
    </head>
    <body>
        <h1>account information!</h1>
        <%!
            int actno;
            int amount;
            int actype;
            int bal=1000;
        %>

        <%
            actno=Integer.parseInt(request.getParameter("actno"));
            out.print("actno : " + actno+"<br>");
            amount=Integer.parseInt(request.getParameter("amount"));
            out.print("amount " + amount+"<br>");
            actype=Integer.parseInt(request.getParameter("atype"));
            out.print("atype " + actype+"<br>");
            switch(actype) {
            case 1 :
            bal=bal+amount;
            break;
            case 2 :
            bal=bal-amount;
            break;
            default:
            out.print("invalid ");
        }
        out.print("<br>Current bal is " + bal);

        %>

    </body>
</html>
