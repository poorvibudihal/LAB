<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("uname");

    // Create or update session
    if (name != null && !name.isEmpty()) {
        session.setAttribute("user", name);

        // Set session timeout = 60 seconds
        session.setMaxInactiveInterval(60);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>

<h2 style="color:green;">Hello <%= user %>!</h2>
<p>Your session will expire in 1 minute.</p>

<form action="welcome.jsp" method="post">
    <input type="hidden" name="logout" value="true">
    <input type="submit" value="Logout">
</form>

<%
    } else {
%>

<h2 style="color:red;">Session Expired!</h2>
<a href="index.jsp">Login Again</a>

<%
    }
%>

</body>
</html>