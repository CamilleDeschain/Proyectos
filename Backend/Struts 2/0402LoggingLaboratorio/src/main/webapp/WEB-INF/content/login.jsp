<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="formLogin"/></title>
    </head>
    <body>
        <h1><s:property value="formLogin"/></h1>
        <s:form>
            <s:textfield key="form.usuario" name="usuario"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.button" value="submit"/>
        </s:form>
        <br/>
        <div>
            <s:text name="form.values"/>:<br/>
            <s:property value="formUsuario"/>:
            <br/>
            <s:property value="usuario"/>
            <br/>
            <s:property value="formPassword"/>:
            <br/>
            <s:property value="password"/>
        </div>
    </body>
</html>
