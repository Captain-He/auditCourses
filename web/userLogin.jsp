<%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/24
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <form action="userLoginServlet" method="post">
        学号:<input type="text" name="userID"><br>
        密码:<input type="password" name="userPwd"><br>
        <input type="radio" name="userType" value="0">学生登录<br>
        <input type="radio" name="userType" value="1">教师登录<br>
        <input type="submit" value="提交">
    </form>

    <a href="userFindpwd.jsp">忘记密码？</a>


</body>
</html>
