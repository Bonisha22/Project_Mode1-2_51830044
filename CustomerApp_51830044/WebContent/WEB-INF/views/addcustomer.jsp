<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add customer page</title>
<style type="text/css">
.error{
color: red;
font-family: fantasy;
font-style: italic;
}
body{
background-image: url("C:/Users/Dell/Downloads/bg8.jpg");
}
#submit{
  background-color:purple;
  color: white;
  width: 115px;
  height: 40px;
  padding: 10px;
  margin-left:425px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-weight: bold;
}
</style>
</head>
<body>
  <form:form action="addcustomer" method="post" modelAttribute="customer" >
  <form:hidden path="id"/>
  <table style=" margin-left:425px;">
     <tr><td>Enter Name:</td><td><form:input path="name"/></td></tr>
     <tr><td>Enter Email:</td><td><form:input path="email"/></td></tr>
     <tr><td>Enter PhoneNo:</td><td><form:input path="phone"/></td></tr>
     <tr><td>Enter Place:</td><td><form:input path="place"/></td></tr>
   </table>
  <input type="submit" value="submit" id="submit" />

  </form:form>
</body>
</html>