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

/**
 * Servlet implementation class EliminarCuento
 */
@Transactional
@WebServlet("/EliminarCuento")
public class EliminarCuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCuento() {
        super();
<<<<<<< HEAD
        // TODO Auto-generated constructor stub
=======
  
>>>>>>> master
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
<<<<<<< HEAD
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
=======
    
    /**
     * Este metodo nos permite eliminar un cuento que este registrado
     * @param recibe el id del cuento
     * @return  elimina el cuento registrado
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
>>>>>>> master
	
		String parametro = request.getParameter("id_cuentos");
		
		
				Cuento cu= em.find(Cuento.class, new Integer(parametro));
				
				em.remove(cu);
				request.getRequestDispatcher("Index.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		
>>>>>>> master
		doGet(request, response);
	}

}
