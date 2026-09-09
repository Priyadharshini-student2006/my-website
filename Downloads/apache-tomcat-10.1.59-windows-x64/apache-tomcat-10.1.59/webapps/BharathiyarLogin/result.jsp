<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Result</title></head>
<body>
<h2 id="result"><%= request.getAttribute("message") %></h2>
<a href="login.jsp">Back</a>
</body>
</html>