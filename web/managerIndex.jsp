<%@ page import="com.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/27
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>managerIndex</title>
</head>
<body>
<%User user = (User) request.getAttribute("user");%>
欢迎来到管理员页面，<%=user.getUserName()%>!
<form action="updatePwd.jsp" method="post">
    <input type="hidden" name="userID" value="<%=user.getUserID()%>">
    <input type="hidden" name="userPwd" value="<%=user.getUserPwd()%>">
    <input type="submit" value="修改密码">
</form>
</body>
</html>
