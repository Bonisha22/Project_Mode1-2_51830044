<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BANK APP</title>
</head>
<body> 
      <header role = "banner"> 
         <h1>KBP Banking Application</h1> 
      </header>
 
      <nav> 
         <ul> 
           
  			 <sec:authorize access="hasAnyRole('ADMIN')">
  			 	 <li><a href = "appusermgt">USER MANAGEMENT</a></li> 
  			 </sec:authorize>
           
            <sec:authorize access="hasAnyRole('ADMIN','MGR')">
            	<li><a href = "customermgt">CUSTOMER MANAGEMENT</a></li> 
 		    </sec:authorize>
            <sec:authorize access="hasAnyRole('ADMIN','MGR','CLERK')">
            	<li><a href = "accountmgt">ACCOUNT MANAGEMENT</a></li> 
            </sec:authorize>
            <li><a href = "logout">logout</a></li> 
         </ul> 
      </nav> 
   
      <article> 
         <section> 
            <p><h3>You are the performance, you own this process.</h3></p>
         </section> 
      </article>  
   <footer> 
         <p>Created by <a href = "https://www.hcltech.com/">HCL Tech</a></p> 
      </footer> 
</html>