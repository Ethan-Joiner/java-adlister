<%--
  Created by IntelliJ IDEA.
  User: Ethan
  Date: 1/9/20
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Here are all the Ads.</h2>

<c:forEach var="ad" items="${ads}">
    <h4>${ad.title}</h4>
    <p>${ad.description}</p>
</c:forEach>
</body>
</html>
