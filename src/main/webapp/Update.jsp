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

<h3>Update Blood Group</h3>
<div class="row">
<div class="col">
<form action="UpdateServlet"><br/>

User Id : <input type="number" name="userid"  required/></br></br>
Blood Group : <select id="bloodgroup" name="bloodgroup" required>
    <option value="">SELECT</option>
    <option value="A+ve">A+ve</option>
    <option value="A-ve">A-ve</option>
    <option value="B+ve">B+ve</option>
    <option value="B-ve">B-ve</option>
 	<option value="O+ve">O+ve</option>
    <option value="O-ve">O-ve</option>
 	<option value="AB+ve">AB+ve</option>
    <option value="AB-ve">AB-ve</option>
 	
  </select>
  <br/><br/>
<input type="submit" value="Update" class="btn btn-success"/></center></pre>
</form>

<%
			String result = (String) request.getParameter("result");
			if (result != null) {
				out.println(result);
			}
		%>
</div>
</div>
</body>
</html>