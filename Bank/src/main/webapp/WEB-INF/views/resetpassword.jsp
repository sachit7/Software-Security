<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<link href="css/default.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="headerout.jsp"/>
		<div id="wrapper">
			<div id="" class="wrapper-style1">
				<table border=1 cellpadding=5 cellspacing=0>
					<tr>
						<th>
							<h1>Answer the following to retrieve password</h1>
						</th>

					</tr>
					<tr>
						<th>UserName</th>
						<td><input type="text" value=""></td>
					</tr>
					<tr>

						<th>Birth Date</th>
						<td><input type="text" pattern="\d{1,2}/\d{1,2}/\d{4}"
							value="" /></td>
					</tr>
					<tr>

						<th>Security Question 1</th>
						<td><select>
								<option selected="selected">Select a question</option>
								<option value="1">What is your maternal grandmother's
									maiden name?</option>
								<option value="2">What was your childhood nickname?</option>
								<option value="3">What is the name of your favorite
									childhood friend?</option>
								<option value="4">What was the make and model of your
									first car?</option>
								<option value="5">What is the name of the first school
									you attended?</option>
								<option value="6">What is your preferred musical genre?
								</option>
								<option value="7">What are the last 5 digits of your
									credit card?</option>
								<option value="8">What is your current car registration
									number?</option>
								<option value="9">What is your mother's maiden name?</option>
								<option value="10">What is your favorite sport?</option>
						</select></td>
					</tr>
					<tr>

						<th>Security Question 2</th>
						<td><select>
								<option selected="selected">Select a question</option>
								<option value="1">What is your maternal grandmother's
									maiden name?</option>
								<option value="2">What was your childhood nickname?</option>
								<option value="3">What is the name of your favorite
									childhood friend?</option>
								<option value="4">What was the make and model of your
									first car?</option>
								<option value="5">What is the name of the first school
									you attended?</option>
								<option value="6">What is your preferred musical genre?
								</option>
								<option value="7">What are the last 5 digits of your
									credit card?</option>
								<option value="8">What is your current car registration
									number?</option>
								<option value="9">What is your mother's maiden name?</option>
								<option value="10">What is your favorite sport?</option>
						</select></td>
					</tr>

					<tr>

						<th>Security Question 3</th>
						<td><select>
								<option selected="selected">Select a question</option>
								<option value="1">What is your maternal grandmother's
									maiden name?</option>
								<option value="2">What was your childhood nickname?</option>
								<option value="3">What is the name of your favorite
									childhood friend?</option>
								<option value="4">What was the make and model of your
									first car?</option>
								<option value="5">What is the name of the first school
									you attended?</option>
								<option value="6">What is your preferred musical genre?
								</option>
								<option value="7">What are the last 5 digits of your
									credit card?</option>
								<option value="8">What is your current car registration
									number?</option>
								<option value="9">What is your mother's maiden name?</option>
								<option value="10">What is your favorite sport?</option>
						</select></td>
					</tr>
					<tr>

						<th>New Password</th>
						<td><input type="password" value="" /></td>
					</tr>
					<tr>

						<th>Confirm Password</th>
						<td><input type="password" value="" /></td>
					</tr>

				</table>
				<br /> <br /> <input type="button"
					style="width: 116px; height: 49px; margin-left: 21cm"
					value="Confirm">
			</div>
		</div></body>
</html>
