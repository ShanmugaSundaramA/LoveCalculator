<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<style type="text/css">
#error{
color: red;
position :absolute;
text-align:left;
padding-left: 5px;
}
</style>
</head>
<body>

	<div id="heading" align="center">
		<h1>Love Calculator</h1>
	</div>
	
	<div id="formTag" align="center">
		<form:form action="/LC/homePageProcess" modelAttribute="userInfoDTO">
			Your Name : <form:input  id="yourName" path="yourName" />
			            <form:errors id="error" path="yourName" />
			<br>
			<br>
			<br>
            Crush Name : <form:input id="crushName" path="crushName" />
                         <form:errors id="error" path="crushName"/>
            <br>
            <br>
            <br>
            Term And Condtion : <form:checkbox id="termAndCondtion" path="termAndConditon"/>
                                <form:errors id="error" path="termAndConditon"/>
            <br>
            <br>
            <br>
			<input type="submit" value="submit">
			<br>
		</form:form>
	</div>
	
</body>
</html>