
	<%@include file="../inc/header.jsp" %>
<%@page import="tp.data.Library"%>
<%@ page import="tp.data.Book"%>


	<%
		Library lib = Library.getInstance();
		String id = request.getParameter("bookid");

		int idf = Integer.parseInt(id);
		Book book = lib.getById(idf);
	%>

	<h1>
		Titre :
		<%=book.getTitle()%></h1>
	<h2>
		page :
		<%=book.getNbPages()%></h2>
	<h3>
		Mot clés :
		<%=book.getKeywords()%></h3>


<%@include file="../inc/footer.jsp" %>
