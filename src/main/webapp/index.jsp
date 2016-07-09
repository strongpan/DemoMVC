<%-- Created by Administrator at 16-7-9 上午10:30 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>index page</h1>
<form action="/user/login" method="post">
    <input type="text" name="username" placeholder="USERNAME"><br>
    <input type="password" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="LOGIN">
</form>
${requestScope.message}
<hr>
<a href="/register.jsp">REGISTER</a>
</body>
</html>
