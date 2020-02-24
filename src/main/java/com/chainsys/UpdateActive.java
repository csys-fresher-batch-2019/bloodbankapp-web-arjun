package com.chainsys;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;
import com.chainsys.bloodbankapp.util.ConnectionUtil;
import com.chainsys.bloodbankapp.util.Logger;

@WebServlet("/UpdateActive")
public class UpdateActive extends HttpServlet {
	
	private static final Logger logger = Logger.getInstance(ConnectionUtil.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		boolean active=Boolean.parseBoolean(request.getParameter("active"));
		String email=request.getParameter("email");
		logger.info(email);
		logger.info(active);

		BloodBankDAOImp obj=new BloodBankDAOImp();
		try {
			boolean result=obj.updateDonateStatus(active,email);
			String results="";
			if(result) {
				results="SUCCESSFULLY UPDATED";
			}
			else
			{
				results="INVALID DATA";
			}
			response.sendRedirect("updateactive.jsp?result="+results);
		} catch (DbException e) {
			e.printStackTrace();
		}
	
	
	}

	
}
