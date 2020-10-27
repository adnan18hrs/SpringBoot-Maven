<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Operation form</h1>
	
	<form action="operation1">
	
		User By ID : <input id="uid" name="UID"/><br>
		<select name="ddlFlag"> 
			<option value="select"> Select Records</option>
			<option value="delete"> Delete Records</option>
			<option value="update"> Update Records</option>
			<option value="custom"> Custom Records</option>
		</select><br>
		<%-- When Submit is used ,it hits the server with a request --%>
		<input type="submit" value="Click Now"/><br>
	
	</form>
</body>
</html>
