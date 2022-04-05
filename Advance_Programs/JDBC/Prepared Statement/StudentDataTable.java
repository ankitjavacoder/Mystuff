package package1;
import java.sql.*;
import java.util.Scanner;
public class StudentDataTable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "insert into ankitdatabase.studentinfo values(?,?,?,?)";
		try {
			/*Create connection */
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connection Established");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Platorm created");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter roll no ");
			int rn = scanner.nextInt();
			preparedStatement.setInt(1, rn);
			System.out.println("Enter name : ");
			scanner.nextLine();
			String sn = scanner.nextLine();
			preparedStatement.setString(2, sn);
			System.out.println("Enter stream : ");
			String str = scanner.next();
			preparedStatement.setString(3, str);
			System.out.println("Enter marks : ");
			Double mks = scanner.nextDouble();
			preparedStatement.setDouble(4, mks);
			int record = preparedStatement.executeUpdate();
			if (record >0) {
				System.out.println("Record inserted");
			}
			else System.err.println("Improper data ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
