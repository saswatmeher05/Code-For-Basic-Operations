<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Enter Your Name</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.css">
<style>
.footer{
position: fixed;
left:0;
bottom:0;
width:100%;
background-color:rgb(131, 187, 197);
color:white;
text-align:center;
}
</style>
</head>
<body>
	<div class="container text-info text-center "><h1>${message}</h1></div>
	
		<div class="footer">Generated time: ${time}
		<a href="index.jsp"></a>
		</div>
	</footer>
	
</body>
</html>