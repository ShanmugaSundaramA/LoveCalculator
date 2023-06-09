<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterSuccessPage</title>
</head>
<body>
	<div id="heading" align="center">
		<h1>Love Calculator</h1>
	</div>
	
	<div id="registerResult" align="center">
	  <h3>Details entered by you are </h3> 
	  Name       : ${userRegisterDTO.name } <br>
	  UserName   : ${userRegisterDTO.userName } <br>
	  Password   : ${userRegisterDTO.password } <br>
	  Country    : ${userRegisterDTO.country } <br>
	  Hobbies    :
	  <c:forEach var="hobby" items="${userRegisterDTO.hobby }">
	        ${hobby}
	  </c:forEach>
	  <br>
	  Gender     : ${userRegisterDTO.gender } <br>
	  Email      : ${userRegisterDTO.communicationDTO.email } <br> 
	  Phone      : ${userRegisterDTO.communicationDTO.phone } <br>
	  CreditCard : ${userRegisterDTO.billDTO.creditCard } <br>
	  Amount : ${userRegisterDTO.billDTO.amount } <br>
	   
	</div>
</body>
</html>