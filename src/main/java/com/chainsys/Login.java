package com.chainsys;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("uname");
		String password=request.getParameter("upass");
		if(username.equals("admin") && password.equals("admin") ) {
			
			//store username in session
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USERNAME", username);
			
			response.sendRedirect("index.jsp");
		}
		else {
			String error="Incorrect username/password";
			response.sendRedirect("Login.jsp?result="+error);
		}
		
		
	}


}
