<%@page import="domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
<%@include file="menu.html" %>
	<br />
	<br />
	<br />
	<center>
		<H1>
			<font color="blue">Profil użytkownika</font>
		</H1>
		<%
		User user =(User)request.getSession().getAttribute("user");
		if(user!=null){
			out.write("Login = " + user.getUsername());
			%>
			<br/>
			<%out.write("Password = " + user.getPassword());
			%>
			<br/>
			<%
			out.write("Email = " + user.getEmail());
		} else {
			out.write("Użytkownik nie jest zalogowany!");
		}
		%>
		
	</center>
	<br />
	<form action="" method="get">
	
	</form>

</body>
</html>