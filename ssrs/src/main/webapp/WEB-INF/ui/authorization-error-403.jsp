<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>
	<h2>${msg}</h2>

	<hr>

	<c:url var="listUrl" value="/students/list" />
	<a href="${listUrl}">Back to listing students...</a>
</body>
</html>