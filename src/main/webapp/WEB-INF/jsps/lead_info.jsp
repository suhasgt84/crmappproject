<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="menu.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
		<h2>Lead Details</h2>
		Lead Id: ${lead.id}<br/>
		Lead email: ${lead.email}<br/>
		Lead first name: ${lead.firstName}<br/>
		Lead last name: ${lead.lastName}<br/>
		Lead mobile: ${lead.mobile}<br/>
		Lead source: ${lead.leadSource}<br/>
	<form action="compose" method="post">
	<input type="hidden" name="email" value="${lead.email}"/>
	<input type="submit" value="send email"/>
	
	</form>
	
	<form action="savecontact" method="post">
	<input type="hidden" name="id" value="${lead.id}"/>
	<input type="submit" value="convert"/>
	
	</form>
	
	 
</body>
</html>