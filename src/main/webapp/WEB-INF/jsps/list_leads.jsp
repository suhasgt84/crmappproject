<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Leads</title>
</head>
<body>
<a href="viewleadspage">create new lead</a>
	<h2>List of Leads</h2>
	<hr>
	
	<table border="4">
		<thead>
			<tr>
				<th>Id</th>
				<th>First name</th>
				<th>Last name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Lead source</th>
				
			</tr>
		</thead>
		<c:forEach var="lead" items="${leads}">
			<tbody>
					<tr>
						<td>${lead.id}</td>
						<td><a href="getlead?id=${lead.id}">${lead.firstName}</td>
						<td>${lead.lastName}</td>
						<td>${lead.email}</td>
						<td>${lead.mobile}</td>
						<td>${lead.leadSource}</td>
						
						
				</tr>
			</tbody>

		</c:forEach>
	</table>

</body>
</html>