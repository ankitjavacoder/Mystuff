import java.sql.*;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String query = "select * from ankitdatabase.userinformation where emailId = ? ";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter mail ID : ");
			preparedStatement.setString(1, sc.next());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("Password : " + resultSet.getString("password"));
			} else {
				System.err.println("Details not found...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
