package com.jspiders.service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.jspiders.dao.UserDAO;
import com.jspiders.dto.ReceiverDTO;
import com.jspiders.dto.SenderDTO;

public class MoneyTransactionService {
public int transactionNumber() {
	Random random = new Random();
	int id = random.nextInt();
	if (id<0) {
		id = id*-1;
	}
	if (id< 1000000000) {
		id+= 1000000000;
	}
	return id;
}
public String moneyTransferService(SenderDTO senderDTO, ReceiverDTO receiverDTO, double amount) throws SQLException {
//	generate transaction id
	int id = transactionNumber();
	String tid = null;
//	change format of date 
	Date date = new  Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("YYY-MM-dd");
	String transactionDate = dateFormat.format(date);
	System.out.println("Transaction "+ transactionDate);
	
	UserService service = new UserService();
	

	 double balance =  service.viewBlanceService(senderDTO.getAccountNo());
	 double balance2 = service.viewBlanceService(receiverDTO.getAccountNo());
	 
	 if (balance >= 1500) {
		//store data and transaction id in sender account
		 senderDTO.settDate(transactionDate);
		 double finalBalance = balance-amount;
		 senderDTO.setBalance(finalBalance);//set balance after deduction
		 senderDTO.setTid("TID" + id );
//		 store data and transaction id in receiver account
		 receiverDTO.settDate(transactionDate);
		 receiverDTO.setTid("TID-" + id*2);
		 double finalBalance2 = balance2 + amount;
		 receiverDTO.setBalance(finalBalance2);
		 UserDAO dao = new UserDAO();
		 tid = dao.moneyTransferUpdation(senderDTO, receiverDTO);
	}
	 return tid;
}
}
