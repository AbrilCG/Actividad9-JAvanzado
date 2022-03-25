<%-- 
    Document   : ejemplojsp
    Created on : 16 feb 2022, 14:52:16
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDate"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        HHoy es:
        <%
            String hoy = LocalDate.now().toString();
        %>
        <%=hoy%>
        <br>
    </body>
</html>
