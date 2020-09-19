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
  <link
    rel="Stylesheet"
    type="text/css"
    href="css/estilos.css"
></link>

</head>
<body>


 <nav class="navbar navbar-expand-lg " style="background-color:#CEF5F2; ">
    
        <ul class="navbar-nav mr-auto">
           
            <li class="nav-item">
              <a class="nav-link" href="Index.jsp">Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="ListarCuentos">Cuentos</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="Fabulas.jsp">Fábulas</a>
            </li>
                <li class="nav-item">
              <a class="nav-link" href="Descargas.jsp">Descargas</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="ListarRegis">Registrar Cuento</a>
            </li>
          
             
          </ul>
                   <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
          </form>
                 <li class="navbar-nav nav-item  my-2 my-lg-0">
                <a class="nav-link" href="Login.jsp">Iniciar Sesión</a>
              </li> 
              <li class="navbar-nav nav-item my-2 my-lg-0">
                <a class="nav-link" href="Registrar.jsp">Registrar</a>
              </li>
   
        
       
    </nav>
    <div class="container-fluid">
    
    <h4 class="text-center bg-success"><a  class="text-white ">Cuentos Clasicos Infantiles</a></h1>
       
       
          <div class="row">
          
            	<%
  		List<Object[]> cuentos;
  	  		cuentos= (List<Object[]>)request.getAttribute("cuentos");
  	  		for (Object[] c:cuentos) {
  	  	//		 int id = new Integer(c[0]);
  	%> 
          
          
          
          
          
                  <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
  
         
             <p class="text-center">
        <img  src="<%= c[1] %>" height="200px" width="200px" alt="<%= c[0] %>" title="<%= c[0] %>">
       </p>
          <a href="<%= c[2] %>" title=”<%= c[0] %>”>
         <h5 class="text-center"><%= c[0] %></h5></a>
         
         
         
          <p style="color: #9002F8;" class="text-justify"><b><%= c[3] %></b></p>
         
         <br>
         </div>
         
      
         
         <%}%>
         
         
         
          
          </div>
       





</body>
</html>