<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>App UserManagement</title>
<style type="text/css">
#logout{
  
  background-color: purple;
  color: white;
  width: 100px;
  height: 40px;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-weight: bold;
}

</style>
</head>
<body>
	<h3>Welcome Admin!!</h3>
	<nav>
	<ul>
	    <li><a href="allappusers" id="allappusers">All AppUsers</a></li></br>
		<li><a href="register" id="addappuser">Add AppUser</a></li></br>
		
		
		
	</ul>
	</nav>
	
	<a href="logout" id="logout">logout</a>


</body>
</html>