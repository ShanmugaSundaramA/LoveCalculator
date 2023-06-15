<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ResultPage</title>
</head>
<body>
	<div id="heading" align="center">
		<h1>Love Calculator</h1>
	</div>
	
	<hr>
	
	<div id="result" align="center">
	<h3>The Love Calculator Predicts : </h3>
	
	<p> ${userInfoDTO.yourName} and ${userInfoDTO.crushName} are  </p>
	
	<b>Lovers</b>
	
	<p><a href="/LC/sendEmail">Send Result to Your Email</a></p>
	</div>
	
</body>
</html>