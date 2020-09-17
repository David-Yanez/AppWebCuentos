package ec.epn.cuentos.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import ec.epn.cuentos.modelo.Cuento;
import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class EliminarUsuario
 */
@Transactional
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@PersistenceContext (unitName="poryectoCuentos")
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		System.out.println(id+" MIraaaaaa");
		
		Usuario u = em.find(Usuario.class, new Integer(id));
		em.remove(u);

		request.getRequestDispatcher("Index.jsp?cerrar=true").forward(request,response);

		
		 
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
