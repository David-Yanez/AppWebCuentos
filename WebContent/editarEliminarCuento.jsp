<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="./EditarArchivo.js"></script>

<script type="text/javascript" src="./EditarImagen.js"></script>

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

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    
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
    <h2 class="text-center">Actualizacion  de Cuentos y Fabulas</h2>
    

      
      
    
 <br>  
 
    <form method="post" action="ActualizarCuento" class="was-validated" name="formu2" enctype="multipart/form-data">
   <div class="row">
      
       
       <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
      <select class="custom-select mr-sm-2" name="tipo" value="<%=obtieneAtributo(request, "valTipo")%>" required>
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
      <input type="text" class="form-control" name="nombreCu" value="<%=obtieneAtributo(request, "valNombreCu")%>" aria-label="Default" aria-describedby="inputGroup-sizing-default" class="form-control is-invalid" required>
    </div> 
 
    </div>
    
    <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Autor: </span>
      </div>
      <input type="text" class="form-control" name="autor" value="<%=obtieneAtributo(request, "valAutor")%>" aria-label="Default" aria-describedby="inputGroup-sizing-default" required>
    </div> 
    
    </div>
    
       <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
      <select class="custom-select mr-sm-2" name="genero" selected="true"  value="<%=obtieneAtributo(request, "valGenero")%>" required>
        <option value="">Genero</option>
        <option value="Clasico">Clasico</option>
        <option value="Misterio">Misterio</option>
        <option value="Terror">Terror</option>
        <option value="Aventura">Aventura</option>
      </select>
      </div>   
    
    
     <div class=" col-xs-12 col-sm-6 col-md-8 col-lg-8">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Descripcion: </span>
      </div>
     <textarea class="form-control" name="descripcion"  aria-label="Default" aria-describedby="inputGroup-sizing-default" required><%=obtieneAtributo(request, "valDescripcion")%></textarea>
    </div> 
    
    </div>
    

    <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
     <div class="custom-file mb-3">
    <input type="file" name="archivo" onchange="editarArchivo(this)" class="custom-file-input" id="validatedCustomFile"  />
    <label class="custom-file-label" for="validatedCustomFile">Carga el archivo ...</label>
    <div class="invalid-feedback">Falta cargar un Archivo</div>
  </div>
    </div>  
    
       <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
     <div class="custom-file mb-3">
    <input type="file" name="imagen" onchange="editarImagen(this)" class="custom-file-input" id="validatedCustomFile"  />
    <label class="custom-file-label" for="validatedCustomFile">Cargar la imagen ...</label>
    <div class="invalid-feedback">Falta cargar la imagen</div>
  </div>
  
       <input type="hidden" name="nombre" value=""/>
    <input type="hidden" name="nombre2" value=""/>
    </div> 




    
     <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text"  id="inputGroup-sizing-default">Id_Usuario: </span>
      </div>
      <input type="text" class="form-control" name="id_usuario" value="<%=obtieneAtributo(request, "valId_usuario")%>" aria-label="Default" aria-describedby="inputGroup-sizing-default">
    </div> 
    
        <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text"  id="inputGroup-sizing-default">Id_Cuento: </span>
      </div>
      <input type="text" class="form-control" name="id_cuentos" value="<%=obtieneAtributo(request, "valId_cuentos")%>" aria-label="Default" aria-describedby="inputGroup-sizing-default">
    </div> 
    
    

    
          <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">

     <button class="btn btn-primary" type="submit" >Actualizar</button>
   </div>
 
        <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
      <a class="btn btn-primary " href= "EliminarCuento?id_cuentos=<%=obtieneAtributo(request, "valId_cuentos")%>"> Eliminar </a>   
    </div>
   
       
     </form>
     
     

 
     
     
     </div>
    
    
   
     <div>      
		 <p style="color:red"><%= obtieneAtributo(request,"valError") %></p>
</div>
     
  
    </div>
    







</body>
</html>