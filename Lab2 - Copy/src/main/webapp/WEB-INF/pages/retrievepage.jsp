<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Retrieve Operation</h2>
	<form  action="retrieve2" method="get">
		<label>Please enter trainee ID:</label>
		<input type="number" name="tid">
	</form>
	<br>
	<br>
	<br>
	<br>
	<%
		if(request.getParameter("tid")!=null)	
		{
	%>
		<h2>Trainee Info</h2>
		<form>
		<table border="2">
			<tr>
				<td>Trainee ID</td>
				<td>Trainee Name</td>
				<td>Trainee Location</td>
				<td>Trainee Domain</td>
			</tr>
			<tr>
				<td>${trainee.traineeId}</td>
				<td>${trainee.traineeName}</td>
				<td>${trainee.traineeLocation}</td>
				<td>${trainee.traineeDomain}</td>
			</tr>
		</table>
		</form>
	<%	
		}
	%>
</body>
</html>