<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Student Form</title>

<script>
function validateForm() {
    var f = document.forms["form"];

    if (f.rollno.value=="" || f.name.value=="" ||
        f.sub1.value=="" || f.sub2.value=="" ||
        f.sub3.value=="" || f.sub4.value=="" ||
        f.sub5.value=="") {
        alert("All fields required!");
        return false;
    }
    return true;
}
</script>

</head>
<body>

<h2>Student Result Form</h2>

<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="number" name="sub1"><br><br>
Sub2: <input type="number" name="sub2"><br><br>
Sub3: <input type="number" name="sub3"><br><br>
Sub4: <input type="number" name="sub4"><br><br>
Sub5: <input type="number" name="sub5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>