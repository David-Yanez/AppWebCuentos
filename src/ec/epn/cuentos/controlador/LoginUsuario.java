package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class LoginUsuario
 */
@Transactional
@WebServlet("/LoginUsuario")
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");
		
		
		
		System.out.println(correo + "    " + password);
		
		if (correo.trim().equals("") || password.trim().equals("")) {
			
			request.setAttribute("valCorreo",correo);
			request.setAttribute("valError","Datos sin llenar");
			request.getRequestDispatcher("Login.jsp").forward(request,response);

		}else {
			
			
			Query q = em.createQuery("SELECT password	FROM Usuario where correo='"+correo+"'");
			String passwordTraida = (String) q.getSingleResult();
			
			if(passwordTraida.equals(password)){
				
				request.getRequestDispatcher("Index.jsp").forward(request,response);
				
			}else {
				
				request.setAttribute("valError","Usuario o contraseña invalidos");
				request.getRequestDispatcher("Login.jsp").forward(request,response);

			}
			
			
			
			
		}
		
		
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
