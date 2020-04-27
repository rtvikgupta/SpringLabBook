<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Trainee Details</h2>
	<form action="processadd" method="get">
		<table>
			<tr>
				<td>Trainee Id:</td>
				<td><input type="number" name="tid"></td>
			</tr>
			<tr>
				<td>Trainee Name:</td>
				<td><input type="text" name="tname"></td>
			</tr>
			<tr>
				<td>Trainee Location:</td>
				<td>
					<input type="radio" name="tlocation" value="Chennai">Chennai
					<input type="radio" name="tlocation" value="Bangalore">Bangalore
					<input type="radio" name="tlocation" value="Pune">Pune
					<input type="radio" name="tlocation" value="Mumbai">Mumbai
				</td>
			</tr>
			<tr>
				<td>Trainee Domain:</td>
				<td>
					<select name="tdomain">
						<option value="Java">Java</option>
						<option value="Angular">Angular</option>
						<option value="Spring">Spring</option>
					</select>
				</td>
			</tr>
		</table>
		<input type="submit" value="Add Trainee">
	</form>
</body>
</html>