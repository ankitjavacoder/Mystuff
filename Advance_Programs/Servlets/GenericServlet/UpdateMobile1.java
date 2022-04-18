package package1;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UpdateMobile1")
public class UpdateMobile1 extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String Emailid = req.getParameter("email");
		String Password = req.getParameter("pwd");
		String Mobile =req.getParameter("mob");
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "update ankitdatabase.userinformation  set mobileNumber = ? where emailId = ? and password = ?";
		PrintWriter write = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(2, Emailid);
			ps.setString(3, Password);
			ps.setString(1, Mobile);
			int res = ps.executeUpdate();
			if (res >0) {
				write.println("Mobile number updated : " + Mobile);
			} else {
				write.println("Invalid data");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
