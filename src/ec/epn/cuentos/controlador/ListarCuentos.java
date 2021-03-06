package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.persistence.Query;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ListarCuentos
 */
@WebServlet("/ListarCuentos")
public class ListarCuentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCuentos() {
        super();
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /**
     * Este metodo nos permite crear un objeto personalizado 
     * con los datos requeridos de todos los cuentos registrados 
     * @param constulta el nombre , la imagen , el archivo y descripcion del cuento 
     * @return  crea la lista de objetos personalizados y envia a la jsp Cuentos
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	Query q = em.createQuery("SELECT nombrecu, imagen, archivo, descripcion FROM Cuento");
	
	
	List<Object[]> cuentos = q.getResultList();
	
	request.setAttribute("cuentos", cuentos);
	
	 request.getRequestDispatcher("Cuentos.jsp").forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
