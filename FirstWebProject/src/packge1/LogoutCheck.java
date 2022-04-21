package packge1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/LogoutCheck")
public class LogoutCheck extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		HttpSession session = req.getSession();
		String firstName = (String) session.getAttribute("FIRSTNAME");
		String lastName = (String) session.getAttribute("LASTNAME");
		
		if (firstName != null) {
			writer.println("Thank you "+ firstName + " " + lastName);
			session.invalidate();
		} else {
			writer.println("Session time out");
		}
	}

}
