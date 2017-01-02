<%@page import="pe.com.paxtravel.bean.ClienteBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="pe.gob.sunat.framework.spring.util.conversion.SojoUtil"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hola Mundo Spring</title>
	
    <script src="/a/resources/js/jquery/1.11.2/jquery.min.js"></script>
    <script src="/a/resources/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<!-- estilos -->	
	<link href="/a/resources/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
	<link href="/a/resources/bootstrap/3.3.2/css/bootstrap-theme.min.css" rel="stylesheet"/>
	
	<script type="text/javascript">
	
		
		$(document).ready(function(){
	        $.ajaxSetup({
	            scriptCharset: "utf-8",
	            contentType: "application/json; charset=utf-8"
	        });
	        jQuery.support.cors = true;

	        $("#btnPopupAceptarParamMin").on("click",function(){
	        	if (isEmpty('#txtNombres', '')) $('#txtNombres').focus();
	        	if (!isEmptySelect('#tipoUsuario', '')) $('#tipoUsuario').focus();
	        	$( '#divModalPopupParamMin' ).modal( 'hide' );
	        });
	        
	        $("#btnImprimirEmpleado").on("click", function(){
	        	window.print();
	        })
	        
		});

		
	</script>
	<style>
		.opciones:hover{
			cursor:pointer;
			background-color: #1e5799;
			font-color: red;
		}
	</style>
</head>

<body>
	<div id="container">
        <div class="col-sm-12" id="divConsForm" style="width:50%; margin:120px 0px 0px 250px;">
        
        	<div class="panel panel-primary">
		
				<div class="panel-heading">
                    <h3 class="panel-title" align="center">PAX TRAVEL INTENATIONAL</h3>
                </div>
                
                <div class="panel-body">
                	<div class="row">
                		<div class="col-sm-12" style="padding-left:150px;">
       						<div class="panel panel-primary opciones" style="width:200px; height:80px; text-align:center; padding-top: 27px; margin-right: 100px; float:left">
								<a href="listarInseminacion"> Proceso Inseminacion<a/>
       						</div>
							
							<div class="panel panel-primary opciones" style="width:200px; height:80px; text-align:center; padding-top:27px; margin-right: 100px; float:left">
								<a href="listarDiagnostico"> Proceso Diagn&oacute;stico de Preñez
								<a/>
       						</div>
							
							<div class="panel panel-primary opciones" style="width:200px; height:80px; text-align:center; padding-top:27px; margin-right: 100px; float:left">
								<a href="listarInseminacion"> Proceso Parto
								<a/>
       						</div>
							<br />
							<div class="panel panel-primary opciones" style="width:200px; height:80px; text-align:center; padding-top:27px; margin-right: 100px; float:left">
								<a href="listarProduccion"> Proceso Producci&oacute;n
								<a/>
       						</div>
							
							<div class="panel panel-primary opciones" style="width:200px; height:80px; text-align:center; padding-top:27px; margin-right: 100px; float:left">
								<a href="listarInseminacion"> Proceso Seguimiento y Monitoreo de Rebaño
								<a/>
       						</div>
                		</div>
                	</div>
                </div>
            </div>
			
		</div>
	</div>
	
</body>

</html>