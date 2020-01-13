<%--
  Created by IntelliJ IDEA.
  User: Ethan
  Date: 1/13/20
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access</title>
</head>
<body>

<h1>Access Page</h1>
<form action="/admin" method="POST">
<%--    <input type="hidden" value="${access_code}" name ="access_code">--%>
    <label for="code">Enter the admin access code: </label>
    <input type="password" id="code" name="code">
</form>

</body>
</html>
