<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Modify Operation</h2>
	<form  action="retrieve1" method="get">
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
		<form action="processupdate" method="get">
		<table border="2">
			<tr>
				<td>Trainee ID:</td>
				<td><input type="number" name="tid" value="${trainee.traineeId}"></td>
			</tr>
			<tr>
				<td>Trainee Name:</td>
				<td><input type="text" name="tname" value="${trainee.traineeName}"></td>
			</tr>
			<tr>
				<td>Trainee Location:</td>
				<td><input type="text" name="tlocation" value="${trainee.traineeLocation}"></td>
			</tr>
			<tr>
				<td>Trainee Domain:</td>
				<td><input type="text" name="tdomain" value="${trainee.traineeDomain}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
		</form>
	<%	
		}
	%>
</body>
</html>