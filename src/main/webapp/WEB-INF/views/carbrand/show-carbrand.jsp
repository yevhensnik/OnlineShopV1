<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h2>
		<a href="createCarBrand" class="btn btn-info">Add CarBrand</a>
	</h2>

	<form action="deleteCarBrand">
		<table class="table table-hover">

			<tr>
				<th>Brand</th>
				<th>Model</th>
				<th>Delete</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${carbrands}" var="carbrand">
				<c:forEach items="${carbrandmodels}" var="carbrandmodel1">
					<c:if test="${carbrand.carbrandmodel.id eq carbrandmodel1.id}">
						
							<tr>
								<td>${carbrand.name}</td>
								<td>${carbrandmodel.name}</td>
								<td><input type="checkbox" name="checkbox"
									value="${carbrand.id}"></td>
								<td><a
									href="${pageContext.request.contextPath}/editCarBrand/${carbrand.id}"
									class="btn btn-primary">Update</a></td>
							</tr>
						
					</c:if>
				</c:forEach>
			</c:forEach>

		</table>
		<div class="form-group">
			<input class="btn btn-danger" type="submit" value="delete"
				id="delete" disabled />
		</div>
	</form>

	</div>
	<jsp:include page="../footer.jsp" />

</body>
</html>