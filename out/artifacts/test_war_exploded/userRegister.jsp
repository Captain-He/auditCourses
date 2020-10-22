<%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/27
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userRegister</title>
</head>
<body>
    <form action ="userRegisterServlet" method="post">
        userName:<input type="text" name="userName"><br>
        passWord:<input type="password" name="passWord"><br>
        userMail:<input type="text" name="userMail"><br>
        <input type="hidden" name="userType" value="0">
        <input type="submit" value="register"><br>
    </form>
</body>
</html>
