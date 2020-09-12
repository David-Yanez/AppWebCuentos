package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		String fechaN=request.getParameter("fecha");
		Date fechaNac = null;
		String correo = request.getParameter("correo");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		System.out.println("Datos del usuario a guardar: nombre:" + nombre 
				 + " apellido: " + apellido+ " sexo: " + sexo
				 + " Fecha nacimiento: "+ fechaN + " correo: "+ correo
				 + " password: "+ password1);
		
		
		if (nombre.trim().equals("") || 
				apellido.trim().equals("") || 
				sexo==null || 
				fechaN.equals("") || 
				correo.trim().equals("") || 
				password1.trim().equals("")) {


			request.setAttribute("valNombre",nombre);
			request.setAttribute("valApellido",apellido);
			
			if(sexo==null) {

			}else if(sexo.equals("Hombre")) {
				request.setAttribute("valSexo1","checked");	
			}else if(sexo.equals("Mujer")) {
				request.setAttribute("valSexo2","checked");		
			}else if(sexo.equals("Otro")) {
				request.setAttribute("valSexo3","checked");			
			}
				
			if(fechaN!=null) {
				request.setAttribute("valFecha",fechaN);
			}
						
			request.setAttribute("valCorreo",correo);

			request.setAttribute("valError","Datos sin llenar");
			
			request.getRequestDispatcher("Registrar.jsp").forward(request,response);			
		}else {
			
			
			
			Query q = em.createQuery("SELECT id_usuario FROM Usuario where correo='"+correo+"'");
			boolean existe = q.getResultList().isEmpty();

			if (!existe) {
				
				
				request.setAttribute("valNombre",nombre);
				request.setAttribute("valApellido",apellido);
				
				if(sexo==null) {

				}else if(sexo.equals("Hombre")) {
					request.setAttribute("valSexo1","checked");	
				}else if(sexo.equals("Mujer")) {
					request.setAttribute("valSexo2","checked");		
				}else if(sexo.equals("Otro")) {
					request.setAttribute("valSexo3","checked");			
				}
					
				if(fechaN!=null) {
					request.setAttribute("valFecha",fechaN);
				}
							
				
				
				request.setAttribute("valError","Usuario ya tiene una cuenta");
				request.getRequestDispatcher("Registrar.jsp").forward(request,response);

			}else if(!password1.equals(password2)) {
				
				request.setAttribute("valNombre",nombre);
				request.setAttribute("valApellido",apellido);
				
				if(sexo==null) {

				}else if(sexo.equals("Hombre")) {
					request.setAttribute("valSexo1","checked");	
				}else if(sexo.equals("Mujer")) {
					request.setAttribute("valSexo2","checked");		
				}else if(sexo.equals("Otro")) {
					request.setAttribute("valSexo3","checked");			
				}
					
				if(fechaN!=null) {
					request.setAttribute("valFecha",fechaN);
				}
							
				request.setAttribute("valCorreo",correo);

				
				request.setAttribute("valError","Contraseñas no coinciden");
				request.getRequestDispatcher("Registrar.jsp").forward(request,response);
				
			}else {
			
			
			
			fechaNac=Date.valueOf(fechaN);
			
			Usuario u = new Usuario();
			u.setNombre(nombre);
			u.setApellido(apellido);
			u.setSexo(sexo);
			u.setFechanac(fechaNac);
			u.setCorreo(correo);
			u.setPassword(password1);
			
			em.persist(u);

			request.getRequestDispatcher("Login.jsp").forward(request,response);

		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	}
