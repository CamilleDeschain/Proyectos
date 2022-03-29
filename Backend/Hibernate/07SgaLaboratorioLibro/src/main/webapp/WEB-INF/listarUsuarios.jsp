<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Usuarios</title>
    </head>
    <body>

        <table border="1">
            <caption>Listar Usuarios</caption>
            <br/>
            <a href="${pageContext.request.contextPath}/ServletRedir">Agregar</a>
            <tr>
                <th>Usuario id</th>
                <th>Nombre</th>    
                <th>Domicilio</th>
                <th>Email</th>    
                <th>Telefono</th>
            </tr>
            <c:forEach var="usuario" items="${usuarios}">
                <tr>
                    <th>
                        <a href="${pageContext.request.contextPath}/ServletModif?idUsuario=${usuario.idUsuario}">${usuario.idUsuario}</a>
                    </th>
                    <th>${usuario.nombre} ${usuario.apellido}</th>    
                    <th>${usuario.domicilio.calle} ${usuario.domicilio.noCalle} ${usuario.domicilio.pais}</th>
                    <th>${usuario.contacto.email}</th>    
                    <th>${usuario.contacto.telefono}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
