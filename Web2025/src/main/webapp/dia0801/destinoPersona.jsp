<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.time.LocalDate"%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b>Datos Persona</b>
	<%
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String fechaTexto = request.getParameter("fecha");
	LocalDate currentDate = LocalDate.now();
	String lenguaje = request.getParameter("lenguaje");
	String[] dispositivo = request.getParameterValues("disp");
	String nuevoTexto = request.getParameter("nuevo");
	int nivel = Integer.parseInt(request.getParameter("nivel"));
	boolean nuevo = Boolean.parseBoolean(nuevoTexto);
	int currentYear = currentDate.getYear();
	Calendar calendario = Calendar.getInstance();
	DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
	Date fecha = formateador.parse(fechaTexto);
	DateFormat nuevoFormateador = new SimpleDateFormat("dd/MM/YYYY E");
	calendario.setTime(fecha);
	int mesBien = calendario.get(Calendar.MONTH) + 1;
	%>
	<p>
		Nombre Completo:
		<%=nombre + " " + apellidos + "."%></p>
	<p>
	<p>
		Fecha Nacimiento:
		<%=calendario.getTime() + "."%></p>
	<p>
		Formato Alt.:
		<%=(nuevoFormateador.format(fecha)) + "."%></p>
	<p>
		Año:
		<%=calendario.get(Calendar.YEAR) + "."%>

		Mes:
		<%=mesBien + "."%>

		Día:
		<%=calendario.get(Calendar.DAY_OF_MONTH) + "."%></p>
	<p>
		Edad:
		<%=currentYear - calendario.get(Calendar.YEAR) + "."%></p>

	<p>
		Lenguaje Favorito:
		<%=lenguaje%></p>
	<p>
		Nivel:
		<%
	if (nivel == 1) {
		out.println("Básico");
	} else if (nivel == 2) {
		out.println("Intermedio");
	} else {
		out.println("Avanzado");
	}
	%>
	</p>
	<p>
		Dispositivo de preferencia:
		<%
	out.println("<u>");
	for (int i = 0; i < dispositivo.length; i++) {
		out.println("<li>" + dispositivo[i] + "</li>");
	}
	out.println("</ul>");
	%>
	</p>
	<p>
	<p>
		<%
		if (nuevo)
			out.println("Nueva incorporación: Sí");
		else
			out.println("");
		%>
	</p>

</body>
</html>