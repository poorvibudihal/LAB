<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>User Form</title>

```
<script>
    function validateForm() {
        var name = document.forms["form"]["username"].value.trim();
        var email = document.forms["form"]["email"].value.trim();
        var desig = document.forms["form"]["designation"].value.trim();

        if (name === "" || email === "" || desig === "") {
            alert("All fields are required!");
            return false;
        }

        var emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
        if (!email.match(emailPattern)) {
            alert("Invalid Email!");
            return false;
        }

        return true;
    }
</script>
```

</head>

<body>

<h2>User Details Form</h2>

<form name="form" action="UserDataServlet" method="post" onsubmit="return validateForm()">
    Username: <input type="text" name="username"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>

```
<input type="submit" value="Submit">
```

</form>

</body>
</html>
