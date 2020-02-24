package com.chainsys;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;
import com.chainsys.bloodbankapp.model.BloodGroup;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BloodBankDAOImp imp=new BloodBankDAOImp();
		BloodGroup model=new BloodGroup();
		String bg = request.getParameter("blood");
		int id = 0;
		try {
			id = imp.findByBloodGroupId(bg);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(id!=0) {
		String userName=request.getParameter("ename");
		String email=request.getParameter("email");
		String city = request.getParameter("city");
		model.setUserName(userName);
		model.setEmail(email);
		model.setBloodGroupId(id);
		model.setCity(city);
		
		try {
			int result=imp.addEmployeeDetails(model);
			String results="";
			if(result==0) {
				results="NOT UPDATED";
			}
			else
			{
				results="Sucessfully Registered";
			}
			response.sendRedirect("Register.jsp?result="+results);
//			request.setAttribute("result",results);
//			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
//			rd.forward(request,response);
		} catch (DbException e) {
			e.printStackTrace();
		}
	}
	}
}
