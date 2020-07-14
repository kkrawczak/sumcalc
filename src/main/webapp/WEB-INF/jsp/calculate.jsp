<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Sum it all</title>
</head>

<body>
	<c:choose>
		<c:when test="${not empty errorType}">
			<p>EXCEPTION !</p>
			<h2>Exception class: ${errorType}!</h2>
			<h2>Exception stacktrace: ${exception}!</h2>
		</c:when>
		<c:otherwise>
			<p>RESULT OF CALCULATION</p>
			<h2>Sum of randoms: ${result}!</h2>
		</c:otherwise>
	</c:choose>

</body>
</html>