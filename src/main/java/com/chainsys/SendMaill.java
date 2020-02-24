package com.chainsys;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodGroupUadateInfo;

/**
 * Servlet implementation class SendMaill
 */
@WebServlet("/SendMaill")
public class SendMaill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bloodgroup=request.getParameter("bg");
		BloodGroupUadateInfo b = new BloodGroupUadateInfo();
		try {
			b.BloodDonar(bloodgroup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				}

	

}
