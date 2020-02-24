<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<br/>
<br/>

<h3>Login</h3>

<form action="Login"></br></br>
<pre><center>User Name : <input type="text" name="uname"/></br></br>
Password : <input type="password" name="upass"/></br>
<input type="submit" value="Login"/></center></pre>
</form>
<%
String result=(String)request.getParameter("result");
if(result!=null){
	 out.println("<center>" +result+ "</center>");
} 
%>

</body>
</html>