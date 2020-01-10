<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Contact</title>
</head>
<body>
<form action="/updateContact" method="POST">
    <input type="hidden" value="${updatePerson.id}" name="id">
    <label for="updateFirstName">First Name</label>
    <input type="text" id="updateFirstName" name="updateFirstName" value="${updatePerson.firstName}"> <br>
    <label for="updateLastName">Last Name</label>
    <input type="text" id="updateLastName" name="updateLastName" value="${updatePerson.lastName}"> <br>
    <label for="updateNumber">Phone Number</label>
    <input type="text" id="updateNumber" name="updateNumber" value="${updatePerson.phoneNumber}"> <br>

    <button type="submit">Edit Contact</button>
</form>

</body>
</html>