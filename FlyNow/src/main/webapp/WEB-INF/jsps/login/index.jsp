<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome, Please login to continue</title>
</head>
<body>

<form action="login" method="post">
Email :<input type="text" name="email"/><br>
Password :<input type="password" name="password"/><br>
<input type="submit" value="Login" />
</form>
<br>

<form action="showReg">
   <button type="submit">Haven't registered? Click here..</button>
</form>

${msg}
</body>
</html>