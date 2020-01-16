<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worker form</title>
</head>
<body>

<form:form action="process-worker" modelAttribute="worker">
	
	<form:input path="firstName" placeholder ="first name"/>
	<br><br>
	
	<form:input path="lastName" placeholder = "last name" />
	<br><br>
	
	<input type="submit" value="Insert" />
	<br><br>
	
	</form:form>

</body>
</html>