<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Banco/altaTarjeta2" method="post" enctype="text/html" name="form1">
        <label>Número de tarjeta</label>
        <input type="text" name="numero" />
        <label>Cupo máximo</label>
        <input type="text" name="cupoMaximo" />
        <label>Cupo Disponible</label>
        <input type="text" name="cupoDisponible" />
        <label>Tipo (Visa/Master Card)</label>
        <input type="text" name="tipo" />
        <label>Número de comprobación</label>
        <input type="text" name="numeroComprobacion" />
        <label>Contraseña</label>
        <input type="text" name="contrasenha" />
        <label>Está bloqueada (Si=1, No=0)?</label>
        <input type="text" name="bloqueada" />
    
        <input type="submit" name="submit" value="Enviar" />
        <input type="reset" name="reset" value="Borrar" />
    </form>
</body>
</html>