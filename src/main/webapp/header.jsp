<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">

<a class="navbar-brand" href="index.jsp">Blood Bank</a>
 <!-- Links -->
 <ul class="navbar-nav">
 <!--   <li class="nav-item">
   <a class="nav-link" href="index.jsp">Donor</a>
  </li>-->
  <li class="nav-item">
   <a class="nav-link" href="SearchByBloodGroup.jsp">Search</a>
  </li>
      <li class="nav-item">
   <a class="nav-link" href="UpdateWhole.jsp">Update</a>
  </li>
   
    
  <li class="nav-item">
   <a class="nav-link" href="Delete.jsp">Delete Records</a>
  </li>
 </ul>
 
 <%
 String username = (String) session.getAttribute("LOGGED_IN_USERNAME");
 %>
<ul class="navbar-nav ml-auto">
<% if ( username == null){ %>
  <li class="nav-item">
   <a class="nav-link" href="Login.jsp">Login</a>
  </li>
  <li class="nav-item">
   <a class="nav-link" href="Register.jsp">Donor Registration</a>
  </li>
  <%}
else{
%>
<li class="nav-item">
   <a class="nav-link" href="#">Welcome <%=username %></a>
  </li>
  <li class="nav-item">
   <a class="nav-link" href="LogoutServlet">Logout</a>
  </li>
  <%} %>

  </ul>
  </nav>
</body>
</html>

  