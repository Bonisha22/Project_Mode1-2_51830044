<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit page</title>
</head>
<body>
<form:form action="withdraw" method="post" modelAttribute="transactionBean">
	<table>
	<tr>
		<td>Enter Fromaccount Number:</td>
		<td><form:input path="fromAccount"/></td>
	</tr>
	
	<tr>
		<td>Enter  Amount:</td>
		<td><form:input path="amount"/></td>
	</tr>
	<tr>
		<td><input type="submit"/></td>
	</tr>
	<tr><td ><input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }"/></td></tr>
	
</table>
	
</form:form>

</body>
</html>