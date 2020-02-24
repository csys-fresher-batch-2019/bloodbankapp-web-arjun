<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
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
<%
String bloodGroup = request.getParameter("bloodgroup");
%>
<h3>Search by Blood Group</h3>
<form action="SearchByBloodGroup">
Enter Blood Group :

<select id="search" name="bloodgroup" required>
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
City: 
 <select id="city" name="city" >
    <option value="">SELECT</option>
    <option value="chennai">Chennai</option>
    <option value="Coimbatore">Coimbatore</option>
    <option value="Madurai">Madurai</option>
    <option value="Salem">Salem</option>
 	<option value="Theni">Theni</option>
    <option value="Palani">Palani</option>
 	<option value="Thirupur">Thirupur</option>
    <option value="Trichy">Trichy</option>
 	
  </select>
<button type="submit">Submit</button>
</form>
</div>
</body>
</html>