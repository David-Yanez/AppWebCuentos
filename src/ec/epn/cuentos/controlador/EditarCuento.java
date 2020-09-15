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

//import ec.epn.adm.libros.modelo.Libro;
import ec.epn.cuentos.modelo.Cuento;
import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class EditarCuento
 */
@Transactional
@WebServlet("/EditarCuento")
public class EditarCuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCuento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String parametro = request.getParameter("id_cuentos");
	//	String parametro = request.getParameter("id_cuentos");
		
		
		Cuento cu= em.find(Cuento.class, new Integer(parametro));
		
	//	int id_us = Integer.parseInt(cu.getId_usuario().getId_usuario());
		
		request.setAttribute("valTipo", cu.getTipo());
		request.setAttribute("valNombreCu", cu.getNombrecu());
		request.setAttribute("valAutor", cu.getAutor());
		request.setAttribute("valGenero", cu.getGenero());
		request.setAttribute("valDescripcion", cu.getDescripcion());
		//request.setAttribute("valId_usuario", cu.getId_usuario());
	//	request.setAttribute("valId_cuentos", cu.getId_cuentos());
		
		/* int numEntero = 4;    
		    String numCadena= String.valueOf(numEntero);*/
		 Usuario us = cu.getId_usuario();
		
		 String id_uss = String.valueOf( cu.getId_usuario().getId_usuario());
	//	 
		// Usuario us = em.find(Usuario.class, cu.getId_usuario());
		
		// us.setId_usuario(cu.getId_usuario());
		 
	//	String id_us = String.valueOf(us.getId_usuario());*/
		
	//	String id_uss = String.valueOf(us.getId_usuario());
		//String id_uss = String.valueOf(us.setId_usuario(us.getId_usuario());
		
	//	String id_us2 = String.copyValueOf(cu.setId_usuario(id_us);
		
		request.setAttribute("valId_usuario", id_uss);
		request.setAttribute("valId_cuentos", parametro);
		
		
		request.getRequestDispatcher("editarEliminarCuento.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
