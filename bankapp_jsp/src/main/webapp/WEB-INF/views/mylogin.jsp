<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BankApp Login Page</title>

</head>
<body>
<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION }">
<font color="red">
	<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>
</font>
</c:if>

<h3>New User!!</h3>
<form action="register" method="post">
  
  <input type="submit" value="SignUp"/>

</form>
<form  action='myloginprocessor' method='POST'>
<table>
     
    <tr><td>Enter UserName:</td><td><input type='text' name='email' value=''></td></tr>
    <tr><td>Enter Password:</td><td><input type='password' name='password'/></td></tr>
    <tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
  </table>
</form>
</body>
</html>










