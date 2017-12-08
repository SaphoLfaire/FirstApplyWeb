<%@page import="tp.data.UserBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MA super application web trop moche !!!</title>
</head>
<body>
	<div id="calque">
		<%
			UserBeans user = (UserBeans) session.getAttribute("USER");
		%>
		<h3>Bienvenue <%=user.getLogin()%> </h3>
		<div> <a href="../private/logout">Se deconnecter</a></div>
	</div>