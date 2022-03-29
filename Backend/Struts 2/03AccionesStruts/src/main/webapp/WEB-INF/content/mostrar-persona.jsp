<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Personas Struts</h1>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit value="Enviar"/>
        </s:form>
        <div>
            nombre proporcionado: <s:property value="nombre"/>
        </div>
    </body>
</html>
