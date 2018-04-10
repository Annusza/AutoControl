<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Wybór użytkownika</title>
</head>
<body>
	<br />
	<br />
	<br />
	<center>
		<H1>
			<font color="Teal">System do zarządzania autoryzacją</font>
		</H1>
	</center>
	<br />
		<center>
			<H2>
				<font color="IndianRed">Wybierz działanie:</font>
			</H2>
		</center>

	<form action="newuser.jsp" method="get">
		<center>
			<H3>
				<font color="yellowgreen">Zarejestruj nowego użytkownika</font>
			</H3>
		</center>
		<center>
			<input type="submit" value="Załóż konto" />
		</center>
		</form>
		<br />
	<form action="login.jsp" method="get">
		<center>
			<H3>
				<font color="limegreen">Zaloguj się na konto zwykłe</font>
			</H3>
		</center>
		<center>
			<input type="submit" value="Zaloguj" />
		</center>
		</form>
	


</body>
</html>