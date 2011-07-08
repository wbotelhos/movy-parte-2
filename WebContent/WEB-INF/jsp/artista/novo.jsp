<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Movy | Artista [novo]</title>
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
			<legend>Artista</legend>

			<form action="${pageContext.request.contextPath}/artista" method="post">
				<input type="hidden" name="artista.id" value="${artista.id}"/>

				<label>Nome:</label>
				<input type="text" name="artista.nome" value="${artista.nome}"/><br/>

				<input type="submit" value="salvar"/>
			</form>
		</fieldset>
	</body>
</html>