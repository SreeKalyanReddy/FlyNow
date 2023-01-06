<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search for flights</title>
</head>
<body>

<h1>
Flights here!!!
</h1>

<form action="viewflights" method="post">
From :<input type="text" name="from"/>
To : <input type="text" name="to"/>
Departure Date : <input type="text" name="departuredate"/>
<input type="submit" value="Search"/>

</form>
</body>
</html>