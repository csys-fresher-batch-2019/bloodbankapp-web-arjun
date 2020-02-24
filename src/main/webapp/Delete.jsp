<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<br/>
<br/>
<h3>Delete Records</h3>
<form action=DeleteRecords>
Enter the user_id:<input type="number" name="user_id" placeholder=" enter the user_id"required>
<button type="submit">Delete</button>

</form>

<%
			String result = (String) request.getParameter("result");
			if (result != null) {
				out.println(result);
			}
		%>

</body>
</html>