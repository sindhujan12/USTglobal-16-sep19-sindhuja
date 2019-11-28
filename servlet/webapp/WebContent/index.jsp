<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%!
	public void jspInit(){
		System.out.println("this is init phase");
		
	}
	
	public void jspDestroy(){
		System.out.println("this is destroy phase");
		
	}
	
	%>
<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Date date = new Date();
m();
%>

<%!
	public int i = 10;
	public void m() {
	System.out.println(i);
	}
	
%>

<body>
	Object obj = new Object();
	<h1 style="color: green;">Date and Time is<%=date%></h1>

</body>
</html>