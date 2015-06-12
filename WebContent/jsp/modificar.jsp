<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1><%=request.getAttribute("titulo") %></h1>
    <form action="${pageContext.request.contextPath}/Banco/ampliarDisponible3" method="post" enctype="text/html" name="form1">
        <label>Número de tarjeta</label>
        <input type="text" name= "numero" value="<%=request.getAttribute("numero") %>" />
        <label>Cupo disponible actual</label>
        <input type="text" value="<%=request.getAttribute("cupoDisponible") %>" />
        <label>Nuevo cupo disponible</label>
        <input type="text" name="disponible" value="0" />
        
        <input type="submit" name="submit" value="Enviar" />
        <input type="reset" name="reset" value="Borrar" />
    </form>
    <h1><%=request.getAttribute("titulo") %></h1>
    <h1><%=request.getAttribute("accion") %></h1>
    <h1><%=request.getAttribute("cupoDisponible") %></h1>
</body>
</html>