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

LibroRepository repo = new LibroRepositoryMemoria();
String titulo = request.getParameter("titulo");
String autor = request.getParameter("autor");
List<Libro> lista = null;
if (titulo != null) {
	lista = repo.buscarPorTitulo(titulo);
} else if (autor != null) {
	lista = repo.buscarPorAutor(autor);
} else {
	lista = repo.buscarTodos();
}
%>
<body>

	<form method="get">
		Buscador: <input type="text" name="buscador" />
		<p>
			<input type="submit" value="buscar titulo" /> <input type="submit"
				value="buscar autor" />
		</p>
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