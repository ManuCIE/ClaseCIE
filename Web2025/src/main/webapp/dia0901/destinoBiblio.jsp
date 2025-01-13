<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>Datos libro:</b>
	<%
	String isbn = request.getParameter("isbn");
	String titulo = request.getParameter("titulo");
	String autor = request.getParameter("autor");
	String pg = request.getParameter("pg");
	String idioma = request.getParameter("idioma");
	String genre = request.getParameter("genre");
	String disponib = request.getParameter("disp");
	boolean disp = Boolean.parseBoolean(disponib);
	%>

	<p>
		<u>Título:</u>
		<%=titulo + "."%></p>
	<p>
	<p>
		<u>Autor:</u>
		<%=autor + "."%></p>
	<p>
	<p>
		<u>ISBN:</u>
		<%=isbn + "."%></p>
	<p>
	<p>
		<u>Idioma:</u>
		<%=idioma + "."%></p>
	<p>
	<p>
		<u>Género:</u>
		<%=genre + "."%></p>
	<p>
	<p>
		<u>Nº Páginas:</u>
		<%=pg + "."%></p>
	<p>
	<p>
		<%
		if (disp)
			out.println("<b>Disponible.</b>");
		else
			out.println("<b>No disponible.</b>");
		%>
	</p>


</body>
</html>