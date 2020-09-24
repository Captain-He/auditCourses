<%--
  Created by IntelliJ IDEA.
  User: hzc
  Date: 2020/9/24
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login.jsp</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/userServlet" method="post">
    用户名:<input type="text" name="userName"></input>
    密码:<input type="password" name="passWord"></input>
    <input type="submit" value="submit"></input>
</form>

</body>
</html>
