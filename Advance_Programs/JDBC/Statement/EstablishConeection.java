import java.sql.*;

public class EstablishConeection2 {

	public static void main(String[] args) {
		String query = "insert into ankitdatabase.employee values(204,'Rakesh','85000.00',1005)";
		String url = "jdbc:mysql://localhost:3306";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			System.out.println("Step1");
			
			//Create statement type of platform
			Statement statement = connection.createStatement();
			System.out.println("Step 2");
			
			//execute query
			statement.executeUpdate(query);
			System.out.println("Step3");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
