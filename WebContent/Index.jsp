<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<style type="text/css">
  .boton_1{
    text-decoration: none;
    padding: 3px;
    padding-left: 10px;
    padding-right: 10px;
    font-family: helvetica;
    font-weight: 300;
    font-size: 25px;
    font-style: italic;
    color: #006505;
    background-color: white;
    border-radius: 15px;
    border: 3px double #006505;
  }
  .boton_1:hover{
    opacity: 0.6;
    text-decoration: none;
    
  }
</style>
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

<%if (request.getParameter("cerrar")!=null){
				
			session.invalidate();	
				
			}
%>


    <nav class="navbar navbar-expand-lg " style="background-color:#CEF5F2; "  >
    
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
    

    <div>  

    
      <div class="slider">
        <div><img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/cuentosInfantiles.jpg" height="400px" width="2000px" alt="hojas" title="hojas"></div>
        <div><img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/Cuentos2.png" height="400px" width="2000px" alt="cielo" title="cielo"></div>
        <div><img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/Cuentos3.png" height="400px" width="2000px" alt="rojo" title="rojo"></div>
      </div>
    
    </div>
    
    
   
    <div class="row">
    
    <div class=" col-xs-12 col-sm-6 col-md-9 col-lg-9">
    
    <h3 class="text-center" style="color: #ED02F8;"><b>CUENTOS INFANTILES</b></h3>
    
    <p style="color: #9002F8;">Cuentos infantiles llenos de historias maravillosas con los
     cuales enseñamos a nuestros niños su relación con la vida.</p>
     
     <p style="color: #9002F8;">
    <b> Este recopilatorio  está pensado y desarrollado centrándose
únicamente en el público infantil, por lo que hemos revisado,  
y preparado todas las historias que encontrarás aquí para que resulte asequible y
 sencillo de entender en los más pequeños y a su vez mantenga la atención y la intriga 
 en los que son algo más mayores, incentivando así el hábito de la lectura desde la infancia.</b>
     </p>
    <h5 class="text-center" style="color: #ED02F8;"><b>El placer y la importancia de la lectura</b></h5>
    
    <p style="color: #9002F8;" class="text-justify"><b>Inculcar a los más pequeños el placer de la lectura desde edades tempranas posee una 
    gran importancia si se desean arraigar buenos hábitos. Enseñarles que pueden viajar a mil
     mundos, descubrir increíbles lugares, simpatizar con personajes, etc. Todo sin moverse del 
     sitio. La lectura fomenta la curiosidad e imaginación de los niños, volviéndolos personas 
     más activas intelectualmente. Para iniciarse en este fantástico mundo, los cuentos clásicos 
     para niños presentados por Mundo Primaria suponen un perfecto primer paso. Si tus hijos son 
     algo mayores, no te preocupes, también ponemos a tu disposición fábulas para niños, 
adaptadas a sus edades. Disfruta de los relatos recogidos en los cuentos clásicos para niños,
 aquellos que te enseñaron importantes lecciones y, ahora, podrán ayudar también a tus pequeños.</b></p>
    
    
       <h4 class="text-center bg-success"><a  class="text-white ">Mejores Cuentos</a></h1>
       
       
        <div class="row">
        
        <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/cenicienta.jpg" height="200px" width="200px" alt="Cenicienta" title="Cenicienta">
       </p>
       <a href="ListarCuentos" title=”Cenicienta”>
         <h5 class="text-center">Cenicienta</h5></a>
         
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/elgatoconbotas.jpg" height="200px" width="200px" alt="elgatoconbotas" title="elgatoconbotas">
       </p>
       <a href="ListarCuentos" title=”Elgatoconbotas”>
         <h5 class="text-center">El gato con botas</h5></a>
         
         </div>
         
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/bambi.jpg" height="200px" width="200px" alt="bambi" title="bambi">
       </p>
       <a href="ListarCuentos" title=”Bambi”>
         <h5 class="text-center">Bambi</h5></a>
         
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/laratitapresumida.jpg" height="200px" width="200px" alt="laratitapresumida" title="laratitapresumida">
       </p>
       <a href="ListarCuentos" title=”Laratitapresumida”>
         <h5 class="text-center">La ratita presumida</h5></a>
         
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/reyleon.jpg" height="200px" width="200px" alt="reyleon" title="reyleon">
       </p>
       <a href="ListarCuentos" title=”ElReyleon”>
         <h5 class="text-center">El Rey leon</h5></a>
         
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/101dalmatas.jpg" height="200px" width="200px" alt="101dalmatas" title="101dalmatas">
       </p>
       <a href="ListarCuentos" title=”101dalmatas”>
         <h5 class="text-center">101 dalmatas</h5></a>
         
         </div>
         
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
      <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/pinocho.jpg" height="200px" width="200px" alt="Pinocho" title="Pinocho">
       </p>
       <a href="ListarCuentos" title=”Pinocho”>
         <h5 class="text-center">Pinocho</h5></a>
         
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
           
                <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/Blancanieves.png" height="200px" width="200px" alt="Blanca Nieves" title="Blanca Nieves">
       </p>
       <a href="ListarCuentos" title=”BlancaNieves”>
         <h5 class="text-center">Blanca Nieves</h5></a>
           
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
                <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/los 3 cerditos.jpg" height="200px" width="200px" alt="Los 3 Cerditos" title="Los 3 Cerditos">
       </p>
       <a href="ListarCuentos" title=”Los3Cerditos”>
         <h5 class="text-center">Los 3 Cerditos</h5></a>
         
         </div>
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
         
         <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/CaperucitaRoja.jpg" height="200px" width="200px" alt="Caperucita Roja" title="Caperucita Roja">
       </p>
       <a href="ListarCuentos" title=”CaperucitaRoja”>
         <h5 class="text-center">Caperucita Roja</h5></a>
         
         </div>
         
           <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/aladin.jpg" height="200px" width="200px" alt="Aladin" title="Aladin">
               
       </p>
       <a href="ListarCuentos" title=”Aladin”>
         <h5 class="text-center">Aladin</h5> </a>
           
         </div>
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/abeto.jpg" height="200px" width="200px" alt="El Abeto" title="El Abeto">
               
       </p>
       <a href="ListarCuentos" title=”ElAbeto”>
         <h5 class="text-center">El Abeto</h5> </a>
           
         </div>
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/avaromercader.jpg " height="200px" width="200px" alt="El avaro mercader" title="El avaro mercader">
               
       </p>
       <a href="ListarCuentos" title=”Elavaromercader”>
         <h5 class="text-center">El avaro mercader</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/barbaazul.jpg " height="200px" width="200px" alt="Barba azul" title="Barba azul">
               
       </p>
       <a href="ListarCuentos" title=”Barbaazul”>
         <h5 class="text-center">Barba azul</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/elpatitofeo.jpg" height="200px" width="200px" alt="El patito feo" title="El patito feo">
               
       </p>
       <a href="ListarCuentos" title=”Elpatitofeo”>
         <h5 class="text-center">El patito feo</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/flautistadehamelin.jpg" height="200px" width="200px" alt="El flautista de Hamelin" title="El flautista de Hamelin">
               
       </p>
       <a href="ListarCuentos" title=”ElflautistadeHamelin”>
         <h5 class="text-center">El flautista de Hamelin</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/giganteegoista.jpg " height="200px" width="200px" alt="El gigante egoista" title="El gigante egoista">
               
       </p>
       <a href="ListarCuentos" title=”Elgiganteegoista”>
         <h5 class="text-center">El gigante egoista</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/juansinmiedo.jpg" height="200px" width="200px" alt="Juan sin miedo" title="Juan sin miedo">
               
       </p>
       <a href="ListarCuentos" title=”Juansinmiedo”>
         <h5 class="text-center">Juan sin miedo</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/libroselva.jpg" height="200px" width="200px" alt="El libro de la selva" title="El libro de la selva">
               
       </p>
       <a href="ListarCuentos" title=”Ellibrodelaselva”>
         <h5 class="text-center">El libro de la selva</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/loboysietecabritas.jpg" height="200px" width="200px" alt="El lobo y los siete cabritos" title="El lobo y los siete cabritos">
               
       </p>
       <a href="ListarCuentos" title=”Elloboylossietecabritos”>
         <h5 class="text-center">El lobo y los siete cabritos</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/magodeoz.jpg" height="200px" width="200px" alt="El mago de oz" title="El mago de oz">
               
       </p>
       <a href="ListarCuentos" title=”Elmagodeoz”>
         <h5 class="text-center">El mago de oz</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/pulgarcito.gif " height="200px" width="200px" alt="Pulgarcito" title="Pulgarcito">
               
       </p>
       <a href="ListarCuentos" title=”Pulgarcito”>
         <h5 class="text-center">Pulgarcito</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/ruisenorylarosa.jpg " height="200px" width="200px" alt="El ruiseñor y la rosa" title="El ruiseñor y la rosa">
               
       </p>
       <a href="ListarCuentos" title=”Elruiseñorylarosa”>
         <h5 class="text-center">El ruiseñor y la rosa</h5> </a>
           
         </div>
         
         <div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
          
           
             <p class="text-center">
       <img  src="https://epnecuador-my.sharepoint.com/personal/luis_yanez_epn_edu_ec/Documents/2020-A%20EPN/Libres/Imagenes/sastrecillovaliente.jpg " height="200px" width="200px" alt="El sastrecillo valiente" title="El sastrecillo valiente">
               
       </p>
       <a href="ListarCuentos" title=”Elsastrecillovaliente”>
       <h5	class="text-center">El sastrecillo valiente</h5></a>
         
           
         </div>
         
         
        
        </div>
       
       
       
     </div>
     <div class=" col-xs-12 col-sm-6 col-md-3 col-lg-3">
     
     <a href="ListarCuentos" class="boton_1"> Clasicos<br/></a>
      </b>
       <a href="ListarCuentos" class="boton_1"> <b>Comedia</b><br/></a>
     </b>
    <a href="ListarCuentos" class="boton_1"> Misterio   <br/></a>
    </b>
    <a href="ListarCuentos" class="boton_1"> Ilustrados<br/></a>
    
    
        </div>

     </div>
    
    </div>

</body>
<footer class="container-fluid text-center bg-dark text-white" style="bottom: 0; ">
    <p> EPN 2020</p>
</footer>
</html>