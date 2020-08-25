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

</head>
<body>


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
              <a class="nav-link" href="RegiCuen.jsp">Registrar Cuento</a>
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
   
   <div class="row">
      
        <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          <form>
      <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
        <option selected>Tipo de Archivo</option>
        <option value="1">Cuento</option>
        <option value="2">Fabula</option>
      </select>
      </div>
      
      
  <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
  <form>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Nombre del Cuento: </span>
      </div>
      <input type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
    </div> 
 
    </div>
    
    <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Autor: </span>
      </div>
      <input type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
    </div> 
    
    </div>
    
      <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
      <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
        <option selected>Genero</option>
        <option value="1">Clasico</option>
        <option value="2">Misterio</option>
        <option value="3">Terror</option>
        <option value="4">Aventura</option>
      </select>
      </div>
    
    
     <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
    
      <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text" id="inputGroup-sizing-default">Descripcion: </span>
      </div>
     <textarea class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default"></textarea>
    </div> 
    
    </div>
    
     <div class=" col-xs-12 col-sm-6 col-md-6 col-lg-6">
     <div class="custom-file mb-3">
    <input type="file" class="custom-file-input" id="validatedCustomFile" required>
    <label class="custom-file-label" for="validatedCustomFile">Elegir Archivo...</label>
    <div class="invalid-feedback">Example invalid custom file feedback</div>
  </div>
    </div>
    
   
    </div>
      <button class="btn btn-primary" type="submit">Guardar</button>
    
       </form>
    
    </div>

</body>
</html>