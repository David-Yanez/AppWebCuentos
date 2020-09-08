<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio sesión</title>

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










		<center>
			<h1>Inicio sesión</h1>

			<%!public String obtieneAtributo(HttpServletRequest request, String usuario){
				String valor=(String) request.getAttribute(usuario);
	 			  if(valor==null){
				   valor="";
	 			  }
				return valor;
				}	
				%>

			<p style="color:red"><%=obtieneAtributo(request, "valError")%></p>

			<table  size="35" ; style="font-family: Arial" border="0">
				<form method="post" action="LoginUsuario">
					<tr>
						<td>Correo:</td>

						<td><input type="text" name="correo"
							value="<%=obtieneAtributo(request, "valCorreo")%>" /></td>
					</tr>
					<tr>
						<td>Contraseña:</td>
						<td><input type="password" name="password"
							value="<%=obtieneAtributo(request, "valPassword")%>" />
						</td>
					</tr>
					<tr>
					<tr><td></td><td></td></tr>
					<td></td>
						<td>
							<input type="submit" value="Ingresar" style='width:110px; height:40px'>
						</td>
					</tr>
						<br>
				</form>
			</table>
			<a class="nav-link" href="Registrar.jsp">Crear cuenta nueva en AppWebCuentos.</a>
		</center>









	</div>

</body>
</html>