<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSRS ver 1.0</title>
</head>
<body>

	<h1>Spring Boot - Welcome to Secure Student Registration System</h1>

	<%
	Date date = new Date();
	%>

	<h3>
		Current Date and Time is
		<%=date%>
	</h3>
</body>
</html>
