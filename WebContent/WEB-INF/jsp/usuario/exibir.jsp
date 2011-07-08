<head>
	<title>Movy | Usu&aacute;rio [exibir]</title>
</head>
<body>
	<h2>${usuario.nome}</h2>

	(${usuario.email} - ${usuario.senha})<br/>

	<form action="${pageContext.request.contextPath}/usuario/${usuario.id}" method="get">
		<input type="submit" value="exibir"/>
	</form>

	<form action="${pageContext.request.contextPath}/usuario/${usuario.id}/editar" method="get">
		<input type="submit" value="editar"/>
	</form>

	<form action="${pageContext.request.contextPath}/usuario/${usuario.id}" method="post">
		<input type="hidden" name="_method" value="delete"/>

		<input type="submit" value="remover"/>
	</form>
</body>