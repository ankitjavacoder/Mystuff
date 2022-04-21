import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
@WebServlet("/Sigin")
public class Sigin  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String MobileNum = req.getParameter("mobile");
		String Password = req.getParameter("pwd");
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "select * from ankitdatabase.userinformation where mobileNumber = ? and password = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, MobileNum);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String first = rs.getString("fName");
				String last = rs.getString("lName");
				String email = rs.getString("emailId");
				HttpSession session = req.getSession();
				System.out.println("Data Retreived");
				session.setAttribute("ln", last);
				session.setAttribute("fn", first);
				session.setAttribute("mail", email);
				session.setAttribute("mobNo", MobileNum);
				session.setAttribute("password", Password);
				System.out.println("Data Sotred in Session storage");
				session.setMaxInactiveInterval(10);
				System.out.println("Time interval completed");
				RequestDispatcher dispatcher = req.getRequestDispatcher("logout.html");
				dispatcher.include(req, resp);				
				
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("Verify.html");
				dispatcher.include(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
