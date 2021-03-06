package com.jspiders.dao;
import java.sql.*;

import javax.servlet.Registration;

import com.jspiders.dto.ReceiverDTO;
import com.jspiders.dto.RegistrationDTO;
import com.jspiders.dto.SenderDTO;

public class UserDAO {
	public String registrationDAO(RegistrationDTO dto) throws SQLException {
		String query = "insert   into onlinebankmanagement.bankaccountdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
	String firstName;
	String lastName;
	String accountNo;
	
	public RegistrationDTO userLogin(String accNo, String password) throws SQLException {
		RegistrationDTO dto = null;
		String query = "select * from onlinebankmanagement.bankaccountdetails where accountNo = ? and password = ?";
		SingleTon singleTon = SingleTon.getObject();
		Connection connection = singleTon.getConnection();
		System.out.println("Connection");
		PreparedStatement pstmt = connection.prepareStatement(query);
		System.out.println("statement");
		pstmt.setString(1, accNo);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("query");
		System.out.println("Accno " + accNo);
		System.out.println("Password " + password);
		if (rs.next()) {
			dto = new RegistrationDTO();
			firstName = rs.getString("firstName");
			lastName =  rs.getString("lastName");
			accountNo = rs.getString("accountNo");
			System.out.println("First Name : "+ firstName);
			dto.setFirstName(firstName);
			dto.setLastName(lastName);
			dto.setAccountNo(accountNo);
		} else {
				dto = null;
		}
		return dto;
	}
	public double viewBalanceDao(String accNo) throws SQLException {
		double balance = 0;
		String query = "select * from onlinebankmanagement.bankaccountdetails where accountNo = ?";
		SingleTon singleTon = SingleTon.getObject();
		Connection connection = singleTon.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, accNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			balance = rs.getDouble("amount");
		}
		return balance;
	}
	public String moneyTransferUpdation(SenderDTO senderDTO, ReceiverDTO receiverDTO) throws SQLException {
		String query = "Update onlinebankmanagement.bankaccountdetails set amount = ? where accountNo = ?";
		SingleTon singleTon = SingleTon.getObject();
		Connection connection = singleTon.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(query);
//		to update balance in sender account
		pstmt.setDouble(1, senderDTO.getBalance());
		pstmt.setString(2, senderDTO.getAccountNo());
		pstmt.addBatch();
//		to update balance in receiver amount
		pstmt.setDouble(1, receiverDTO.getBalance());
		pstmt.setString(2, receiverDTO.getAccountNo());
		pstmt.addBatch();
//		to execute records
		int [] recordStatus = pstmt.executeBatch();
		String tid = null;
		if (recordStatus[1] != 0) {
			TransactionDAO trDao =  new TransactionDAO();
			tid = trDao.insertIransaction(senderDTO, receiverDTO, connection);
		}
		return tid;
	}
}
