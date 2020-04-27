<%@page import="com.capgemini.spring.entities.Trainee"%>
<%@page import="java.util.List" isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Trainees Details</h2>
		<form>
		<table border="2">
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			<c:forEach items="${tlist}" var="trainee">
				<tr>
					<td>${trainee.traineeId}</td>
					<td>${trainee.traineeName}</td>
					<td>${trainee.traineeDomain}</td>
					<td>${trainee.traineeLocation}</td>
				</tr>
			</c:forEach>
		</table>
		</form>
</body>
</html>