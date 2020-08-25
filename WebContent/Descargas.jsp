<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="Stylesheet" type="text/css" href="css/bootstrap.min.css"></link>

</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<ul class="navbar-nav mr-auto">

			<li class="nav-item"><a class="nav-link" href="Index.jsp">Inicio</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="Cuentos.jsp">Cuentos</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="Fabulas.jsp">Fábulas</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="Descargas.jsp">Descargas</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="RegiCuen.jsp">Registrar
					Cuento</a></li>


		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Buscar" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
		</form>
		<li class="navbar-nav nav-item  my-2 my-lg-0"><a class="nav-link"
			href="Login.jsp">Iniciar Sesión</a></li>
		<li class="navbar-nav nav-item my-2 my-lg-0"><a class="nav-link"
			href="Registrar.jsp">Registrar</a></li>



	</nav>
	<div class="container-fluid">

		<h4 class="text-center bg-success">
			<a class="text-white ">Descargar cuentos en PDF</a>
			</h1>

			<div class="row">

				<div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
					<p class="text-center">
						<img src="img/elgatoconbotas.jpg" height="200px" width="200px"
							alt="elgatoconbotas" title="elgatoconbotas">
					</p>

					<a href=”img/pdf/elgatoconbotas.pdf” title=”elgatoconbotas”><h5
							class="text-center">El gato conbotas</h5></a>
				</div>

			</div>
			
			<div class="row">

				<div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
					<p class="text-center">
						<img src="img/3cerditos.jpg" height="200px" width="200px"
							alt="3cerditos" title="3cerditos">
					</p>

					<a href=”img/pdf/lostrescerditos.pdf” title=”elgatoconbotas”><h5
							class="text-center">El gato conbotas</h5></a>
				</div>

			</div>
			
			<div class="row">

				<div class=" col-xs-12 col-sm-6 col-md-4 col-lg-4">
					<p class="text-center">
						<img src="img/reyleonn.jpg" height="200px" width="200px"
							alt="reyleon" title="reyleon">
					</p>

					<a href=”img/pdf/elreyleon.pdf” title=”elgatoconbotas”><h5
							class="text-center">El gato conbotas</h5></a>
				</div>

			</div>
	</div>

</body>
</html>