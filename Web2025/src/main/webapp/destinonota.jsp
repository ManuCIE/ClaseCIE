<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Resultado examen:
	<ol>
		<%
		String nota = request.getParameter("nota");
		int notaBuena = Integer.parseInt(nota);
		if (notaBuena >= 5)
			out.println("Devoraste madraza, has sacado un");
		else
			out.println("Ayunaste mi ciela, has sacado un");
		out.println(nota);
		%>
	</ol>
</body>
</html>