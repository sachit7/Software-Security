<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title></title>
<link href="css/default.css" type="text/css" rel="stylesheet" />
</head>
<body>
        <jsp:include page="headerin.jsp"/>
		<div id="wrapper">
		<div id="" class="wrapper-style1">
			<table border=1 cellpadding=5 cellspacing=0>

				<tr>
					<th>From Account</th>
					<td><input type="text" value=""></td>
				</tr>
				<tr>

					<th>To Account</th>
					<td><input type="text" value="" /></td>
				</tr>
				<tr>

					<th>Amount</th>
					<td><input type="text" value="" /></td>
				</tr>
			</table>
			<br /> <br />
			<input type="button" style="width: 116px; height: 49px; margin-left: 5cm" value="Make Transfer"/>
		</div>
	</div>
</body>
</html>