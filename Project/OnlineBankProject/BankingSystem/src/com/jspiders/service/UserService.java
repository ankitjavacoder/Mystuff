package com.jspiders.service;

import java.sql.SQLException;
import java.util.Random;

import com.jspiders.dao.UserDAO;
import com.jspiders.dto.RegistrationDTO;

public class UserService {
	UserDAO dao = new UserDAO();
public String userAccountNumber(RegistrationDTO dto) throws SQLException {
	Random random = new Random();
	int accno = random.nextInt();
	if (accno < 0) {
		accno = accno * -1;
	}
	if (accno < 1000000000) {
		accno+= 1000000000;
	}
	String accountNumber;
	 accountNumber = "JSP-" + accno;
	dto.setAccountNo(accountNumber);
	System.out.println(accountNumber);
	accountNumber = dao.registrationDAO(dto);
	return accountNumber;
}
public RegistrationDTO userLoginService(String accNo, String pwd) throws SQLException {
	RegistrationDTO dto = dao.userLogin(accNo, pwd);
	return dto;
}
}
