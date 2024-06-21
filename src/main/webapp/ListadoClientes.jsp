<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@page import="java.util.*" %>
<%@page import="model.TblCliente" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Listado de Clientes</title>
	</head>
	<body bgcolor="#c5dec9">
		<h1 align="center">Listado de Clientes</h1>
		<h2 align="center">
			<a  href="RegistrarCliente.jsp" style="text-decoration:none">Registrar Cliente</a>
		</h2>
		<table align="center" border="2">
			<tr>
				<td>Codigo</td>
				<td>Nombre</td>
				<td>Apellido</td>
				<td>Dni</td>
				<td>Email</td>
				<td>Telefono</td>
				<td>Sexo</td>
				<td>Nacionalidad</td>
			</tr>
			<%-- <c:forEach var="clientes" items="${listadoClientes}">
				<tr>
					<td><c:out value="${clientes.idcliente }"></c:out></td>
					<td><c:out value="${clientes.nombre }"></c:out></td>
					<td><c:out value="${clientes.apellido }"></c:out></td>
					<td><c:out value="${clientes.dni }"></c:out></td>
					<td><c:out value="${clientes.email }"></c:out></td>
					<td><c:out value="${clientes.telf }"></c:out></td>
					<td><c:out value="${clientes.sexo }"></c:out></td>
					<td><c:out value="${clientes.nacionalidad }"></c:out></td>
				</tr>
			</c:forEach> --%>
			<% List<TblCliente> listadocliente=(List<TblCliente>)request.getAttribute("listadoClientes");
				if(listadocliente!=null){
					for(TblCliente lis:listadocliente){
					%>
						<tr>
							<td><%=lis.getIdcliente()%></td>
							<td><%=lis.getNombre()%></td>
							<td><%=lis.getApellido()%></td>
							<td><%=lis.getDni()%></td>
							<td><%=lis.getEmail()%></td>
							<td><%=lis.getTelf()%></td>
							<td><%=lis.getSexo()%></td>
							<td><%=lis.getNacionalidad()%></td>
						</tr>
						<%
					} //cerramos la condicion...
				} //cerramos el bucle
			%>
	</table>
	</body>
</html>