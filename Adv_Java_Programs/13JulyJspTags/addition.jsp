<%-- 
    Document   : addition
    Created on : Jul 14, 2021, 6:13:36 PM
    Author     : COM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaBean Ex</title>
    </head>
    <body>
          
      <jsp:useBean id="obj1" class="com.mycompany.Calculate"/>  
    <%  
  int n1=Integer.parseInt(request.getParameter("num1"));
 int n2=Integer.parseInt(request.getParameter("num2"));
 int res=obj1.Calculate(n1,n2);  
    out.print("addition of 2 no  is "+res);  
    %> 

    </body>
</html>
