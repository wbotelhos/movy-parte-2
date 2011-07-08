<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Movy | Artista [listagem]</title>
</head>
<body>
	<c:forEach items="${artistaList}" var="artista">
		<h2>${artista.nome}</h2>

		<form action="${pageContext.request.contextPath}/artista/${artista.id}" method="get">
			<input type="submit" value="exibir"/>
		</form>

		<form action="${pageContext.request.contextPath}/artista/${artista.id}/editar" method="get">
			<input type="submit" value="editar"/>
		</form>

		<form action="${pageContext.request.contextPath}/artista/${artista.id}" method="post">
			<input type="hidden" name="_method" value="delete"/>

			<input type="submit" value="remover"/>
		</form>
	</c:forEach>
</body>