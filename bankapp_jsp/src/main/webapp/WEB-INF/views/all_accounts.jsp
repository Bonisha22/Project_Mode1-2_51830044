<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Accounts Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
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
#addaccount{
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

<body>

<h3>welcome ${user.name }</h3>
<br/>

<div class="container">
  <div class="row">
    <div class="col-sm-6">

	<table class="table table-striped">

		<thead>
			<tr>
				<th>ACCOUNT NUMBER</th>
				<th>BALANCE</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${accounts}" var="account">
				<tr>
					<td>${account.accountNumber}</td>
					<td>${account.balance }</td>
						
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</div>
		<a href="transfer" id="transfer">fundTransfer</a><br /><br />
		<a href="deposit" id="deposit">deposit fund</a><br /><br />
		<a href="withdraw" id="withdraw">withdraw fund</a><br /><br />
		<a href="register" id="addaccount">Add Account</a><br /><br />
		  <a href="logout" id="logout">logout</a>
		
	
</body>
</html>