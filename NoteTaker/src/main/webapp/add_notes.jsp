<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>

		<br>

		<h1>Pleas fill your note detail</h1>

		<br>
		<!-- this is add form -->

		<form action="SaveNoteServlet" method="post">
			<div class="mb-3">
				<label for="title" class="form-label"> Note title</label> <input
					type="text" name="title" class="form-control" placeholder="Enter here"
					id="title" aria-describedby="emailHelp" required>

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>

				<textarea name="content" required style="height: 300px;" class="form-control"
					id="content" placeholder="Enter your content here"></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</form>
	</div>
</body>
</html>