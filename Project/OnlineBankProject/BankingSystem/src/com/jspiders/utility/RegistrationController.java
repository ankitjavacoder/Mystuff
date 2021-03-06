package com.jspiders.utility;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.dto.RegistrationDTO;
import com.jspiders.service.UserService;
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String first = req.getParameter("fn");
String last = req.getParameter("ln");
String address = req.getParameter("addr");
String mobile = req.getParameter("mob");
String aadhar = req.getParameter("aadhar");
String pancard = req.getParameter("pancard");
String email = req.getParameter("email");
String dob = req.getParameter("dob");
String gender = req.getParameter("abc");
String accountType = req.getParameter("type");
String temp = req.getParameter("amt");
double amount = Double.parseDouble(temp);
String password = req.getParameter("pwd");
String cPassword = req.getParameter("cpwd");

RegistrationDTO dto = new RegistrationDTO();
dto.setFirstName(first);
dto.setLastName(last);
dto.setAadharNo(aadhar);
dto.setAddress(address);
dto.setAmount(amount);
dto.setDob(dob);
dto.setEmail(email);
dto.setGender(gender);
dto.setMobile(mobile);
dto.setPancard(pancard);
dto.setPassword(password);
dto.setAccountType(accountType);

String accountNumber = null ;
UserService service = new UserService();
RequestDispatcher dispatcher = null;

try {
	if (password.equals(cPassword)) {
		accountNumber = service.userAccountNumber(dto);
	}
} catch (SQLException e) {
	e.printStackTrace();
}
//RequestDispatcher dispatcher = null;
if (accountNumber != null) {
	req.setAttribute("accNo", accountNumber);
dispatcher = req.getRequestDispatcher("account.jsp");	
}
else {
	req.setAttribute("msg", "invalid details");
	dispatcher = req.getRequestDispatcher("Registration.jsp");
}
dispatcher.include(req, resp);
}
}
