package com.jspiders.utility;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspiders.dto.RegistrationDTO;
import com.jspiders.service.UserService;
@WebServlet("/LoginController")
public class LoginController  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String accountNo = req.getParameter("an");
	String pwd = req.getParameter("pwd");
	System.out.println(accountNo + ", " + pwd);
	UserService service = new UserService();
	try {
		RegistrationDTO dto = service.userLoginService(accountNo, pwd);
		RequestDispatcher dispatcher;
		HttpSession session;
		if (dto != null) {
			session = req.getSession();
			String username = dto.getFirstName().toUpperCase() + " " + dto.getLastName().toUpperCase();
			session.setAttribute("un", username);
			session.setAttribute("an", accountNo);
			System.out.println("Username" + username);
			session.setMaxInactiveInterval(450);
			dispatcher = req.getRequestDispatcher("DisplayName.jsp");
		}
		else {
			req.setAttribute("msg", "Invalid Credentails");
		dispatcher = req.getRequestDispatcher("Login.jsp");
		}
		dispatcher.include(req, resp);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
}
