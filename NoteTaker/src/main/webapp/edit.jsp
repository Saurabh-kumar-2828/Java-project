<%@ page language="java" contentType ="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import ="com.helper.*, org.hibernate.*, com.entities.*" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Update Notes : Note Taker</title>
        <%@include file="all_js_css.jsp" %>
  
  </head>
  <body>
    <div class="container">
      <%@include file="navbar.jsp" %>
      <h1>Edit Your Note</h1>
      <br>
     <%
     int noteId = Integer.parseInt(request.getParameter("note_id").trim());
     Session s=FactoryProvider.getFactory().openSession();
     
	 Note note = (Note) s.get(Note.class, noteId);
     
     %>
     
     <form action="UpdateServlet" method="post">
         
         <input value="<%= note.getId() %>" name="noteId" type="hidden"/>
			<div class="mb-3">
				<label for="title" class="form-label"> Note title</label> <input
					type="text" name="title" class="form-control" placeholder="Enter here"
					id="title" aria-describedby="emailHelp" value="<%= note.getTitle() %>">

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>

				<textarea name="content" style="height: 300px;" class="form-control"
					id="content" placeholder="Enter your content here"><%= note.getContent() %></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save Your Note</button>
			</div>
		</form>
    </div>
  </body>
</html>