<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Delete Operation</h2>
	<form  action="retrieve" method="get">
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
		<form action="processdelete" method="get">
		<input type="hidden" name="tid" value="<%=request.getParameter("tid")%>">
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
			<tr>
			<tr>
				<td><input type="submit" value="DELETE"></td>
			</tr>
		</table>
		</form>
	<%	
		}
	%>
</body>
</html>