<%--
  Created by IntelliJ IDEA.
  User: Ethan
  Date: 1/10/20
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Contact</title>
</head>
<body>
<form action="/addContact" method="POST">
    <label for="addFirstName">First Name</label>
    <input type="text" id="addFirstName" name="addFirstName"> <br>
    <label for="addLastName">Last Name</label>
    <input type="text" id="addLastName" name="addLastName"> <br>
    <label for="addNumber">Phone Number</label>
    <input type="text" id="addNumber" name="addNumber"> <br>

    <button type="submit">Submit New Contact</button>
</form>

</body>
</html>
