<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "rms" uri = "/WEB-INF/tags/link.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new user</title>
<rms:link type="stylesheet" href="css/styles.css?v=1.0"/>
</head>
<body>
	<div align="center">
		<form action="../newuser" method="post">
        <table border="1" cellpadding="5" width=50%>
            <caption>
            	<h2>
            		Add New User
            	</h2>
            </caption>
            <tr>
                <th>Username: </th>
                <td>
                	<input type="text" class="input" name="userName" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                	<input type="password" class="input" name="userPass" size="45"/>
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