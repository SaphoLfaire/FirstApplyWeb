<%@page import="java.util.List"%>
<%@ page import="tp.data.Book"%>
<%@page import="tp.data.Library"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Affichage livres</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="3">
		<caption>Livres présent dans votre bibliothèque</caption>
		<tr>
			<th>id</th>
			<th>Title</th>
			<th>nb page</th>
			<%
				Library lib = Library.getInstance();
				for (Book book : lib.getAll()) {
			%>
		
		<tr>
			<td>
					<a href="./detailsbook.jsp?bookid=<%=book.getId()%>"><%=book.getId()%></td>
			<td><%=book.getTitle()%></td>
			<td><%=book.getNbPages()%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>


