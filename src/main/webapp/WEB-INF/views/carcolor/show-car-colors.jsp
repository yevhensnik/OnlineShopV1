<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Car COLORS</title>
</head>
<body>
		<form action="deleteCarColor">
			<table class="table table-hover">
				<tr>
					<th>Delete</th>
					<th>Color</th>
					<th>Update</th>
				</tr>
				<c:forEach items="${allCarColors}" var="carcolor">
					<tr>
						<td><input type="checkbox" name="checkbox"
							value="${carcolor.id}"></td>
						<td>${carcolor.name}</td>
						<td><a class="btn btn-primary"
							href="updateCarColor-${carcolor.id}">Update</a></td>						
					</tr>
				</c:forEach>
				
			</table>
			<div class="form-group">
				
			 <input class="btn btn-danger" type="submit" value="delete"
				id="delete" disabled />
				
			</div>
			<a href="createColor" class="btn btn-info">Add Color</a>
			
		</form>
</body>
</html>