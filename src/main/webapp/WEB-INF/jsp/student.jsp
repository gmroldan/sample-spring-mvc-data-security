<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<style>
			.error {
				color: red;
				font-weight: bold;
			}
		</style>
	</head>
	<body>
		<a href="/">Home</a>
	
		<form:form action="/add" method="POST" commandName="student">
			<table>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"/></td>
					<td><form:errors path="name" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age"/></td>
					<td><form:errors path="age" cssClass="error"/></td>
				</tr>		
				<tr>
					<td><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>