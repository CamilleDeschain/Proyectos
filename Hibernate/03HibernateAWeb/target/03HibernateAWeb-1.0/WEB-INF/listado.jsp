<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado</h1>
        <table>
            <caption>Listado pelis</caption>
            <tr>
                <th>id pelis</th>
                <th>nombre</th>
                <th>fecha</th>
                <th>genero</th>
                <th>calificacion</th>
            </tr>
            <c:forEach var="pelicula" items="${peliculas}">
                <tr>
                    <td>${pelicula.idPelicula}</td>
                    <td>${pelicula.nombre}</td>
                    <td>${pelicula.fechaestreno}</td>
                    <td>${pelicula.genero}</td>
                    <td>${pelicula.calificacion}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
