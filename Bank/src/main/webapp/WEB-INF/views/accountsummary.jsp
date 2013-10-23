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
			<table>
				<tr>
					<th>Account</th>
					<th>Balance</th>
				</tr>
				<tr>
					<td><input type="text" value="Shamily Eedula" readonly /></td>
					<td><input type="text" value="$100" readonly /></td>
				</tr>
			</table>

			</br>
			<table border=1 cellpadding=5 cellspacing=0>
				<tr>
					<th>
						<h1>Account Information</h1>
					</th>

				</tr>
				<tr>
					<th>Type</th>
					<td><input type="text" value="Checking" readonly /></td>
				</tr>
				<tr>

					<th>Account number</th>

					<td><input type="text" value="1234567" readonly /></td>
				</tr>
				<tr>

				</tr>
			</table>
		</div>
	</div>


</body>
</html>