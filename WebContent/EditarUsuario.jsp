<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuario</title>

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
			<h1>Edición de usuario</h1>

			<%!public String obtieneAtributo(HttpServletRequest request, String usuario){
				String valor=(String) request.getAttribute(usuario);
	 			  if(valor==null){
				   valor="";
	 			  }
				return valor;
				}	
				%>
			<p style="color:red"><%= obtieneAtributo(request,"valError") %></p>
			
			
			
			<table size="35" ; style="font-family: Arial" border="0">
				<form method="post" action="EdicionUsuario"  class="was-validated" >
					<tr>
						<td>Nombre:</td>

						<td><input type="text" name="nombre"
							value="<%= request.getParameter("nombre") %>" class="form-control is-valid" required/></td> 
					</tr>
					<tr>
						<td>Apellido:</td>
						<td><input type="text" name="apellido"
							value="<%= request.getParameter("apellido") %>" class="form-control is-valid" required /></td>
					</tr>
					<tr>
					<% String sexo = request.getParameter("sexo");
					String hombre = null;
					String mujer = null;
					String otro = null;
					if(sexo.equals("Hombre")) {
						hombre="checked";	
						}else if(sexo.equals("Mujer")) {
						mujer="checked";	
						}else if(sexo.equals("Otro")) {
						otro="checked";			
						} 
					
					
					
					%>
					
					<input type="hidden" name="id" value="<%= request.getParameter("id") %>">
					
						
						<td>Sexo <br />
						</td>
						<td><input type="radio" name="sexo" value="Hombre" <%=hombre%> /> Hombre
							<input type="radio" name="sexo" value="Mujer" <%=mujer%>/> Mujer 
							<input type="radio" name="sexo" value="Otro" <%=otro%>/> Otro
						</td>
					</tr>
					<tr>
						<td>Fecha nacimiento:</td>
			           <td>   <input type="date" name="fecha"
			           			value="<%= request.getParameter("fecha") %>" class="form-control is-valid" required/>  </td>
					</tr>
					<tr>
						<td>Correo electrónico:</td>
						<td><input type="text" name="correo"
							value="<%= request.getParameter("correo") %>" class="form-control is-valid" required /></td>
					</tr>
					<tr>
						<td>Confirme su contraseña</br>para aplicar los cambios:</td>
						<td><input type="password" name="password" 
						class="form-control is-valid" required/></td>
					</tr>
					<tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<td></td>
					<td><input type="submit" value="Registrar"
						style='width: 110px; height: 40px'></td>
					</tr>
					<br>
				</form>
			</table>
			<a class="nav-link" href="Login.jsp">Ya tiene una cuenta creada.</a>
		</center>




	</div>

</body>
</html>
