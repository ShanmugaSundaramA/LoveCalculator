<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>send Email Page</title>
</head>
<body>
	<div id="heading" align="center">
		<h1>Love Calculator</h1>
	</div>

	<hr>

	<div id="result" align="center">
		<h3>Hi ${userName}</h3>

		<h4>Send Result To Your Email</h4>

		<form:form action="/LC/processEmail" modelAttribute="emailDTO">
			Enter Your Email  : <form:input id="yourName" path="email" />
			<form:errors id="error" path="email" />

			<input type="submit" value="submit">
			<br>
		</form:form>


	</div>

</body>
</html>