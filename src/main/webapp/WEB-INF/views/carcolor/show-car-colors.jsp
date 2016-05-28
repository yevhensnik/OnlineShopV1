<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Car COLORS</title>
</head>
<body>
		<form action="deleteAuthor">
			<table class="table table-hover">
				<tr>
					<th>Name and Surname</th>
					<th>Delete</th>
					<th>Edit</th>
				</tr>
				<c:forEach items="${allCarColors}" var="carcolor">
					<tr>
						<td>${carcolor.name}</td>
						
					</tr>
				</c:forEach>
				<a href="createColor" class="btn btn-info">Add Color</a>
			</table>
		</form>
</body>
</html>