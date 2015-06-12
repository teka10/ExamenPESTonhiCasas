<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/Banco/altaTarjeta1" />
                Alta Tarjeta</li>                      
            <li><a href="${pageContext.request.contextPath}/Banco/ampliarDisponible1" />
                Ampliar el cupo diponible</li>
            <li>Bloquear Tarjeta</li>
            <li><a href="${pageContext.request.contextPath}/Banco/pago1" />
                Pago con Tarjeta</li>
        </ul>
    </nav>
</body>
</html>