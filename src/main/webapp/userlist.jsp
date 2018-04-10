
<%@page import="servlets.RegistrationServlet"%>
<%@page import="domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista użytkowników</title>
</head>
<body>
	<%@include file="menu.html"%>
	<br />
	<br />
	<br />
	<center>
		<H1>
			<font color="purple">Lista użytkowników</font>
		</H1>
	</center>
	<%
		List<User> userList = (List<User>)(request.getSession().getAttribute("userList"));
	%>

	<table border="2">
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Password</th>
			<th>Email</th>
			<th>Premium</th>
			<th>Admin</th>

		</tr>
		<%
			for (int i = 0; i < userList.size(); i++){
		%>
		<tr>


			<td><%=userList.get(i).getId()%></td>
			<td><%=userList.get(i).getUsername()%></td>
			<td><%=userList.get(i).getPassword()%></td>
			<td><%=userList.get(i).getEmail()%></td>
			<td><a href="?makePremium=<%=userList.get(i).getId()%>"><%=userList.get(i).getPremium()%></a></td>
			<td><%=userList.get(i).getAdmin()%></td>


		</tr>
		<%
			}
		%>
	</table>
	

	<br />
	<form action="" method="get"></form>

</body>
</html>