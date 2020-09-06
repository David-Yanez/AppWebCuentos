package ec.epn.cuentos.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import ec.epn.adm.libros.modelo.Libro;
import ec.epn.cuentos.modelo.Cuento;

/**
 * Servlet implementation class EditarCuento
 */
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
		
		Cuento cu= em.find(Cuento.class, new Integer(parametro));
		
		request.setAttribute("valTipo", cu.getTipo());
		request.setAttribute("valNombreCu", cu.getNombrecu());
		request.setAttribute("valAutor", cu.getAutor());
		request.setAttribute("valGenero", cu.getGenero());
		request.setAttribute("valDescripcion", cu.getDescripcion());
		//request.setAttribute("valId_usuario", cu.getId_usuario());
	//	request.setAttribute("valId_cuentos", cu.getId_cuentos());
		request.setAttribute("valId_usuario", parametro);
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
