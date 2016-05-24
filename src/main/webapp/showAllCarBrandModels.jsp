<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>MODELS</h1>
	<table>
		<c:forEach items="${allCarBrandModels}" var="allCarBrandModels">
			<tr>
				<td>${allCarBrandModels.id}</td>
				<td>${allCarBrandModels.name}</td>

			</tr>
		</c:forEach>
	</table>



	<h1>Register</h1>

	<sf:form method="POST" modelAttribute="application" action="index.html">

		<div class="reg_section personal_info">
			<h3>Your Personal Information</h3>
			<input type="text" name="name" value="" placeholder="Your Name">

		</div>
		<a href="users.html">Users</a>
		<p class="submit">
			<input type="submit" name="submit" value="Submit">
		</p>
	</sf:form>
</body>
</html>