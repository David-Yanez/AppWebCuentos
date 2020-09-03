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
 * Servlet implementation class RegistratCuento
 */
@Transactional
@WebServlet("/RegistratCuento")
public class RegistratCuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext (unitName = "adminlibrosPU" )
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistratCuento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String tipo=request.getParameter("tipo");
		String genero=request.getParameter("genero");
		String nombreCu=request.getParameter("nombreCu");
		String autor=request.getParameter("autor");
		String descripcion=request.getParameter("descripcion");
		String archivo=request.getParameter("archivo");
		String id_usuario=request.getParameter("id_usuario");
	
		int id_us = Integer.parseInt(id_usuario);
		byte[] archi = archivo.getBytes();
		
if(tipo.trim().equals("") || autor.trim().equals("")) {
			
			
			request.setAttribute("valTipo", tipo );
			request.setAttribute("valGenero", genero );
			request.setAttribute("valNombreCu", nombreCu );
			request.setAttribute("valAutor", autor );
			request.setAttribute("valDescripcion", descripcion );
		
			request.setAttribute("valId_usuario", id_us );
	
			
		//	request.setAttribute("valError", "Titulo o autor sin llenar" );
			
			request.getRequestDispatcher("RegiCuen.jsp").forward(request, response);
		} else {
			
			Cuento Cuen = new Cuento ();
			
			Cuen.setTipo(tipo);
			Cuen.setGenero(genero);
			Cuen.setNombreCU(nombreCu);
			Cuen.setAutor(autor);
			Cuen.setDescripcion(descripcion);
			Cuen.setArchivo(archi);
			Cuen.setId_usuario(id_us);
			
			em.persist(Cuen);
			

	//		request.getRequestDispatcher("RegiCuen.jsp").forward(request, response);
	
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
