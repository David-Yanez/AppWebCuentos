<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page session = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CuentaWeb</title>

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
    String sexo=null;
    String fecha=null;
    String correo=null;

    
	    if(sesion1.getAttribute("id_usuario")!=null&&
	    		sesion1.getAttribute("Nombre")!=null&&
	    		sesion1.getAttribute("Apellido")!=null&&
	    		sesion1.getAttribute("Sexo")!=null&&
	    		sesion1.getAttribute("Fecha")!=null&&
	    		sesion1.getAttribute("Correo")!=null){
	    	
	    	id=sesion1.getAttribute("id_usuario").toString();
	    	nombre=sesion1.getAttribute("Nombre").toString();
	    	apellido=sesion1.getAttribute("Apellido").toString();
	    	sexo=sesion1.getAttribute("Sexo").toString();
	    	fecha=sesion1.getAttribute("Fecha").toString();
	    	correo=sesion1.getAttribute("Correo").toString();


    	out.print("<a href='EditarUsuario.jsp?id="+id+"&nombre="+nombre+"&apellido="+apellido+"&sexo="+sexo+"&fecha="+fecha+"&correo="+correo+"&password= '><h5>Bienvenido "+nombre+" "+apellido+"</h5></a>");
    	out.print("<a href='Login.jsp?cerrar=true'><h5>Cerrar sesion</h5></a>");
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
        <option value="Misterio">Comedia</option>
        <option value="Terror">Misterio</option>
        <option value="Aventura">Ilustrados</option>
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
      <input type="text" class="form-control" name="id_usuario" value=<%=id %>  aria-label="Default" aria-describedby="inputGroup-sizing-default">
      </div>   

      </div>

    
    </div> 

    
    <input type="hidden" name="nombre" value=""/>
    <input type="hidden" name="nombre2" value=""/>
    
     <button class="btn btn-primary mx-auto" name="guardar" type="submit" >Guardar</button>
 
        </form>
   
    </div>
       

     
     <div>      
		 <p style="color:red"><%= obtieneAtributo(request,"valError") %></p>
</div>
     
  
    </div>
    






</body>
</html>