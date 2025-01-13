<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="es.cie.repositories.*"%>
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
LibroRepositoryMemoria repo = new LibroRepositoryMemoria();
String tipobusqueda = request.getParameter("tipobusqueda");
String textobusqueda = request.getParameter("textobusqueda");

List<Libro> lista = null;
if (tipobusqueda != null && textobusqueda != null) {
	if (tipobusqueda.equalsIgnoreCase("titulo")) {
		lista = repo.buscarPorTitulo(textobusqueda);
	} else if (tipobusqueda.equalsIgnoreCase("autor")) {
		lista = repo.buscarPorAutor(textobusqueda);
	} else {

	}
} else {
	lista = repo.buscarTodos();

}
%>
<body>
	<form method="get">
		<select name="tipobusqueda">
			<option value="titulo">Título</option>
			<option value="autor">Autor</option>
		</select> Buscador: <input type="text" name="textobusqueda" /> <input
			type="submit" value="buscar" />
	</form>


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