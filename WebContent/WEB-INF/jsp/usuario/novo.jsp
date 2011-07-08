<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Movy | Usu&aacute;rio [novo]</title>
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
			<legend>Usu&aacute;rio</legend>

			<form action="${pageContext.request.contextPath}/usuario" method="post">
				<input type="hidden" name="usuario.id" value="${usuario.id}"/>

				<label>Nome:</label>
				<input type="text" name="usuario.nome" value="${usuario.nome}"/><br/>

				<label>E-mail:</label>
				<input type="text" name="usuario.email" value="${usuario.email}"/><br/>

				<label>Senha:</label>
				<input type="text" name="usuario.senha" value="${usuario.senha}"/><br/>

				<input type="submit" value="salvar"/>
			</form>
		</fieldset>
	</body>
</html>