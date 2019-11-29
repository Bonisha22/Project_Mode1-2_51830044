<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

body{
background-image: url("C:/Users/Dell/Downloads/bg7.jpg");
}
#logout{
  
  background-color: #f44336;
  color: white;
  width: 115px;
  height: 40px;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-weight: bold;
}
#addcustomer{
  background-color: purple;
  color: white;
  width: 115px;
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
<h1>welcome ${user.name }</h1>
   
   <div class="container">
   <div class="row">
   <div class="col-sm-6">
   <table class="table table-striped">
    <thead>
	 <tr>
		<th>ID</th>
		<th>NAME</th>
		<th>EMAIL</th>
	    <th>ADDRESS</th>
		<th>PHONE</th>
	    <th>CITY</th>
	    <th>COUNTRY</th>
		<th>UPDATE</th>
		<th>DELETE</th>
	</tr>
   </thead>
    <tbody>
	  <c:forEach items="${customers }" var="customer">
		<tr>
		   <td>${customer.id }</td>
		   <td>${customer.name }</td>
		   <td>${customer.email }</td>
		   <td>${customer.address }</td>
		   <td>${customer.phone }</td>
		   <td>${customer.city }</td>
		   <td>${customer.country }</td>
		  <td><a href="update?id=${customer.id }">update</a></td>
	       <td><a href="delete?id=${customer.id }">delete</a></td>
		 
        </tr>
	  </c:forEach>
	</tbody>
  </table>
</div>
</div>
</div>
      
		 <a href="addcustomer" id="addcustomer">addcustomer</a><br /><br />
		  <a href="logout" id="logout">logout</a>
		

	  
</body>
</html>