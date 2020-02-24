<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.chainsys.bloodbankapp.model.BloodGroup"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Donors</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<%
		ArrayList<BloodGroup> list = (ArrayList)request.getAttribute("blood");
		HttpSession sessionbg = request.getSession();
		String bloodGroup = (String)sessionbg.getAttribute("bg");
		HttpSession sessioncount = request.getSession();
		int count = Integer.parseInt(sessioncount.getAttribute("count").toString());
		System.out.println(count);
	%>
<h1><center>Blood Donors</center></h1>
<form action=Sendmail>	
<input type="text" name="bloodGroup" value="<%=bloodGroup %>" readonly/>
<%if(count!=-1){%>
<h2>No.of.Persons Available :<%= count%></h2>
<%} %>

	<center><table border="1">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>BloodGroup</th>
				<th>MailAddress</th>
				<th>City</th>
			</tr>
			<%
				int i = 1;
				for (BloodGroup obj : list) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=obj.getUserName()%></td>
				<%if(obj.getBloodsGroup()!=null){ %>
				<td><%= obj.getBloodsGroup() %></td>
				<%}else{ %>
				<td><%= bloodGroup %>
				<%} %>
				<td><%=obj.getEmail()%></td>
				<td><%=obj.getCity() %></td>
			</tr>
			<%
				}
			%>
		</thead>
	</table></center></br>
	<center><button> <type="submit">SendMail</a></button></center>
</form>
</body>
</html>