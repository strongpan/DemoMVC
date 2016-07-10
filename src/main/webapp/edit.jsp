<%-- Created by Administrator at 16-7-9 下午4:08 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>edit page</title>
</head>
<body>
<c:if test="${sessionScope.user.username eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>edit page</h1>
${sessionScope.user.username}
<hr>
<a href="/user/logout">LOG OUT</a>
<hr>
<h3>EDIT BOOK</h3>
<form action="/book/update" method="post">
    <input type="hidden" name="id" value="${sessionScope.book.id}">
    <input type="text" name="title" placeholder="TITLE" value="${sessionScope.book.title}"><br>
    <input type="text" name="author" placeholder="AUTHOR" value="${sessionScope.book.author}"><br>
    <input type="text" name="date" placeholder="DATE" value="${sessionScope.book.date}"><br>
    <input type="text" name="price" placeholder="PRICE" value="${sessionScope.book.price}"><br>
    <input type="text" name="amount" placeholder="AMOUNT" value="${sessionScope.book.amount}"><br>
    <input type="submit" value="SAVE"><br>
</form>
</body>
</html>
