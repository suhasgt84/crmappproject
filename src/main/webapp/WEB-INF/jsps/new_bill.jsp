<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill -New bill</title>
</head>
<body>

<h2>Bill |create new bill</h2>
<hr>
<form action="createbill" method="post">
<pre>
 
		  Email<input type="email" name="email" value="${contacts.email }" required readonly>
		  First Name<input type="text" name="firstName" value="${contacts.firstName}" required readonly>
		  Last Name<input type="text" name="lastName" value="${contacts.lastName}" required readonly>
		  Mobile<input type="text" name="mobile" value="${contacts.mobile}" required readonly>
		  Product Name <input type="text" name="productName"/>
  		  Amount<input type="text" name="amount"/>
			<input type="submit" value="generatebill"/>

 </pre>

</form>
</body>
</html>