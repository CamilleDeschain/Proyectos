<%@ page contentType="text/html; charset=iso-8859-1" language="java"
	errorPage="error.jsp"%>
<script>
window.onload = function sub() {
	//obtener valores
	
	   uno = "<%= request.getAttribute("uno") %>";
       dos = "<%= request.getAttribute("dos") %>";
	
	  // Obtener la referencia del elemento body
	  var body = document.getElementsByTagName("body")[0];

	  // Crea un elemento <table> y un elemento <tbody>
	  var tabla   = document.createElement("table");
	  var tblBody = document.createElement("tbody");

	  //cantidad de fila
	  if(uno>dos){
		  var filasX=uno-dos;
		  var numY=dos;
	  }else{
		  var filasX=dos-uno;
		  var numY=uno;
	  }
	  var numeroAMultiplicar = numY;
	  // Crea las celdas
	  for (var i = 0; i <= filasX; i++) {
	    // Crea las hileras de la tabla
	    var hilera = document.createElement("tr");
	    var multnum=1
	    

	    for (var j = 0; j < 10; j++) {
	      // Crea un elemento <td> y un nodo de texto, haz que el nodo de
	      // texto sea el contenido de <td>, ubica el elemento <td> al final
	      // de la hilera de la tabla

	      var celda = document.createElement("td");
	      var z=multnum
	      var textoCelda = document.createTextNode(numeroAMultiplicar + "*" + (multnum++) +  "=" + (numeroAMultiplicar*z));

	      celda.appendChild(textoCelda);
	      hilera.appendChild(celda);
	    }
	    numeroAMultiplicar++
	    // agrega la hilera al final de la tabla (al final del elemento tblbody)
	    tblBody.appendChild(hilera);
	  }

	  // posiciona el <tbody> debajo del elemento <table>
	  tabla.appendChild(tblBody);
	  // appends <table> into <body>
	  body.appendChild(tabla);
	  // modifica el atributo "border" de la tabla y lo fija a "2";
	  tabla.setAttribute("border", "2");
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=iso-8859-1" />
<title>ETC</title>
<h1x|>Resultado: ${nombre}</h1>

</body>
</html>