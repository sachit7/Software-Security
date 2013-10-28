<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<center>
		<form:form method="POST" commandName="register"
			action="registerationPage">

			<table border="0" cellpadding="0" cellspacing="0">
				<tbody>
					<tr style="height: 250px">
						<td style="width: 550px; background-color: #333333" valign="top"><br>
							<center>
								<table border="0" cellpadding="10" cellspacing="10">
									<tbody>
										<tr>
											<td>
												<table border="0" cellpadding="3" cellspacing="3">
													<tbody>
														<tr>
															<td colspan="2"><div align="center"
																	style="font-size: 22px; color: #ffffff">Register</div>
																<br></td>
														</tr>
														<tr>
															<td><form:label path="fullName">
																	<spring:message code="label.fullName" />
																</form:label></td>
															<td><form:input path="fullName" class="required" /><br />
																<font color="red"><form:errors path="fullName" /></font></td>
														</tr>
														<tr>
															<td><form:label path="userName">
																	<spring:message code="label.username" />
																</form:label></td>
															<td><form:input path="userName" class="required" /><br />
																<font color="red"><form:errors path="userName" /></font></td>
														</tr>
														<tr>
															<td><form:label path="passwd">
																	<spring:message code="label.password" />
																</form:label></td>
															<td><form:password path="passwd" class="required" />
																<br /> <font color="red"><form:errors
																		path="passwd" /></font></td>
														</tr>
														<tr>
															<td><form:label path="email">
																	<spring:message code="label.email" />
																</form:label></td>
															<td><form:input path="email" class="required" /><br />
																<font color="red"><form:errors path="email" /></font></td>
														</tr>
														<tr>
															<td><form:label path="phone">
																	<spring:message code="label.phone" />
																</form:label></td>
															<td><form:input path="phone" class="required" /><br />
																<font color="red"><form:errors path="phone" /></font></td>
														</tr>
														<tr>
															<td><form:label path="ssn">
																	<spring:message code="label.ssn" />
																</form:label></td>
															<td><form:input path="ssn" class="required" /><br />
																<font color="red"><form:errors path="ssn" /></font></td>
														</tr>

														<%-- <tr>
															<td style="color: white">Retype Password:</td>
															<td><form:input path="rePassword" /></td>
														</tr> --%>
														<tr>
															<td style="color: white">Role:</td>
															<td><form:select path="roleList">
																	<c:forEach var="item" items="${roleList}">
																		<form:option value="${item.roleId }" label="${item.roleName}" />
																	</c:forEach>
																</form:select>
														</tr>
														<tr>
															<td></td>>
															<td align="center" style="color: red">${errorMsg}</td>

														</tr>
														<tr>
															<td id="title" style="color: white">Department:</td>

<tr>															<td><form:select path="deptList">
																	<c:forEach var="item" items="${deptList}">
																		<form:option value="${item.deptId }" label="${item.deptName}" />
																	</c:forEach>
																</form:select>
														</tr>
													<%-- 	<tr>
															<td>
																<table id="depts">
																	<c:forEach var="item" items="${deptList}">
																		<tr>
																			<td style="padding-left: 20px; padding-top: 5px;"><label
																				style="color: white">${item.deptName}</label></td>
																			<td><div id="deps">
																					<form:checkbox path="deptList"
																						id="role_${item.id}" value="${item.id}"
																						class="required" />
																				</div></td>
																		</tr>
																	</c:forEach>
																</table>
															</td>
														</tr>--%>
														<tr>
															<td colspan="3"><input type="submit"
																value="<spring:message code="label.register"/>" /></td>
														</tr>
														<%--<tr>
															<td></td>
															<td><div align="left">
																	<script type="text/javascript"
																		src="https://www.google.com/recaptcha/api/challenge?k=6LdIMtgSAAAAAHEwm2t3BSD4GBsFMKBNko6LBOH6">
																		
																	</script>
																	<noscript>
																		<iframe
																			src="http://www.google.com/recaptcha/api/noscript?k=6LdIMtgSAAAAAHEwm2t3BSD4GBsFMKBNko6LBOH6"
																			height="300" width="500" frameborder="0"></iframe>
																		<br>
																		<textarea name="recaptcha_challenge_field" rows="3"
																			cols="40">
     																	</textarea>
																		<input type="hidden" name="recaptcha_response_field"
																			value="manual_challenge">
																	</noscript>--%>
														<%-- <captcha:captcha themeName="white" 
																		publickey="6LdIMtgSAAAAAHEwm2t3BSD4GBsFMKBNko6LBOH6"
																		privatekey="6LdIMtgSAAAAALIW_Ec3pU6m0OUBV2BMLnNOYCVD" /> --%>
														<%--<br /> <font color="red"><form:errors
																			path="captcha" /></font> <br />
																			
																			 <input id="submit"
																		type="submit" value="Submit" /> <br />
																</div></td>--%>
													</tbody>
												</table> <br>
											</td>
										</tr>
									</tbody>
								</table>
							</center></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</center>

	<br />
	<br />
	<br />


</body>
</html>