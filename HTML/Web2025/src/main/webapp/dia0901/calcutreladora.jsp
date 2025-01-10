<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b>Calculadora</b>
	<p>
		<%
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		double num = Double.parseDouble(request.getParameter("n1"));
		double num2 = Double.parseDouble(request.getParameter("n2"));
		String op = request.getParameter("operacion");
		double eq = 0;

		if (op.equals("+")) {
			eq = num + num2;
		} else if (op.equals("-")) {
			eq = num - num2;
		} else if (op.equals("*")) {
			eq = num * num2;
		} else
			eq = num / num2;
		%>
	</p>

	<table border=1>
		<tr>
		<td> Números</td><td>Resultado</td>
		<tr>
			<td><%=num + " " + op + " " + num2%></td>
			<td><b><%=" " + eq %></b></td>
	</table>




</body>
</html>