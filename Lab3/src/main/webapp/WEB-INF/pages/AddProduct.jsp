<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="saveproduct" method="get">
	<table>
		<tr>
			<td>Enter Product id</td>
			<td><input type="number" name="pid"></td>
		</tr>
		<tr>
			<td>Enter Product Name</td>
			<td><input type="text" name="pname"></td>
		</tr>
		<tr>
			<td>Enter Product Price</td>
			<td><input type="number" name="pprice"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add Product"></td>
		</tr>
	</table>
</form>
</body>
</html>