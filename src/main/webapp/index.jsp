<%@ page import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Show Cookies</title>
</head>
<body>

<h2>Active Cookies</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            Name: <%= c.getName() %> <br>
            Value: <%= c.getValue() %> <br>
            Max Age: <%= c.getMaxAge() %> <br>
            <hr>
<%
        }
    } else {
%>
        <p>No cookies found!</p>
<%
    }
%>

<br>
<a href="addCookie.jsp">Add Another Cookie</a>

</body>
</html>