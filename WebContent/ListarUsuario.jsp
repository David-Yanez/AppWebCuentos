<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import= "java.util.List" %>
<%@ page import= "ec.epn.cuentos.modelo.Usuario" %>   
<%@page session = "true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista usuarios</title>

<link
    rel="Stylesheet"
    type="text/css"
    href="css/bootstrap.min.css"
></link>
  <link
    rel="Stylesheet"
    type="text/css"
    href="css/estilos.css"
></link>

</head>
<body>

 <%
    HttpSession sesion1 = request.getSession();
    String nombre=null;

	    if(sesion1.getAttribute("Nombre")!=null){

	    	nombre=sesion1.getAttribute("Nombre").toString();
	    	

    	out.print("<a>Bienvenido "+nombre+"</a>");
    	out.print("<a href='Login.jsp?cerrar=true'><h5>Cerrar sesion</h5></a>");
    }else{
    	
    	out.print("<script>location.replace('Login.jsp');</script>");
    }
    
   
    %>


<br>
<br>
<br>
  
<table class="table table-hover">

  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">Sexo</th>
      <th scope="col">Fecha nacimiento</th>
      <th scope="col">Correo</th>
    </tr>
  </thead>
  

 <tbody>
 
 
  	<%
  		List<Object[]> usuarios;
  	  		usuarios= (List<Object[]>)request.getAttribute("usuarios");
  	  		for (Object[] c:usuarios) {

  	  			if(c[0].equals(16)){
  	  				
  	  			}else{
  	%> 
  <tr>
      <th scope="row"><%= c[0]%></th>
      <td><a href= "EditarUsuario.jsp?id=<%= c[0]%>&nombre=<%= c[1]%>&apellido=<%= c[2]%>&sexo=<%= c[3]%>&fecha=<%= c[4]%>&correo=<%= c[5]%>&password=<%= c[6]%>"><%= c[1] %></a></td>
      <td><%= c[2] %></td>
       <td><%= c[3] %></td>
      <td><%= c[4] %></td>
      <td><%= c[5] %></td>

     
    </tr>
 
<%}}%>
 
   </tbody>

</table>

</body>
</html>