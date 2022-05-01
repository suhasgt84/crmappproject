<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts </title>
</head>
<body>
	<h2>List of Contacts</h2>
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
				<th>Billing</th>  
				
			</tr>
		</thead>
		<c:forEach var="contacts" items="${contacts}">
			<tbody>
					<tr>
							<td>${contacts.id}</td>
						<td><a href="getcontact?id=${contact.id}">${contacts.firstName}</td>
						<td>${contacts.lastName}</td>
						<td>${contacts.email}</td>
						<td>${contacts.mobile}</td>
						<td>${contacts.leadSource}</td>
						<td><a href="generatebill?id=${contacts.id}">Create New Bill</a></td>
						
						
				</tr>
			</tbody>

		</c:forEach>
	</table>

</body>
</html>