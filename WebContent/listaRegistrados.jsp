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

<div>

<jsp:include page="RegiCuen.jsp"/>


</div>

<br>
<br>
<br>
  
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
  		List<Object[]> cuentos;
  	  		cuentos= (List<Object[]>)request.getAttribute("cuentos");
  	  		for (Object[] c:cuentos) {
  	%> 
  <tr>
      <th scope="row"><%= c[0]%></th>
      <td><%= c[3] %></td>
      <td><%= c[4] %></td>
       <td><%= c[1] %></td>
      <td><%= c[2] %></td>
     
    </tr>
 
<%}%>
 
   </tbody>

</table>

</body>
</html>