import java.sql.*;

public class EstablishConnection8 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String query = "delete from ankitdatabase.studentinfo where percentage <35.00 ";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			System.out.println("Step 1");
			Statement statement = connection.createStatement();
			System.out.println("Step 2");
			int delete  = statement.executeUpdate(query);
			if (delete > 0) {
				System.out.println("Data Updated Sucessfully");
			} else {
					System.err.println("Invalid Percentage");
			}
			System.out.println("Step 3");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
