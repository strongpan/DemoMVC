<%-- Created by Administrator at 16-7-9 下午4:08 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home page</title>
    <script>
        function del() {
            return confirm("DEL?");
        }
    </script>
</head>
<body>
<c:if test="${sessionScope.user.username eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>home page</h1>
${sessionScope.user.username}
<hr>
<a href="/user/logout">LOG OUT</a>
<hr>
<h3>CREATE BOOK</h3>
<form action="/book/create" method="post">
    <input type="text" name="title" placeholder="TITLE "><br>
    <input type="text" name="author" placeholder="AUTHOR"><br>
    <input type="text" name="date" placeholder="DATE  "><br>
    <input type="text" name="price" placeholder="PRICE "><br>
    <input type="text" name="amount" placeholder="AMOUNT"><br>
    <input type="submit" value="CREATE"><br>
</form>
<hr>
<table border="1">
    <tr>
        <th>ID</th>
        <th>TITLE</th>
        <th>AUTHOR</th>
        <th>DATE</th>
        <th>PRICE</th>
        <th>AMOUNT</th>
        <th colspan="2">OPERATION</th>
    </tr>
    <c:forEach var="book" items="${sessionScope.books}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.date}</td>
            <td>${book.price}</td>
            <td>${book.amount}</td>
            <td><a href="/book/queryOne/${book.id}">EDIT</a></td>
            <td><a href="/book/remove/${book.id}" onclick="return del()">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
