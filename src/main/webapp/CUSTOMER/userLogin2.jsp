<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Logged In</title>
</head>
<body>
        <table style="width: 20%">
        <tr><td>
        <% String username = request.getParameter("username"); %>
<a>Welcome user, you have logged in.</a></td></tr>
<tr></tr><tr>td></td><td><a href=login.jsp"><b>Logout</b></a></td></tr>
</table>
</body>
</html>