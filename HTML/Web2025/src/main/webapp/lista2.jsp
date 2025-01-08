<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
		<%
		for (int i = 0; i < 1000; i++) {
		%>
		<li>
			<%
			out.println(i);
			%>
		</li>
		<%
		}
		%>
	</ol>
</body>
</html>