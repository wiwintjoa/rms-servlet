<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix = "rms" uri = "/WEB-INF/tags/link.tld"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">

  <title>RMS</title>
  <meta name="description" content="Index">
  <meta name="author" content="Mitrais">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">      
  <rms:link type="stylesheet" href="css/styles.css?v=1.0"/>

  <!--[if lt IE 9]>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.js"></script>
  <![endif]-->
</head>

<body>
<ul>  
  <li><a href="list">Users</a></li>
  <li><a href="#employee">Employee</a></li>
  <li style="float:right"><a class="active" href="../logout">Logout</a></li>
</ul>

	<div align="center">
	
		<h1>List of Users</h1>
        <h5>
        	<a href="new">Add New User</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>
        	
        </h5>		
	
        <table border="1" cellpadding="5">            
            <tr>
            	<th>Id</th>
                <th>Username</th>
                <th>Password</th>                              
                <th>Action</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                	<td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.userName}" /></td>
                    <td><c:out value="${user.password}" /></td>
                    <td>
                    	<a href="../edituser?id=<c:out value='${user.id}' />">Edit</a>                    	
                    	<a href="../deleteuser?id=<c:out value='${user.id}' />">Delete</a>                                      
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
     
</body>
</html>
