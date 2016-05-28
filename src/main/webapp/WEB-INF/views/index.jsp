<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<spring:url value="/showAllCarColors" var="urlShowCarColors" />
<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<body>
	<div class="container">
		<h1>OnLine SHOP LiveToBuy</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Mercedes_Benz</th>
					<th>BMW</th>
					<th>AUDI</th>
					<th>Who are the Best???</th>
				</tr>
			</thead>
		</table>

	</div>
	<div>
		<a class="navbar-brand" href="${urlShowCarColors}">Car Colors</a>
	</div>
	
	
	<jsp:include page="footer.jsp" />
</body>
</html>