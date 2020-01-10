<%--
  Created by IntelliJ IDEA.
  User: Ethan
  Date: 1/10/20
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Here are all your Contacts.</h2>

<c:forEach var="contact" items="${contacts}">
    <h4>${contact.firstName} ${contact.lastName}</h4>
    <p>${contact.phoneNumber}</p>
</c:forEach>

<form action="/contacts/addContact.jsp"><button>Add Contact</button></form>
<form action="/UpdateContactServlet"><button>Update Contact</button></form>
<form action="/DeleteContactServlet"><button>Delete Contact</button></form>


</body>
</html>