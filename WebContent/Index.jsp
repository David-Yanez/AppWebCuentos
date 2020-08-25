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

<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<script src="js/temas.js"></script>
<script>
  $(document).ready(function(){
    $('.slider').bxSlider();
  });
</script>

</head>
<body>


    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #2F3A8D;">
    
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
    
    <div>  
    
      <div class="slider">
        <div><img  src="img/cuentosInfantiles.jpg" height="300px" width="1500px" alt="hojas" title="hojas"></div>
        <div><img  src="img/Cuentos2.png" height="300px" width="1500px" alt="cielo" title="cielo"></div>
        <div><img  src="img/Cuentos3.png" height="300px" width="1500px" alt="rojo" title="rojo"></div>
      </div>
    
    </div>
    
    
   
    <div class="row">
    
    <div class=" col-xs-12 col-sm-6 col-md-9 col-lg-9">
    
    <h3 class="text-center">Cuentos infantiles</h3>
    
    <p>Cuentos infantiles llenos de historias maravillosas con los
     cuales enseñamos a nuestros niños su relación con la vida.</p>
     
     <p>
     Este recopilatorio  está pensado y desarrollado centrándose
únicamente en el público infantil, por lo que hemos revisado,  
y preparado todas las historias que encontrarás aquí para que resulte asequible y
 sencillo de entender en los más pequeños y a su vez mantenga la atención y la intriga 
 en los que son algo más mayores, incentivando así el hábito de la lectura desde la infancia.
     </p>
    <h5>El placer e importancia de la lectura</h5>
    
    <p class="text-justify">Inculcar a los más pequeños el placer de la lectura desde edades tempranas posee una 
    gran importancia si se desean arraigar buenos hábitos. Enseñarles que pueden viajar a mil
     mundos, descubrir increíbles lugares, simpatizar con personajes, etc. Todo sin moverse del 
     sitio. La lectura fomenta la curiosidad e imaginación de los niños, volviéndolos personas 
     más activas intelectualmente. Para iniciarse en este fantástico mundo, los cuentos clásicos 
     para niños presentados por Mundo Primaria suponen un perfecto primer paso. Si tus hijos son 
     algo mayores, no te preocupes, también ponemos a tu disposición fábulas para niños, 
adaptadas a sus edades. Disfruta de los relatos recogidos en los cuentos clásicos para niños,
 aquellos que te enseñaron importantes lecciones y, ahora, podrán ayudar también a tus pequeños.</p>
    
    
       <h4 class="text-center bg-success"><a  class="text-white ">Mejores Cuentos</a></h1>
       
       
        <div class="row">
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="img/pinocho.jpg" height="200px" width="200px" alt="Pinocho" title="Pinocho">
       </p>
         <h5 class="text-center">Pinocho</h5>
         
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
           
                <p class="text-center">
       <img  src="img/Blancanieves.png" height="200px" width="200px" alt="Blanca Nieves" title="Blanca Nieves">
       </p>
         <h5 class="text-center">Blanca Nieves</h5>
           
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
                <p class="text-center">
       <img  src="img/3cerditos.jpg" height="200px" width="200px" alt="Los 3 Cerditos" title="Los 3 Cerditos">
       </p>
         <h5 class="text-center">Los 3 Cerditos</h5>
         
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
         <p class="text-center">
       <img  src="img/caperucitaRoja.jpg" height="200px" width="200px" alt="Caperucita Roja" title="Caperucita Roja">
       </p>
         <h5 class="text-center">Caperucita Roja</h5>
         
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="img/aladin.jpg" height="200px" width="200px" alt="Aladin" title="Aladin">
       </p>
         <h5 class="text-center">Aladin</h5> 
           
         </div>
        
        </div>
       
       
       
     </div>
     <div class=" col-xs-12 col-sm-6 col-md-3 col-lg-3">
     
      <h4>Clasicos</h4>
      <h4>Comedia</h4>
     <h4>Terror</h4>
        </div>

     </div>
    
    </div>

</body>
<footer class="container-fluid text-center bg-dark text-white" style="bottom: 0; ">
    <p> EPN 2020</p>
</footer>
</html>