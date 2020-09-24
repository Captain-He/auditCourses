<%--
  Created by IntelliJ IDEA.
  User: hzc
  Date: 2020/9/24
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>
<body>
<%
    String userName = request.getAttribute("userName").toString();
    if (null != request.getAttribute("login") && !"".equals(request.getAttribute("login").toString()))
        out.println(userName + " success,欢迎来到登陆界面");
    else
        out.println(userName + " fail,请回到登陆界面");
%>
</body>
</html>