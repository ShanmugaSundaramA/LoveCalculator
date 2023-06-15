<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Email Page</title>
</head>
<body>

	<div id="heading" align="center">
		<h1>Love Calculator</h1>
	</div>
	<hr>
	<div id="result" align="center">
		<h2>Hi ${userInfoDTO.yourName}</h2>
		<p>Email Sucessfully sent to <b>${emailDTO.email}</b></p>
	</div>


</body>
</html>