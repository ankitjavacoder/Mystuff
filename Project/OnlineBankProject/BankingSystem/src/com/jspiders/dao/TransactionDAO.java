package com.jspiders.dao;

import java.sql.*;

import com.jspiders.dto.ReceiverDTO;
import com.jspiders.dto.SenderDTO;

public class TransactionDAO {
	public String insertIransaction(SenderDTO senderDTO, ReceiverDTO receiverDTO, Connection connection) throws SQLException {
		String query = "insert into onlinebankmanagement.transactiondetails values(?,?,?,?)";
		PreparedStatement pstmt = connection.prepareStatement(query);
//		add transaction details of receiver
		pstmt.setString(1, receiverDTO.getTid());
		pstmt.setString(2, receiverDTO.getAccountNo());
		pstmt.setString(3, receiverDTO.getDescription());
		pstmt.setDouble(4, receiverDTO.getBalance());
		pstmt.setString(5, receiverDTO.gettDate());
//		to add record in table
		pstmt.addBatch();
//		add transaction details of sender
		pstmt.setString(1, senderDTO.getTid());
		pstmt.setString(2, senderDTO.getAccountNo());
		pstmt.setString(3, senderDTO.getDescription());
		pstmt.setDouble(4, senderDTO.getBalance());
		pstmt.setString(5, senderDTO.gettDate());
//		to add
		pstmt.addBatch();
		int [] recordstatus = pstmt.executeBatch();
		String tid = null;
		if (recordstatus[1] != 0 ) {
//			get transaction id of sender
			tid = senderDTO.getTid();
			System.out.println("Sender Tid : "+ tid);
		}
		return tid;
	}
}
