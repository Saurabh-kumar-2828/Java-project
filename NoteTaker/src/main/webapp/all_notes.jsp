<!doctype html>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.List"%>
<%@page import="com.entities.*"%>


<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>All Notes : Note Taker</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class="text-uppercase">All Notes:</h1>

		<div class="row">

			<div class="col-12">
				<%
				Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				for (Note note : list) {
				%>
				<div class="card mt-3">
					<img src="img/pencil.png" style="max-width: 100px;"
						class="card-img-top m-4 mx-auto" alt="pencil image add">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<p class="text-end text-primary"><b><%=note.getAddedDate() %></b></p>
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a> 
							<a href="edit.jsp?note_id=<%= note.getId() %>"
								class="btn btn-primary">Update</a>
						</div>
					</div>
				</div>

				<%
				// out.println(note.getId()+ " : "+note.getTitle()+" <br>");
				}
				s.close();
			
				%>
			</div>
		</div>
	</div>
</body>
</html>