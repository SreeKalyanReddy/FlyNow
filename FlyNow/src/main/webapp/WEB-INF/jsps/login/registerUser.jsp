<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style>
body{background-color:powderblue;}
input{padding:4px;border-style:groove;border-color:black;}
</style>
</head>

<body>

<form action="registerUser" method="post" style="position: center">
<pre>
First Name :<input type="text" name="firstName"/>
Last Name :<input type="text" name="lastName"/>
Email :<input type="text" name="email"/>
Password :<input type="password" name="password"/>
Confirm Password :<input type="password" name="confirmPassword"/>
<input type="submit" value="Register" />
</pre>
</form>

</body>
</html>