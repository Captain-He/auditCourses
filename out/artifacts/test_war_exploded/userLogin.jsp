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
        ѧ��:<input type="text" name="userID"><br>
        ����:<input type="password" name="userPwd"><br>
        <input type="radio" name="userType" value="0">ѧ����¼<br>
        <input type="radio" name="userType" value="1">��ʦ��¼<br>
        <input type="submit" value="�ύ">
    </form>

    <a href="userFindpwd.jsp">�������룿</a>


</body>
</html>
