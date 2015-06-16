<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Templates/header.jsp" %>
    <h2>PAGO CON TARJETA</h2>
    <label class="error"><%=request.getAttribute("mensaje") %></label>
    <form action="${pageContext.request.contextPath}/Banco/pago2" 
        method="post" enctype="text/html" name="form1">
        <label>Numero de tarjeta</label>
        <input type="text" name="numero" required/>
        <label>Password</label>
        <input type="password" name="contrasenha" required/>
        <label>Código de verificación</label>
        <input type="text" name="numeroComprobacion" required/>
        <label>Importe</label>
        <input type="text" name="importe" required/>
        <br>
        <input type="submit" name="submit" value="Enviar" class="boton"/>
        <input type="reset" name="reset" value="Borrar" class="boton"/>
    </form>
<%@ include file="/Templates/footer.jsp" %>