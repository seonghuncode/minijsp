<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>servlet</title>
</head>
<body>
	<h1>${result} 단</h1>

	<%
	int number = (int)request.getAttribute("result");
	
	for( int i = 1; i < 10; i++ ){ %>

		<p><%=number%> * <%=i%> = <%=number * i%></p>

	<% } %>
</body>
</html>