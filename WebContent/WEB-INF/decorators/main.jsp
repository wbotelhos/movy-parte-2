<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<html>
  <head>
    <title><decorator:title default="Movy | A Movie Manager"/></title>
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