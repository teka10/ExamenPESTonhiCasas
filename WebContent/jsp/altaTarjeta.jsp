<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/Templates/header.jsp" %>
<h2>ALTA DE TARJETA NUEVA</h2>
    <label class="error"><%=request.getAttribute("mensaje") %></label>
    <form action="${pageContext.request.contextPath}/Banco/altaTarjeta2" method="post" enctype="text/html" name="form1">
        <label>Número de tarjeta</label>
        <input type="text" name="numero" required/>
        <label>Cupo máximo</label>
        <input type="text" name="cupoMaximo" required/>
        <label>Cupo Disponible</label>
        <input type="text" name="cupoDisponible" required/>
        <br>
        <br>
        <input type="radio" name="tipo" value="Visa" checked/>Visa
        <br>
        <input type="radio" name="tipo" value="MasterCard" />Master Card
        <label>Número de comprobación</label>
        <input type="text" name="numeroComprobacion" required/>
        <label>Contraseña</label>
        <input type="password" name="contrasenha" required/>
        <br>
        <input type="submit" name="submit" value="Enviar" class="boton"/>
        <input type="reset" name="reset" value="Borrar" class="boton"/>
    </form>
<%@ include file="/Templates/footer.jsp" %>