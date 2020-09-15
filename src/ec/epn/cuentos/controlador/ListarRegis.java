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


import ec.epn.cuentos.modelo.Cuento;

/**
 * Servlet implementation class ListarRegis
 */
@WebServlet("/ListarRegis")
public class ListarRegis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarRegis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	//	Query q = em.createQuery("Select c from Cuento c", Cuento.class);
		
	//	Query q = em.createQuery("SELECT c.id_cuentos,c.tipo,c.genero,c.nombrecu,c.autor FROM Cuento  as c", Cuento.class);
		Query q = em.createQuery("SELECT id_cuentos,tipo,genero,nombrecu,autor FROM Cuento");
		
		List<Object[]> cuentos = q.getResultList();
		//List<Cuento> cuentos= q.getResultList();
		
		 request.setAttribute("cuentos",cuentos);
		
		request.getRequestDispatcher("listaRegistrados.jsp").forward(request,response);

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
