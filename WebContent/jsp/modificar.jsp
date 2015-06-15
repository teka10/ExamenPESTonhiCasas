<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Templates/header.jsp" %>
    <h2>AMPLIAR DISPONIBLE</h2>
    <form action="${pageContext.request.contextPath}/Banco/ampliarDisponible3" method="post" enctype="text/html" name="form1">
        <label>Número de tarjeta</label>
        <input type="text" name= "numero" value="<%=request.getAttribute("numero") %>" />
        <label>Cupo disponible actual</label>
        <input type="text" value="<%=request.getAttribute("cupoDisponible") %>" />
        <label>Nuevo cupo disponible</label>
        <input type="text" name="disponible" value="0" />
        <br>
        <input type="submit" name="submit" value="Enviar" class="boton"/>
        <input type="reset" name="reset" value="Borrar" class="boton"/>
    </form>
<%@ include file="/Templates/footer.jsp" %>