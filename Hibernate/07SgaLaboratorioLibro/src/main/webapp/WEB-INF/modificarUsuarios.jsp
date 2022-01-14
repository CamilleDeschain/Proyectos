<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Usuario</title>
    </head>
    <body>
        <h1>Modificar Usuario</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletModif" method="post">
            
            <input type="hidden" name="idUsuario" value="${usuario.idUsuario}">
            
            Nombre: <input type="text" name="nombre" value="${usuario.nombre}">
            <br/>
            Apellido: <input type="text" name="apellido" value="${usuario.apellido}">
            <br/>
            <br/>
            Datos Domicilio
            <br/>
            Calle: <input type="text" name="calle" value="${usuario.domicilio.calle}">
            <br/>
            Numero: <input type="text" name="noCalle" value="${usuario.domicilio.noCalle}">
            <br/>
            Pais: <input type="text" name="pais" value="${usuario.domicilio.pais}">
            <br/>
            <br/>
            Datos Contacto
            <br/>
            Email: <input type="email" name="email" value="${usuario.contacto.email}">
            <br/>
            Telefono <input type="tel" name="telefono" value="${usuario.contacto.telefono}">
            <br/>
            <input type="submit" name="Modificar" value="Modificar">
            <input type="submit" name="Eliminar" value="Eliminar">
        </form>
    </body>
</html>
