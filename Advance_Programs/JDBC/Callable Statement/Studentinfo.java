//Callable Statement
import java.sql.*;
public class Studentinfo {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		Connection connection = DriverManager.getConnection(url);
		System.out.println("Enstablished Connection");
		CallableStatement cs = connection.prepareCall("call ankitdatabase.SelectData");
		ResultSet record = cs.executeQuery();
		if(record.next()) {
			System.out.println("Studen Roll No : "+ record.getInt("rollName"));
			System.out.println("Student name : "+ record.getString("studentName"));
			System.out.println("Strean" + record.getString("stream"));
			System.out.println("percentage : "+ record.getDouble("percentage"));
		}
	}

}
