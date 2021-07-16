<%-- 
    Document   : welcome5
    Created on : Jul 8, 2021, 3:04:19 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentication</title>
    </head>
    <body>
        <%! 
            String un,pw;
            String check(String n,String p) {
                if(n.equals("admin") && p.equals("admin")) {
                    return "login successfull";
                }
                else{
                    return "invalid credentials";
                }
            }
        %>
        
        <%
            un=request.getParameter("uname");
            pw=request.getParameter("upass");
            String res=check(un,pw);
        %>
        
        <%=  res %>
      <hr>//prints a horizontal line

    </body>
</html>
