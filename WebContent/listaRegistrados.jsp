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
	for (Cuento l:cuentos) {
		%> 
  <tr>
      <th scope="row"><%= l.getId_cuentos()%></th>
      <td><%= l.getNombreCU() %></td>
      <td><%= l.getAutor() %></td>
       <td><%= l.getTipo() %></td>
      <td><%= l.getGenero() %></td>
    </tr>
 
<%}%>
 
   </tbody>

</table>

</body>
</html>