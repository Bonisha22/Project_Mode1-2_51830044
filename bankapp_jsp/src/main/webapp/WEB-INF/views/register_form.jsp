<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" method="post" modelAttribute="userFormBean">
<form:hidden path="id"/>
<table style=" margin-left:425px;">
     <tr><td>Enter Name:</td><td><form:input path="name"/></td></tr>
     <tr><td>Enter Email:</td><td><form:input path="email"/></td></tr>
     <tr><td>Enter Password:</td><td><form:input path="password"/></td></tr>
     <tr><td>Confirm Password:</td><td><form:input path="cpassword"/></td></tr>
     <tr><td>Enter PhoneNo:</td><td><form:input path="phone"/></td></tr>
     <tr><td>Enter Address:</td><td><form:input path="address"/></td></tr>

    
   </table>
    <input type="submit" value="Register" />
    



</form:form>

</body>
</html>