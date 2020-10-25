<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Registration form</h1>
	
	<form action="userDetails">
		Username : <input id="username" name="UName"/><br>
	    Email Id : <input id="emailid" name="EmailId"/><br>
		Password : <input type="password" id="Password" name="Password"/><br>
		Gender   : <input type="radio" name="Gender" value="1" checked=true/>Male
		<input type="radio" name="Gender" value="2" checked=true/>Female<br>
		<input type="checkbox" name="hobby" value="Dancing"/> Dancing
		<input type="checkbox" name="hobby" value="Singing"/> Singing<br>
		<input type="submit" value="Register Now"/><br>
	</form>
</body>
</html>