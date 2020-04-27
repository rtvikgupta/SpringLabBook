<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h2>Product List</h2>
<table border="1">
<tr> <th>Product Id</th>
<th>Product Name</th>
<th>Product Domain</th></tr>
	<c:forEach items="${productlist}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.productPrice}</td>
		</tr>
	</c:forEach>
	</table>
<a href="home">Back To Home Page</a>

</body>
</html>