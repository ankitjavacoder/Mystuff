import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/mobileUpdation")
public class mobileUpdation extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String Emailid = req.getParameter("mail");
String Password = req.getParameter("pwd");
String url = "jdbc:mysql://localhost:3306";
String query = "select * from ankitdatabase.userinformation where emailId = ? and password = ?";
try {
	Class.forName("com.mysql.jdbc.Driver");
	//establishing connection
	Connection connection = DriverManager.getConnection(url, "root", "12345");
	PreparedStatement statement = connection.prepareStatement(query);
	statement.setString(1, Emailid);
	statement.setString(2, Password);
	ResultSet rs = statement.executeQuery();
	if (rs.next()) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("update.html");
		dispatcher.include(req, resp);
	} else {
		RequestDispatcher dispatcher = req.getRequestDispatcher("MobileUpdation.html");
		dispatcher.include(req, resp);
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
