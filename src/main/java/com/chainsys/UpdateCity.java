package com.chainsys;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;


@WebServlet("/UpdateCity")
public class UpdateCity extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int userId=Integer.parseInt(request.getParameter("user_id"));
		String city=request.getParameter("city");
		
		BloodBankDAOImp b=new BloodBankDAOImp();

		try {
			boolean result=b.updateCity(userId, city);
			String results="";
			if(result) {
				results="SUCCESSFULLY UPDATED";
			}
			else
			{
				results="INVALID DATA";
			}
			response.sendRedirect("updatecity.jsp?result="+results);
		}catch(DbException e) {
			e.printStackTrace();
		}
	}
}
