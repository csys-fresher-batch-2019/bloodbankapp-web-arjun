package com.chainsys;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;
import com.chainsys.bloodbankapp.model.BloodGroup;

@WebServlet("/DeleteRecords")
public class DeleteRecords extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  int user_id=Integer.parseInt(request.getParameter("user_id"));
		  BloodBankDAOImp b=new BloodBankDAOImp();
		  BloodGroup a=new BloodGroup();
		  a.setUserId(user_id);
		  try {
			boolean result=b.deleteEmployeeRecord(a);
			String results="";
			if(result) {
				results="SUCCESSFULLY DELETED";
			}
			else
			{
				results="INVALID DATA";
			}
			response.sendRedirect("Delete.jsp?result="+results);
			//PrintWriter obj=response.getWriter();
			//obj.println("Sucessfully Deleted");
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
