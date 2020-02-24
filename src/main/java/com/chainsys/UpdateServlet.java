package com.chainsys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;
import com.chainsys.bloodbankapp.model.BloodGroup;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		BloodBankDAOImp imp = new BloodBankDAOImp();
		//BloodGroup model = new BloodGroup();
		
		int userId=Integer.parseInt(request.getParameter("userid"));
		String bloodGroup=request.getParameter("bloodgroup");
		try {
			boolean result = imp.updateBloodGroup(userId,bloodGroup);
			String results="";
			if(result) {
				results="SUCCESSFULLY UPDATED";
			}
			else
			{
				results="INVALID DATA";
			}
			response.sendRedirect("Update.jsp?result="+results);
			//PrintWriter out=response.getWriter();
			//out.println(status);
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//response.sendRedirect("SearchByBloodGroup.jsp");
	}

	

}
