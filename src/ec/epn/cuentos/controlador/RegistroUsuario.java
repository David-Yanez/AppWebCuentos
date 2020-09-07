package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class RegistroUsuario
 */
@Transactional
@WebServlet("/RegistroUsuario")
public class RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@PersistenceContext (unitName="poryectoCuentos")
	private EntityManager em;
		
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		Date fechaNac=Date.valueOf(request.getParameter("fecha"));
		
		
		
		String correo = request.getParameter("correo");
		String password = request.getParameter("password1");
		
		System.out.println("Datos del usuario a guardar: nombre:" + nombre 
				 + " apellido: " + apellido+ " sexo: " + sexo
				 + " Fecha nacimiento: "+ fechaNac + " correo: "+ correo
				 + " password: "+ password);
		
		
		if (nombre.trim().equals("") || 
				apellido.trim().equals("") || 
				sexo.trim().equals("") || 
			//	fecha.trim().equals("")|| 
				correo.trim().equals("") || 
				password.trim().equals("")) {
			System.out.println("HOLA");
			request.setAttribute("valNombre",nombre);
			request.setAttribute("valApellido",apellido);
			request.setAttribute("valCorreo",correo);
			request.setAttribute("valPassword",password);
			request.setAttribute("valPassword2",password);
			
			request.setAttribute("valError","Datos sin llenar");
			
			request.getRequestDispatcher("Registrar.jsp").forward(request,response);			
		}else {
			System.out.println("CHAO");
			
			
			Usuario u = new Usuario();
			u.setNombre(nombre);
			u.setApellido(apellido);
			u.setSexo(sexo);
			u.setFechanac(fechaNac);
			u.setCorreo(correo);
			u.setPassword(password);
			
			
			em.persist(u);

			
			request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	
	

}
