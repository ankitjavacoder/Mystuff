package com.jspiders.dao;
import java.sql.*;

import javax.servlet.Registration;

import com.jspiders.dto.RegistrationDTO;

public class UserDAO {
	public String registrationDAO(RegistrationDTO dto) throws SQLException {
		String query = "insert into onlinebankmanagement.bankaccountdetails(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		SingleTon singleTon = SingleTon.getObject();
		Connection connection = singleTon.getConnection();
		System.out.println("Established "+ connection);
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, dto.getAccountNo());
		ps.setString(2, dto.getFirstName());
		ps.setString(3, dto.getLastName());
		ps.setString(4, dto.getMobile());
		ps.setString(5, dto.getPancard());
		ps.setString(6, dto.getAadharNo());
		ps.setString(7, dto.getEmail());
		ps.setString(8, dto.getAddress());
		ps.setString(9, dto.getDob());
		ps.setString(10, dto.getGender());
		ps.setString(11, dto.getAccountType());
		ps.setString(12, dto.getPassword());
		ps.setDouble(13, dto.getAmount());
		
		String accountNumber;
		int record = ps.executeUpdate();
		if (record>0) {
			accountNumber = dto.getAccountNo();
		} else {
			accountNumber = null;
		}
		return accountNumber;
	}
}
