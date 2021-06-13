<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Enter Your Name</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6 text-center">
				<h1 class="text text-danger my-4">Enter Your Name</h1>
				<form action="showincapital" method="post">
					<div class="row my-3">
						<div class="col-4">
							<label for="fname" class="text-info">First Name:</label> <label
								for="lname" class="text-info">Last Name:</label>
						</div>
						<div class="col-8">
							<input type="text" name="fname" id="fname" class="form-control" />
							<input type="text" name="lname" id="lname" class="form-control" />
						</div>
					</div>
					<input type="submit" value="Show My Name in CAPS"
						class="btn btn-success" />
				</form>
			</div>
			<div class="col-3"></div>
		</div>
	</div>
</body>
</html>