<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<a href=UpdateActive>Update by Willingness to Donate</a>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
<br/>
<br/>
<h3>Update Active</h3>
<div class="row">
<div class="col">
<form action="UpdateActive"></br>
Enter the Email:<input type="email" name="email" placeholder=" enter the email"required></br></br>
Enter for Activation:
</br><input type="radio" name="active" value="1" >Ready to donate
<input type="radio" name="inactive" value="0" >Not ready to donate</br>
<input type="submit" value="Update" class="btn btn-success"/></center></pre>

</form>

<%
			String result = (String) request.getParameter("result");
			if (result != null) {
				out.println(result);
			}
		%>

</body>
</html>