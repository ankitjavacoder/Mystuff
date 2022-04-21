import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/MobileUpdating")
public class MobileUpdating extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String OldMobile = req.getParameter("omob");
	String NewMobile = req.getParameter("nmob");
	String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	String query = "Update ankitdatabase.userinformation set mobileNumber = ? where mobileNumber = ?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, NewMobile);
		ps.setString(2, OldMobile);
		int res = ps.executeUpdate();
		PrintWriter writer = resp.getWriter();
		if (res>0) {
			resp.sendRedirect("https://www.youtube.com");
			
		} else {
			RequestDispatcher rs = req.getRequestDispatcher("update.html");
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
