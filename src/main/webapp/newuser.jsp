<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rejestracja</title>
</head>
<body>
	<br />
	<br />
	<br />
	<center>
		<H1>
			<font color="Crimson">Rejestracja nowego użytkownika</font>
		</H1>
	</center>
	<br />
	<form action="newuser" method="get">
		<label><center><H3><font color="MediumVioletRed">Login: <input type="text" id="username" name="username" /></font></H3></center></label>  
		<label><center><H3><font color="HotPink">Hasło: <input type="text" id="password" name="password" /></font></H3></center></label> 
		<label><center><H3><font color="HotPink">Potwierdź hasło: <input type="text" id="password" name="confirmpassword" /></font></H3></center></label>
		<label><center><H3><font color="IndianRed">Email: <input type="text" id="email" name="email" /></font></H3></center></label>
		 <br/>
		<center><input type="submit" value="Wyślij" /></center>
	</form>

</body>
</html>