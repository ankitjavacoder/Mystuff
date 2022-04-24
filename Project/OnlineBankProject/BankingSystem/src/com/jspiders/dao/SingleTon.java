package com.jspiders.dao;
import java.sql.*;


public class SingleTon {
	private Connection connection = null;
	private static final SingleTon ONLY_ONE = new SingleTon();
	private SingleTon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return connection;
	}
	public static SingleTon getObject() {
		return ONLY_ONE;
	}
	@Override
	protected void finalize() throws Throwable {
		if (connection != null) {
			connection.close();
		}
	}
}
