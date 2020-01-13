<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome to your profile page, ${sessionScope.user}.</h1>
        <form action="/logout">
        <button type="submit">Logout</button>
        </form>
    </div>

</body>
</html>
