<%@ page import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<h2>Add Cookie</h2>

<form method="post">
    Name: <input type="text" name="cname" required><br><br>
    Domain: <input type="text" name="cdomain" required><br><br>
    Max Age (sec): <input type="text" name="cage" required><br><br>
    <input type="submit" value="Add Cookie">
</form>

<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    String ageStr = request.getParameter("cage");

    if (name != null && domain != null && ageStr != null) {
        try {
            int age = Integer.parseInt(ageStr);

            Cookie cookie = new Cookie(name, domain);
            cookie.setMaxAge(age);

            response.addCookie(cookie);

            out.println("<h3 style='color:green;'>Cookie Added Successfully!</h3>");
            out.println("Name: " + name + "<br>");
            out.println("Domain: " + domain + "<br>");
            out.println("Max Age: " + age + "<br><br>");

            out.println("<a href='showCookies.jsp'>Go to Active Cookie List</a>");
        } catch (Exception e) {
            out.println("<h3 style='color:red;'>Invalid age input!</h3>");
        }
    }
%>

</body>
</html>