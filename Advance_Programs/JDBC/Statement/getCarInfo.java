import java.sql.*;
;

public class getCarInfo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String query = "select * from ankitdatabase.carinfo where carColor = 'Blue'";
		try {
			/* Connection create*/
			Connection connection = DriverManager.getConnection(url , "root", "12345");
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			boolean status = resultSet.next(); 
			do{
			System.out.println("Car Name : " + resultSet.getString("carBrand"));
			System.out.println("Car Number : "+ resultSet.getString("carNum"));
			System.out.println("Car Color : "+ resultSet.getString("carColor"));
			System.out.println("----------------------------------------");
			}
			while(resultSet.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
