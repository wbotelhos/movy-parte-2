<head>
	<title>Movy | Artista [novo]</title>
</head>
<body>
	<fieldset style="width: 390px;">
		<legend>Artista</legend>

		<form action="${pageContext.request.contextPath}/artista" method="post">
			<input type="hidden" name="artista.id" value="${artista.id}"/>

			<label>Nome:</label>
			<input type="text" name="artista.nome" value="${artista.nome}"/><br/><br/>

			<label>Sexo:</label>
			<select name="artista.sexo">
			    <option value="" selected="selected">--selecione--</option>
			    <c:forEach items="${tipoSexoList}" var="sexo">
			        <option value="${sexo}"
			            <c:if test="${artista.sexo eq sexo}">selected="selected"</c:if>
			        >${sexo.label}</option>
			    </c:forEach>
			</select><br/><br/>

			<label>Nascimento:</label>
			<input type="text" name="artista.nascimento" value="${artista.nascimento}"/><br/><br/>

			<input type="submit" value="salvar"/>
		</form>
	</fieldset>
</body>