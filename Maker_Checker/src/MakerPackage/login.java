package MakerPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/Login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String UserNameValue= request.getParameter("user");
	String PasswordValue= request.getParameter("password");
//	System.out.println(UserNameValue + PasswordValue);
	databaseConnection.validateLogin(UserNameValue, PasswordValue);
		PrintWriter out = response.getWriter();
		out.println("welcome");
	}

}
