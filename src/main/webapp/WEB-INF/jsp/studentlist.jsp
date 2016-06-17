<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:if test="${empty studentList}">
			<h2>There are not students</h2>
		</c:if>
		
		<a href="/new">New Student</a>
		
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="student" items="${studentList}">
				<tr>
					<td><a href="/student/${student.id}">${student.id}</a></td>
					<td><c:out value="${student.name}"/></td>
					<td><c:out value="${student.age}"/></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>