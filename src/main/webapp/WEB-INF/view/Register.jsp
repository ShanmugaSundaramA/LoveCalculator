<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterPage</title>

<style type="text/css">
td{
 padding: 10px;
}
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
	
	<div id="registerFormTag" align="center">
		<form:form action="/LC/processRegisterPage" modelAttribute="userRegisterDTO">

<table>
<tr><td> Name : </td><td><form:input id="name" path="name" /></td><td><form:errors id="error" path="name"/> </td></tr>
<tr><td>UserName : </td><td><form:input id="userName" path="userName"/></td><td><form:errors id="error" path="userName"/></td></tr>
<tr><td>Password : </td><td><form:password id="password" path="password" /></td><td><form:errors id="error" path="password"/></td></tr>
<tr><td>Country :</td>
<td>
		    <form:select path="country">
		       <form:option value="India">India</form:option>
		       <form:option value="India">USA</form:option>
		       <form:option value="India">Nepal</form:option>
		       <form:option value="India">SriLanka</form:option>
		    </form:select>
</td>
<td><form:errors id="error" path="country"/></td></tr>
<tr><td>Hobby : </td>
<td>
		    Cricket <form:checkbox path="hobby" value="Cricket"/>
		    Drawing <form:checkbox path="hobby" value="Drawing"/>
		    BodyBuilding <form:checkbox path="hobby" value="BodyBuilding"/>
</td>
<td> <form:errors id="error" path="hobby"/></td>
</tr>
<tr><td>Gender : </td>
<td>		    
		    Male <form:radiobutton path="gender" value="Male"/> 
		    Female <form:radiobutton path="gender" value="Female"/>
</td>
<td><form:errors id="error" path="gender"/></td></tr>

<tr><td>Age : </td><td><form:input id="age" path="age"/> </td><td><form:errors id="error" path="age" /></td></tr>

<tr><td>Email : </td><td><form:input path="communicationDTO.email"/> </td></tr>

<tr><td>Phone : </td><td><form:input path="communicationDTO.phone"/> </td><td><form:errors path="communicationDTO.phone" /></td></tr>

<tr><td>CreditCard : </td><td><form:input path="billDTO.creditCard"/> </td></tr>

<tr><td>Amount : </td><td><form:input path="billDTO.amount"/> </td></tr>
</table>		  
		    <input type="submit" value="Submit" >
		</form:form>
	</div>
</body>
</html>