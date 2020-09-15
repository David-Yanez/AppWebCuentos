<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page session = "true" %>
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

<script type="text/javascript" src="./CargaArchivo.js"></script>

<script type="text/javascript" src="./CargaImagen.js"></script>

</head>
<body>
    <%!public String obtieneAtributo(HttpServletRequest request, String nombre){
	String valor=(String) request.getAttribute(nombre);
	   if(valor==null){
		   valor="";
	   }
	return valor;
	}	
%>

 
    <%
    HttpSession sesion1 = request.getSession();
    String id=null;
    String nombre=null;
    String apellido=null;
    
    if(sesion1.getAttribute("id_usuario")!=null){
    	id=sesion1.getAttribute("id_usuario").toString();
    	nombre=sesion1.getAttribute("Nombre").toString();
    	apellido=sesion1.getAttribute("Apellido").toString();

    	out.print("Bienvenido "+nombre+" "+apellido);
    	out.print("<a href='Index.jsp?cerrar=true'><h5>Cerrar sesion</h5></a>");
    }else{
    	
    	out.print("<script>location.replace('Login.jsp');</script>");
    }
    
    
    
     
    %>



    <nav class="navbar navbar-expand-lg " style="background-color:#CEF5F2; ">
    
        <ul class="navbar-nav mr-auto">
           
            <li class="nav-item">
              <a class="nav-link" href="Index.jsp">Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Cuentos.jsp">Cuentos</a>
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
    <br>
    <h2 class="text-center">Registro de Cuentos y Fabulas</h2>
    

      
      
    
 <br>  
 
    <form method="post" action="RegistroCuento" class="was-validated" name="formu" enctype="multipart/form-data">
   <div class="row">
      
       
       <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4" required>
         
      <select class="custom-select mr-sm-2" name="tipo" required>
        <option value="">Tipo de historia</option>
        <option  value="Cuento">Cuento</option>
        <option  value="Fabula">Fabula</option>
      </select>
        </div>   
      
      
  <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Nombre del Cuento: </span>
      </div>
          <input type="text" class="form-control" name="nombreCu"  aria-label="Default" aria-describedby="inputGroup-sizing-default" class="form-control is-invalid" required>
      
      </div> 
 
    </div>
    
    <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Autor: </span>
      </div>
          <input type="text" class="form-control" name="autor"  aria-label="Default" aria-describedby="inputGroup-sizing-default" required>
      </div> 
    
    </div>
    
       <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4"  >
         
      <select class="custom-select mr-sm-2" name="genero"  required>
      <option value="">Genero</option>     
        <option value="Clasico">Clasico</option>
        <option value="Misterio">Misterio</option>
        <option value="Terror">Terror</option>
        <option value="Aventura">Aventura</option>
      </select required>
       </div >   
    
    
     <div class=" col-xs-12 col-sm-6 col-md-8 col-lg-8">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Descripcion: </span>
      </div>
        <textarea class="form-control" name="descripcion"  aria-label="Default" aria-describedby="inputGroup-sizing-default" required></textarea>
   <br>
   <br>
    </div> 
    
    </div>
    
      <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
     <div class="custom-file mb-3">
    <input type="file" name="archivo" onchange="cargarArchivo(this)" class="custom-file-input" id="validatedCustomFile"  required/>
    <label class="custom-file-label" for="validatedCustomFile">Carga el archivo ...</label>
    <div class="invalid-feedback">Falta cargar un Archivo</div>
  </div>
    </div>  
    
       <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
     <div class="custom-file mb-3">
    <input type="file" name="imagen" onchange="cargarImagen(this)" class="custom-file-input" id="validatedCustomFile"  required/>
    <label class="custom-file-label" for="validatedCustomFile">Cargar la imagen ...</label>
    <div class="invalid-feedback">Falta cargar la imagen</div>
  </div>
    </div> 
    
   
    
     <div class="input-group mb-3">  
      <div class="input-group-prepend">  
        <span class="input-group-text"  id="inputGroup-sizing-default">Id_Usuario: </span>

      </div>  
      <input type="text" class="form-control" name="id_usuario"  aria-label="Default" aria-describedby="inputGroup-sizing-default" required>
      </div>   

      </div>

      <input type="text" class="form-control" name="id_usuario" value= <%=id %> aria-label="Default" aria-describedby="inputGroup-sizing-default">

    </div> 

    
    <input type="hidden" name="nombre" value=""/>
    <input type="hidden" name="nombre2" value=""/>
    
    
     <button class="btn btn-primary mx-auto" name="guardar" type="submit" >Guardar</button>
 
   
   
    </div>
       
     </form>
     
    
     
     <div>      
		 <p style="color:red"><%= obtieneAtributo(request,"valError") %></p>
</div>
     
  
    </div>
    






</body>
</html>