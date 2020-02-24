package com.chainsys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.bloodbankapp.dao.implementation.BloodBankDAOImp;
import com.chainsys.bloodbankapp.exception.DbException;
import com.chainsys.bloodbankapp.model.BloodGroup;

@WebServlet("/SearchByBloodGroup")
public class SearchByBloodGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String bloodGroup1=(String)request.getParameter("bloodgroup");
	String city = request.getParameter("city");
	int count = -1;
	BloodBankDAOImp bloodDonars=new BloodBankDAOImp();
	List<BloodGroup> list = new ArrayList<BloodGroup>();
	if(city.length()!=0) {
		try {
			 count = bloodDonars.countInCity(bloodGroup1, city);
			list = bloodDonars.findByUserDetails(bloodGroup1, city);
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bg:"+bloodGroup1);
		request.setAttribute("blood",list);
		HttpSession sessionbg = request.getSession();
		sessionbg.setAttribute("bg", bloodGroup1);
		HttpSession sessioncount = request.getSession();
		sessioncount.setAttribute("count", count);
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp?count="+count+"");
		rd.forward(request,response);
	}
	else {
	try {
		list = bloodDonars.findByBloodGroup(bloodGroup1);
		System.out.println(list);
		request.setAttribute("blood",list);
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp?count="+count+"");
//		HttpSession ses=request.getSession();
//		ses.setAttribute("blood", bloodGroup1);
		rd.forward(request,response);
		
		/*for (BloodGroup bloodGroup : list) {
			out.print(bloodGroup.getBloodGroup()+"\t"+bloodGroup.getEmpName()+"\t"+bloodGroup.getEmail()+"</br>");
		}*/
	} catch (DbException e) {
	
		e.printStackTrace();
	}
	
	}
	}
}