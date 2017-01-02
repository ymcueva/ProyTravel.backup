<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Hola Mundo Spring</title>
<!-- <script  src="http://localhost:8080/ProyectoGanadero/resources/js/jquery/1.11.2/jquery.min.js"></script> -->
<%-- <spring:url value="/resources/js/jquery/1.11.2/jquery.min.js" var="jquery" /> --%>
<%-- <script src="${jquery}"></script> --%>

</head>
<body>












<!-- 	<a href="Prueba">Llamando al servlet de PRUEBA</a><br /> -->
<!-- 	<a href="Prueba1">Llamando al servlet de PRUEBA1</a><br /> -->
	<a href="holaMundo" >obtener conexion por jdbc</a>
	<a href="listaCliente" >listar cliente por ibatis</a>
	
	<ul>
		<li> <a href="listaCliente" >LISTADO DE CLIENTES</a> </li>
		<li> <a href="listaEmpleado" >LISTADO DE EMPLEADOS</a> </li>
		<li> <a href="cargarRegistrarEmpleado" >REGISTRAR EMPLEADOS</a> </li>
	</ul>
	
<!-- 	<form name="frm" method="post" action="PruebaController"> -->
<!-- 		<input type="text" name="numero1" id="numero1" /> -->
<!-- 		<input type="submit" name="btnAccion" id="btnAccion" value="ENVIAR A PruebaFormController" /> -->
<!-- 	</form> -->	
</body>
</html>
