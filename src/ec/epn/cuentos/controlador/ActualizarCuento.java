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
 * Servlet implementation class ActualizarCuento
 */
@Transactional
@WebServlet("/ActualizarCuento")
public class ActualizarCuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCuento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id_cuento = request.getParameter("id_cuentos");
		  
		   String tipo=request.getParameter("tipo");
		   String genero=request.getParameter("genero");
			String nombrecu=request.getParameter("nombreCu");
			String autor=request.getParameter("autor");
			String descripcion=request.getParameter("descripcion");
			//String archivo=request.getParameter("archivo");
			String id_usuario=request.getParameter("id_usuario");
	
			int idCu = Integer.parseInt(id_cuento);
			int idUs = Integer.parseInt(id_usuario);

			if (tipo.trim().equals("") || nombrecu.trim().equals("") || genero.trim().equals("") || autor.trim().equals("") || descripcion.trim().equals("") || id_usuario.trim().equals("") ) {
		
				   request.setAttribute("valError","Datos sin llenar");
		
		

					request.getRequestDispatcher("ListarRegis").forward(request,response);			
			} else {
				
				Cuento cu = em.find(Cuento.class, idCu);
			//	 Usuario us = new Usuario ();
				 Usuario us = em.find(Usuario.class,idUs);
				 us.setId_usuario(idUs);
				 
				cu.setTipo(tipo);
				cu.setGenero(genero);
				cu.setNombrecu(nombrecu);
				cu.setAutor(autor);
				cu.setDescripcion(descripcion);
			//	Cuen.setArchivo(archi);	
				cu.setId_usuario(us);
				
				
				em.persist(cu);  
				
				request.getRequestDispatcher("ListarRegis").forward(request, response);

				
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
