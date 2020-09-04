<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import= "java.util.List" %>
<%@ page import= "ec.epn.cuentos.modelo.Cuento" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
    rel="Stylesheet"
    type="text/css"
    href="css/bootstrap.min.css"
></link>
</head>
<body>

  
<table class="table table-hover">

  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Autor</th>
      <th scope="col">Tipo</th>
      <th scope="col">Genero</th>
    </tr>
  </thead>
  

 <tbody>
  	<%
  		List<Cuento> cuentos;
  	  		cuentos= (List<Cuento>)request.getAttribute("cuentos");
  	  		for (Cuento c:cuentos) {
  	%> 
  <tr>
      <th scope="row"><%= c.getId_cuentos()%></th>
      <td><%= c.getNombrecu() %></td>
      <td><%= c.getAutor() %></td>
       <td><%= c.getTipo() %></td>
      <td><%= c.getGenero() %></td>
    </tr>
 
<%}%>
 
   </tbody>

</table>

</body>
</html>