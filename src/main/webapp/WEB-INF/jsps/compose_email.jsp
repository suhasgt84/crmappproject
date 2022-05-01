<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<h2>Send Email</h2>
 		<form action="sendemail" method="post"/>
 		<pre>
		 		To: <input type="email" name="email" value="${email}" required="required"/>
		 		Subject: <input type="text" name="sub"/>
		 		
		 		<textarea name="message" rows="20" cols="50">
				</textarea>
				<input type="submit" value="send"/>
 		</pre>
 		</form>
 		${msg}
</body>
</html>