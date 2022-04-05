import java.sql.*;

public class EstablishConnection5 {

	public static void main(String[] args) {
		String query = "insert into  ankitdatabase.userinformation values('Rajesh','raji','852665959','abc@gmail.com',11122) ";
		String query1 = "insert into  ankitdatabase.userinformation values('Ramu','Reddy','852114777','abramuc@gmail.com',111252) ";
		String query2 = "insert into  ankitdatabase.userinformation values ('Trinath','Rao','852669945','trinath@gmail.com',115122) ";

		String url = "jdbc:mysql://localhost:3306";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			System.out.println("Step1");
			
			//Create statement type of platform
			Statement statement = connection.createStatement();
			System.out.println("Step 2");
			
			//execute query
			statement.executeUpdate(query1);
			statement.executeUpdate(query2);
			statement.executeUpdate(query);
			System.out.println("Step3");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}