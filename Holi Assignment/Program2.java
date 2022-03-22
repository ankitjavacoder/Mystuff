import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String queryemailpsw = "select * from ankitdatabase.userinformation where emailId = ? and password = ?";
		String querymobpsw = "select * from ankitdatabase.userinformation where mobileNumber = ? and password = ?";
		String querymobile = "select * from ankitdatabase.userinformation where mobileNumber = ?";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Option :");
			System.out.println("1 Login through email and password");
			System.out.println("2 Login through mobile and password");
			System.out.println("3 Login through mobile and otp ");
			int value = sc.nextInt();
			if ( value == 1) {
				PreparedStatement preparedStatement = connection.prepareStatement(queryemailpsw);
				System.out.println("Enter mail id : ");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter password : ");
				preparedStatement.setString(2, sc.next());
				ResultSet rs = preparedStatement.executeQuery();
				if (rs.next()) {
					System.out.println("Welcome "+ rs.getString("fName"));
				} else {
					System.err.println("Data not found");
				}
			}
			else if (value == 2) {
				PreparedStatement preparedStatement = connection.prepareStatement(querymobpsw);
				System.out.println("Enter mobile number : ");
				preparedStatement.setString(1, sc.next());
				System.out.println("Enter password : ");
				preparedStatement.setString(2, sc.next());
				ResultSet rs = preparedStatement.executeQuery();
				if (rs.next()) {
				System.out.println("Welcome "+ rs.getString("fName"));
				} else {
					System.err.println("Data not found");
				}
			}
			else if (value == 3) {
				PreparedStatement preparedStatement = connection.prepareStatement(querymobile);
				System.out.println("Enter mobile number : ");
				preparedStatement.setString(1, sc.next());
				ResultSet rs = preparedStatement.executeQuery();
				if (rs.next()) {
					Random random = new Random();
					int otp = random.nextInt(10000);
					if (otp < 1000) {
						otp+=1000;
					}
					System.out.println(otp);
					System.out.println("Enter OTP : ");
					if (sc.nextInt()== otp) {
						System.out.println("OTP verified sucessfully");
						System.out.println("Welcome "+ rs.getString("fName"));
					} else {
						System.err.println("Invalid OTP ");
					}
					
				} else {
					System.err.println("Details not found");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
