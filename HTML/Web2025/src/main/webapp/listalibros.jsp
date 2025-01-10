<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="es.cie.repositories.LibroRepository"%>
<%@page import="es.cie.negocio.Libro"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="estilo.css">
</head>
<%
LibroRepository repo = new LibroRepository();
List<Libro> lista = repo.buscarTodos();
%>
<body>
	<table>
		<caption>
			<u>Lista de libros:</u>
		</caption>
		<tr>
			<th>ISBN</th>
			<th>TÍTULO</th>
			<th>AUTOR</th>
			<th>Nº PAGS</th>
		</tr>
		<%
		for (Libro libro : lista) {
		%>

		<tr>

			<td><%=libro.getIsbn()%></td>
			<td><%=libro.getTitulo()%></td>
			<td><%=libro.getAutor()%></td>
			<td><%=libro.getPaginas()%></td>
		</tr>


		<%
		}
		%>
	</table>
</body>
</html>