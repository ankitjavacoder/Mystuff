import java.sql.*;
import java.util.Random;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String queryregist = "insert into ankitdatabase.userinformation values (?,?,?,?,?)";
		String queryemailpsw = "select * from ankitdatabase.userinformation where emailId = ? and password = ?";
		String querymobpsw = "select * from ankitdatabase.userinformation where mobileNumber = ? and password = ?";
		String querymobile = "select * from ankitdatabase.userinformation where mobileNumber = ?";
		String querydelete = "delete  from ankitdatabase.userinformation where emailId = ? and password = ?";
		String queryshwpsw = "select * from ankitdatabase.userinformation where emailId = ? ";
		String queryUpdate = "update ankitdatabase.userinformation set password = ? where emailId = ? and password = ?";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "12345");
			Scanner sc = new Scanner(System.in);
			int state = 1;
			while(state==1) {
				System.out.println("Ente 1 for  Registration");
				System.out.println("Press 2 for login");
				System.out.println("Press 3 for update password");
				System.out.println("Press 4 for Forget password");
				System.out.println("Press 5 for delete account");
				int value = sc.nextInt();
				if (value == 1) {
					PreparedStatement preparedStatement = connection.prepareStatement(queryregist);
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
					System.out.println("Press 1 for continue");
					state = sc.nextInt();
				}
				else if (value == 2) {
					System.out.println("Enter 1 for login through emailId and password");
					System.out.println("ENter 2 for login through mobile and password");
					System.out.println("Enter 3 for login through mobile and otp");
					int loginvalue = sc.nextInt();
					if (loginvalue == 1) {
						PreparedStatement preparedStatement = connection.prepareStatement(queryemailpsw);
						System.out.println("Enter mail id : ");
						preparedStatement.setString(1, sc.next());
						System.out.println("Enter password : ");
						preparedStatement.setString(2, sc.next());
						ResultSet rs = preparedStatement.executeQuery();
						if (rs.next()) {
							System.out.println("Welcome "+ rs.getString("fName"));
							System.out.println("Press 1 for continue");
							state = sc.nextInt();
						} else {
							System.err.println("Data not found");
							System.out.println("Press 1 for continue");
							state = sc.nextInt();
						}
					}
					else if (loginvalue == 2) {
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
						System.out.println("Press 1 for continue");
						state = sc.nextInt();
					}
					else if (loginvalue == 3) {
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
						System.out.println("Press 1 for continue");
						state = sc.nextInt();
					}
				}
				else if (value == 3) {
					PreparedStatement preparedStatement = connection.prepareStatement(queryUpdate);
					System.out.println("Enter email-id :");
					preparedStatement.setString(2, sc.next());
					System.out.println("enter old password : ");
					preparedStatement.setString(3, sc.next());
					System.out.println("Enter new Password : ");
					preparedStatement.setString(1, sc.next());
					int record = preparedStatement.executeUpdate();
					if (record > 0) {
						System.out.println("Password Updated ");
					}
					else System.out.println("Invalid email or password");
					System.out.println("Press 1 for continue");
					state = sc.nextInt();
				}
				else if (value == 4) {
					PreparedStatement preparedStatement = connection.prepareStatement(queryshwpsw);
					System.out.println("Enter mail ID : ");
					preparedStatement.setString(1, sc.next());
					ResultSet resultSet = preparedStatement.executeQuery();
					if (resultSet.next()) {
						System.out.println("Password : " + resultSet.getString("password"));
					} else {
						System.err.println("Details not found...");
					}
					System.out.println("Press 1 for continue");
					state = sc.nextInt();
				}
				else if (value == 5) {
					PreparedStatement preparedStatement = connection.prepareStatement(querydelete);
					System.out.println("Enter mail id : ");
					preparedStatement.setString(1, sc.next());
					System.out.println("Enter password : ");
					preparedStatement.setString(2, sc.next());
					int record = preparedStatement.executeUpdate();
					if (record >0) {
						System.out.println("Record Deleted ");
					}
					else System.err.println("Improper data ");
					System.out.println("Press 1 for continue");
					state = sc.nextInt();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
