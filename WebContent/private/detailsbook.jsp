<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="tp.data.Library"%>
<%@ page import="tp.data.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details du livre</title>
</head>
<body>
	<%
		Library lib = Library.getInstance();
		String id = request.getParameter("bookid");
		
		int idf = Integer.parseInt(id);
		Book book = lib.getById(idf);
	%>

	<h1>Titre : <%=book.getTitle() %></h1>
	<h2>page : <%=book.getNbPages()%></h2>
	<h3>Mot clés : <%=book.getKeywords() %></h3>

</body>
</html>