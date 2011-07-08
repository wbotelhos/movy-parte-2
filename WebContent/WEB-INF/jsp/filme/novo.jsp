<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Movy | Filme [novo]</title>
	</head>
</head>
	<body>
		<a href="${pageContext.request.contextPath}/">In&iacute;cio</a> |
		<a href="${pageContext.request.contextPath}/filme">Filmes</a> |
		<a href="${pageContext.request.contextPath}/filme/novo">Novo Filme</a> |
		<a href="${pageContext.request.contextPath}/artista">Artistas</a> |
		<a href="${pageContext.request.contextPath}/artista/novo">Novo Artista</a> |
		<a href="${pageContext.request.contextPath}/usuario">Usu&aacute;rios</a> |
		<a href="${pageContext.request.contextPath}/usuario/novo">Novo Usu&aacute;rio</a><br/><br/>

		<fieldset style="width: 390px;">
			<legend>Filme</legend>

			<form action="${pageContext.request.contextPath}/filme" method="post">
				<input type="hidden" name="filme.id" value="${filme.id}"/>

				<label>T&iacute;tulo:</label>
				<input type="text" name="filme.titulo" value="${filme.titulo}"/><br/>

				<label>T&iacute;tulo Original:</label>
				<input type="text" name="filme.tituloOriginal" value="${filme.tituloOriginal}"/><br/>

				<label>Ano:</label>
				<input type="text" name="filme.ano" value="${filme.ano}"/><br/>

				<label>G&ecirc;nero:</label>
				<input type="text" name="filme.genero" value="${filme.genero}"/><br/>

				<label>Sinopse:</label>
				<textarea rows="6" cols="45" name="filme.sinopse">${filme.sinopse}</textarea><br/><br/>

				<input type="submit" value="salvar"/>
			</form>
		</fieldset>
	</body>
</html>