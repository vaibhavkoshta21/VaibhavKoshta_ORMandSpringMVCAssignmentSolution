<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Crm</title>
</head>

<body>

	<div class="container">

		<h3>Crm Registration Detail</h3>
		<hr>

		<p class="h4 mb-4">Crm</p>

		<form action="/CustomerRelationshipManagement/crm/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Crm.id}" />

			<div class="form-inline">
				<input type="text" name="fname" value="${Crm.fname}"
					class="form-control mb-4 col-4" placeholder="FirstName">



			</div>

			<div class="form-inline">

				<input type="text" name="lname" value="${Crm.lname}"
					class="form-control mb-4 col-4" placeholder="LastName">



			</div>

			<div class="form-inline">

				<input type="text" name="email" value="${Crm.email}"
					class="form-control mb-4 col-4" placeholder="Email">



			</div>
			

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/CustomerRelationshipManagement/crm/list">Back to Crm List</a>

	</div>
</body>

</html>
