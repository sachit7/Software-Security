<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/resources/css/default.css" />"
	rel="stylesheet">
<title></title>
</head>
<body>
	<jsp:include page="headerout.jsp" />
	<div id="wrapper">
		<div id="" class="wrapper-style1"></div>
	</div>

	<form:form method="POST" commandName="login" action="loginPage"
		style="width: 443px;">
		<table>
			<tr>
				<td></td>
				<td></td>
				<td><form:errors /></td>
			</tr>
			<br>
			<tr>
				<td><form:label path="userName">
						<spring:message code="label.username" />
					</form:label></td>
				<td><form:input path="userName" /></td>
			</tr>
			<br>
			<tr>
				<td><form:label path="passwd">
						<spring:message code="label.password" />
					</form:label></td>
				<td><form:password path="passwd" /></td>
			</tr>
			<br>
			<br>
			<tr>
				<td><form:radiobutton path="userTyp" value="external" /> <spring:message
						code="label.external" /></td>
				<td><form:radiobutton path="userTyp" value="internal" /> <spring:message
						code="label.internal" /></td>
			</tr>
			<br>
			<tr>
				<td><a href="<c:url value="forgot" />"
					style="color: rgb(0, 255, 0)"><spring:message
							code="label.forgot" /></a></td>
				<td><a href="<c:url value="newUser" />" style="color: rgb(0, 255, 0)"><spring:message
							code="label.newUser" /></a></td>
			</tr>
			<br>
			<br>
			<tr>
				<td colspan="3"><input type="submit"
					value="<spring:message code="label.login"/>" /></td>
			</tr>
			<br>
			<br>
		</table>
	</form:form>




	<div id="footer" class="container"></div>
</body>
</html>