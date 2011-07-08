<head>
	<title>Movy | Artista [novo]</title>
</head>
<body>
	<fieldset style="width: 390px;">
		<legend>Artista</legend>

		<form action="${pageContext.request.contextPath}/artista" method="post">
			<input type="hidden" name="artista.id" value="${artista.id}"/>

			<label>Nome:</label>
			<input type="text" name="artista.nome" value="${artista.nome}"/><br/>

			<input type="submit" value="salvar"/>
		</form>
	</fieldset>
</body>