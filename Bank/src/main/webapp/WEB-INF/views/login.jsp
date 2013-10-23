<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/resources/css/default.css" />"
	rel="stylesheet">
	<title></title>
</head>
<body>
	<jsp:include page="headerout.jsp"/>
	<div id="wrapper">
		<div id="" class="wrapper-style1">
			
		</div>
	</div>

	<form method="post" action=account class="login" style="width: 443px; ">
		<p>
			<label>UserName:</label> <input type="text" name="login" id="login">
		</p>
        
		<p>
			<label>Password:</label> <input type="password" name="password"
				id="password">
		</p>
        <br>
        <input type="radio" name="group1" value="external" style="width: 40px; height:40; margin-left:2cm"> External User
        <input type="radio" name="group1" value="internal" style="width: 40px; height:40; margin-left:"> Internal User 
        <br><br>
		<button type="submit"
			style="width: 116px; height: 49px; margin-left: 5cm">Login</button>


		<p class="forgot-password">
			<a href="resetpassword.jsp">Forgot your password?</a>
		</p>
	</form>

	<div id="footer" class="container"></div>
</body>
</html>