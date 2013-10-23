<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<div id="header" class="container">
		<div id="logo">
			<h1>
				<a href="accountsummary.jsp">Bank Of ASU </a>
			</h1>
		</div>
		<input type="button" id="signout" value="Sign Out" onClick="location.href='login.jsp'">

		<nav>
			<ul>
				<li class="current_page_item"><a href="accountsummary.jsp" accesskey="1" title="">Account</a></li>
				<li><a href="#" accesskey="2" title="">Transfers</a>
					<ul>
						<li><a href="maketransfer.jsp">Make Transfer</a></li>
						<li><a href="#">Review Transfers</a></li>
					</ul></li>	
                <li><a href="debitcredit.jsp" accesskey="2" title="">Debit/Credit</a></li></ul>
		</nav>
	</div>
		
		
</body>
</html>