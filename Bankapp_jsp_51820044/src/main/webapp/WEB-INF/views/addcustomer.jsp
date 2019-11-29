<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer Page</title>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
<form:hidden path="id"/>
<table style=" margin-left:425px;">
     <tr><td>Enter Name:</td><td><form:input path="name"/></td></tr>
     <tr><td>Enter Email:</td><td><form:input path="email"/></td></tr>
     <tr><td>Enter Address:</td><td><form:input path="address"/></td></tr>
     <tr><td>Enter PhoneNo:</td><td><form:input path="phone"/></td></tr>
     <tr><td>Enter City:</td><td><form:input path="city"/></td></tr>
     <tr><td>Enter Country:</td><td><form:input path="country"/></td></tr>
    
   </table>
    <input type="submit" value="submit" />
    



</form:form>

</body>
</html>