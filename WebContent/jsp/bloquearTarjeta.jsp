<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Templates/header.jsp" %>
<h2>BLOQUEO DE TARJETA</h2>
    <form action="${pageContext.request.contextPath}/Banco/bloquear2" method="post" enctype="text/html" name="form1">
        <label>Número de tarjeta</label>
        <input type="text" name="numero" required/>
        <br>
        <input type="submit" name="submit" value="Enviar" class="boton"/>
        <input type="reset" name="reset" value="Borrar" class="boton"/>
    </form>
<%@ include file="/Templates/footer.jsp" %>