<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
</head>
<body>
	<div>
		<h1><%out.println(session.getAttribute("error_title")); %></h1>
	</div>
	<div>
		<p>
			<%out.println(session.getAttribute("error_message")); %>
		</p>
		<p>Back to <a href="login">Login</a> .</p>
	</div>
</body>
</html>