<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
			<table allign='center'>
				<tr>
					<td>Id:</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td>Remember Me:</td>
					<td><input type='checkbox' name='rememberme' value='checked'></td>
				</tr>
				<tr>
					<td><input type='reset' value='reset'></td>
					<td><input type='submit' value='login'></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href='./register.html'>Register</a>


</body>
</html>