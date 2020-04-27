<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Added</title>
</head>
<body>
<table>
	<tr><td>Product Id</td><td><c:out value="${product.productId}"></c:out></td></tr>
	<tr><td>Product Name</td><td><c:out value="${product.productName}"></c:out></td></tr>
	<tr><td>Product Price</td><td><c:out value="${product.productPrice}"></c:out></td></tr>
</table>
<a href="home">Back To Home Page</a>
</body>
</html>