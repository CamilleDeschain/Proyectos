<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Usuario</title>
    </head>
    <body>
        <h1>Agregar Usuario</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre">
            <br/>
            Apellido: <input type="text" name="apellido">
            <br/>
            <br/>
            Datos Domicilio
            <br/>
            Calle: <input type="text" name="calle">
            <br/>
            Numero: <input type="text" name="numero">
            <br/>
            Pais: <input type="text" name="pais">
            <br/>
            <br/>
            Datos Contacto
            <br/>
            Email: <input type="email" name="email">
            <br/>
            Telefono <input type="tel" name="telefono">
            <br/>
            <input type="submit" name="Agregar" value="Agregar">
        </form>
    </body>
</html>
