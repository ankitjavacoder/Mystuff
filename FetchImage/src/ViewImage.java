import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.*;
@WebServlet("/ViewImage")
public class ViewImage extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String mobile = req.getParameter("mob");
	String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	String query = "select * from ankitdatabase.user1 where Mobile = ?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, mobile);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Blob blob = rs.getBlob("Images");
			byte byteArray[] = blob.getBytes(1, (int)blob.length());
			OutputStream os = resp.getOutputStream();
			os.write(byteArray);
			os.flush();
			os.close();
		} else {
			System.out.println("Invalid Image");
		}
		connection.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
