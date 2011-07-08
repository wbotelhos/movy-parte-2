<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><decorator:title default="Movy | A Movie Manager"/></title>

		<script type="text/javascript" src="<c:url value='/js/jquery-1.5.1.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/jquery-ui-1.8.11.js'/>"></script>
	</head>
	<body>
		<div id="topo"><jsp:include page="../../topo.jsp" /></div>
		<div id="menu"><jsp:include page="../../menu.jsp" /></div>

		<div id="conteudo">
			<c:if test="${not empty error}">${error}</c:if>
			<c:if test="${not empty message}">${message}</c:if>

			<decorator:body/>
		</div>

		<div id="rodape"><jsp:include page="../../rodape.jsp" /></div>
	</body>
</html>