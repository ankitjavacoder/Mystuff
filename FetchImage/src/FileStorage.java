import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/FileStorage")
@MultipartConfig(maxFileSize = 16177215)
public class FileStorage extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String first = request.getParameter("fn");
String last = request.getParameter("ln");
String email = request.getParameter("mail");
String mobile = request.getParameter("mob");
String password = request.getParameter("pwd");
Part filePart = request.getPart("file1");
System.out.println(filePart.getContentType());
System.out.println(filePart.getName());
System.out.println(filePart.getSize());
InputStream is = filePart.getInputStream();
String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
String query = "insert into ankitdatabase.user1 values (?,?,?,?,?,?)";
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url);
	PreparedStatement ps = connection.prepareStatement(query);
	ps.setString(1, first);
	ps.setString(2, last);
	ps.setString(3, email);
	ps.setString(4, mobile);
	ps.setString(5, password);
	ps.setBlob(6, is);
	ps.executeUpdate();
	connection.close();
	RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
	dispatcher.include(request, response);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
