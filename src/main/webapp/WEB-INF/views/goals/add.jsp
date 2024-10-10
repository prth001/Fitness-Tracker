<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal</title>
<style>
.error {
	color: red;
}

.error-block {
	color: white: 
		background-color: #ffeeee;
	border: 3px solid red;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<form:form commandName="goal">
		<form:errors path="*" cssClass="error-block" element="div"></form:errors>
		<table>
			<tr>
				<td>Enter minutes</td>
				<td><form:input path="minutes" cssErrorClass="error" /></td>
				<td><form:errors path="minutes" cssClass="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><button type="submit">Enter goal minutes</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>