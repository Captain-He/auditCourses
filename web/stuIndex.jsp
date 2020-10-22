<%@ page import="com.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/27
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<html>
<head>
    <title>stuIndex</title>
</head>
<body>
<%User user = (User) request.getAttribute("user");%>
    欢迎来到学生登录页,<%=user.getUserName()%>!
<%=user.getUserMajor()%>
<form action="updatePwd.jsp" method="post">
    <input type="hidden" name="userID" value="<%=user.getUserID()%>">
    <input type="hidden" name="userPwd" value="<%=user.getUserPwd()%>">
    <input type="submit" value="修改密码">
</form>
</body>
</html>
