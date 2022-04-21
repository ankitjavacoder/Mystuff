package packge1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String EmailId = req.getParameter("Email");
		String Password = req.getParameter("pwd");
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "select * from ankitdatabase.userinformation where emailId = ? and password = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, EmailId);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String Fname = rs.getString("fName");
				String Lname = rs.getString("lName");
				String Mobile = rs.getString("mobileNumber");
				HttpSession session = req.getSession();
				session.setAttribute("FIRSTNAME", Fname);
				session.setAttribute("LASTNAME", Lname);
				session.setAttribute("EMAILID", EmailId);
				session.setAttribute("MOBILE",Mobile);
				session.setAttribute("PASSWORD", Password);
				session.setMaxInactiveInterval(10);
				RequestDispatcher dispatcher = req.getRequestDispatcher("LogoutCred.html");
				dispatcher.include(req, resp);
				
			} else {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}