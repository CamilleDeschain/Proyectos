<%@ page contentType="text/html; charset=iso-8859-1" language="java"
	errorPage="error.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=iso-8859-1" />
<title>ETC</title>
<form name="form" action="ServletJSON" method="post">
	<label>Nombre:</label> 
	<input type="text" name="nombre">
	<br/>
	<label>Apellido:</label>
	 <input type="text" name="apellido">
	 <br/>
	<label>Edad:</label>
	 <input type="number" name="edad">
	 <br/>
	<label>Sexo:</label>  
	<input type="text" name="sexo">
	<br/>
	<label>dedicado:</label> 
	<input type="text" name="dedicado">
	<br/>
	
	<label>numero1:</label> 
	<input type="number" name="uno">
	<br/>
	<label>numero2:</label> 
	<input type="number" name="dos">
	<br/>
	<button  type="submit" onclick="sub()">Prueba</button>
</form>

</body>
</html>