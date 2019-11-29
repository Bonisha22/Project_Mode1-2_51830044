<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer app login page</title>
<style type="text/css">
.error {
	color: red;
	font-family: sans-serif;
	font-style: italic;
}
body{
background-image: url("C:/Users/Dell/Downloads/bg_image.jpg");
}
h3{
color: white;
}
#submit{
  background-color:purple;
  color: white;
  width: 115px;
  height: 40px;
  margin-left:425px;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-weight: bold;
}
</style>
</head>
<body>
	${error }<br /> 
	<h3>${message }</h3><br />
    <form:form action="login" method="post" modelAttribute="userbean">
    <table style="margin:auto;">
		<tr><td><h3>Enter email:</h3></td><td><form:input path="email" /></td>
		                     <td><form:errors path="email" class="error" /></td></tr>
		<tr><td><h3>Enter password:</h3></td><td><form:input path="password" /></td>
		                     <td><form:errors path="password" class="error" /></td></tr>
          </table>
          <input type="submit" value="submit" id="submit"/>
      
    </form:form>

</body>
</html>