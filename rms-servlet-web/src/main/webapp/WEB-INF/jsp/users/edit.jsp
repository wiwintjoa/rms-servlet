<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "rms" uri = "/WEB-INF/tags/link.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<rms:link type="stylesheet" href="css/styles.css?v=1.0"/>
<title>Edit User</title>
</head>
<body>
	<div align="center">
		<form action="edituser" method="post">
        <table border="1" cellpadding="5" width=50%>
            <caption>
            	<h2>
            		Edit User
            	</h2>
            </caption>
            <c:if test="${user != null}">
        		<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        	</c:if>    
            <tr>
                <th>Username: </th>
                <td>
                	<input type="text" class="input" name="userName" size="45"
                			value="<c:out value='${user.userName}' />"
                		/>   	
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                	<input type="password" class="input" name="userPass" size="45"
                			value="<c:out value='${user.password}' />"
                		/>                	
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<button class="btn">Save</button>
            	</td>
            </tr>
        </table>
        </form>
    </div>			
</body>
</html>