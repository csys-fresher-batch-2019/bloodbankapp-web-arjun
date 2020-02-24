package com.chainsys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.bloodbankapp.dao.implementation.BloodGroupUadateInfo;

@WebServlet("/Sendmail")
public class Sendmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String search=request.getParameter("bloodGroup");
		System.out.println("SendMail:" + search);
		PrintWriter out=response.getWriter();
		System.out.println(search);
		//HttSession 
		BloodGroupUadateInfo b = new BloodGroupUadateInfo();
		try {
			b.BloodDonar(search);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("SearchByBloodGroup.jsp");
	}
}
