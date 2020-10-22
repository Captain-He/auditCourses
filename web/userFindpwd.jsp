<%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/27
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>userFindpwd</title>
</head>
<body>
    <form action="userFindpwdServlet" method="post">
        请输入你的用户名:<input type="text" name="userName"><br>
        请输入你的邮箱地址:<input type="text" name="userMail"><br>
        <input type="submit" value="找回密码">
    </form>
</body>
</html>
