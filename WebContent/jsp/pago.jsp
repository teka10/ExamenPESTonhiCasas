<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Banco/pago2" 
        method="post" enctype="text/html" name="form1">
        <label>Numero de tarjeta</label>
        <input type="text" name="numero" />
        <label>Password</label>
        <input type="text" name="contrasenha" />
        <label>Código de verificación</label>
        <input type="text" name="numeroComprobacion" />
        <label>Importe</label>
        <input type="text" name="importe" />
        
        <input type="submit" name="submit" value="Enviar" />
        <input type="reset" name="reset" value="Borrar" />
    </form>

</body>
</html>