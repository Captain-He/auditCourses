<%--
  Created by IntelliJ IDEA.
  User: 81556
  Date: 2020/9/27
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>updatePwd</title>
</head>
<body>
<form action="updatePwdServlet" method="post">
    ������ԭ����:<input type="password" name="oldPwd"><br>
    ������������:<input type="password" name="newPwd"><br>
    <input type="hidden" name="userID" value="<%=request.getParameter("userID")%>">
    <input type="submit" value="ȷ��">
</form>
</body>
</html>
