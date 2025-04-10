package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get form data 
		
		String email = req.getParameter("email");
				
		String phone = req.getParameter("phone");
		
		String feedbackMessage = req.getParameter("feedback_message");
		
		
		// form data process 
		
		
		// response form data 
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Feedback servlet working </h1>");
		writer.println(
			    String.format(
			        "<h2>Your form details that have been submitted:</h2><br/>" +
			        "<h3>Email address: %s</h3><br/>" +
			        "<h3>Phone Number: %s</h3><br/>" +
			        "<h3>Feedback message: %s</h3><br/>",
			        email, phone, feedbackMessage
			    )
			);
		
		// if you redirect then use 
		//resp.sendRedirect("/home");
	}
}
