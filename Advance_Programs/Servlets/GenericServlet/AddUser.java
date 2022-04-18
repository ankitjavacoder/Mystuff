package package1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/AddUser")
public class AddUser extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String Firstname = req.getParameter("fname");
		String Lastname = req.getParameter("lname");
		String Mobileno = req.getParameter("mobno");
		String Emailid = req.getParameter("emailid");
		String Password = req.getParameter("pwd1");
		String Password1 = req.getParameter("pwd2");
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		PrintWriter write = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			CallableStatement cs = connection.prepareCall("call ankitdatabase.UserRegister(?,?,?,?,?)");
			cs.setString(1, Firstname);
			cs.setString(2, Lastname);
			cs.setString(3, Mobileno);
			cs.setString(4,Emailid);
			cs.setString(5, Password);
			if (Password.equals(Password1)) {
				int record = cs.executeUpdate();
				if (record > 0) {
					write.println("First Name : " + Firstname);
					write.println("Last Name :"+ Lastname);
					write.println("Email id : "+ Emailid);
				} else {
					write.println("Password not same");
				}
			} else {
				//invalid details 
				write.println("Invalid Details entered");
			}
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
