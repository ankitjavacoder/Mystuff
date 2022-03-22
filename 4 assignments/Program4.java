import java.sql.*;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String query = "delete  from ankitdatabase.userinformation where emailId = ? and password = ?";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter mail id : ");
			preparedStatement.setString(1, sc.next());
			System.out.println("Enter password : ");
			preparedStatement.setString(2, sc.next());
			int record = preparedStatement.executeUpdate();
			if (record >0) {
				System.out.println("Record Deleted ");
			}
			else System.err.println("Improper data ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
