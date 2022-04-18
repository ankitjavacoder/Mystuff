
package package1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/FirstProgram")
public class FirstProgram extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//Backend Code
		System.out.println("Backend of an application");
	System.out.println("Connection established Sucessfull");
	//print current system data
	Date date = new Date();
	System.out.println("Current Date : ");
	System.out.println(date);
	}
}
