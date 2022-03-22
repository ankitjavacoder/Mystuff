import java.sql.*;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String query = "insert into ankitdatabase.userinformation values (?,?,?,?,?)";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter first name : ");
			preparedStatement.setString(1, sc.next());
			System.out.println("Please enter last name : ");
			preparedStatement.setString(2,sc.next());
			System.out.println("Enter mobile number : ");
			preparedStatement.setString(3,sc.next());
			System.out.println("Enter mail-id : ");
			preparedStatement.setString(4, sc.next());
			System.out.println("Enter password : ");
			preparedStatement.setString(5, sc.next());
			int record = preparedStatement.executeUpdate();
			if (record > 0) {
				System.out.println("User registerd sucessfull");
			} else {
					System.out.println("Invalid Input");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
