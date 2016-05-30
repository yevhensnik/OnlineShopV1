<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="container">
		<h2>Create new car Brand</h2>
		<form action="createCarBrand" method="POST" class="form-horizontal">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name
					CarBrand</label>
				<div class="col-sm-10">
					<input type="text" name="name" class="form-control" /> <br>
				</div>
			</div>

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Model</label>
				<div class="col-sm-5">
					<select name="brandModelId" size="5" id="list_Schedules"
						class="form-control">
						<option value="0" label="-Select model-" />
						<c:forEach items="${carbrandmodels}" var="carbrandmodel">
							<option value="${carbrandmodel.id}" label="${carbrandmodel.name}" />
						</c:forEach>
					</select>
				</div>
			</div>
			<input type="submit" name="commit" value="Add"
				class="btn-lg btn-primary pull-right" />
		</form>

	</div>
</body>
</html>