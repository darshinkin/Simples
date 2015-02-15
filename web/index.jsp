<%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 15.02.15
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="ru.home.web.A" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>
  <font color="red">Привет мир!!! Ура</font>

  <%! private int amount = 3; %>

  <%
    int a = 2;
    int b = 3;
    int res = a + b;

    A c = new A("Hello world!!!");
  %>
<p>
  <font color="green"><%=c.getTitle()%></font>
</p>
</p>
</body>
</html>
