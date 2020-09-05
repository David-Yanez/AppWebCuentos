package ec.epn.cuentos.controlador;


import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;


import javax.ejb.TransactionAttribute;
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
 * Servlet implementation class Impri
 */
//


@Transactional
@TransactionAttribute
@WebServlet("/RegistroCuento")
public class RegistroCuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
       


	/**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroCuento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
 
    @Transactional
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		em.getTransaction().begin();
		String tipo=request.getParameter("tipo");
	   String genero=request.getParameter("genero");
		String nombrecu=request.getParameter("nombreCu");
		String autor=request.getParameter("autor");
		String descripcion=request.getParameter("descripcion");
		//String archivo=request.getParameter("archivo");
		String id_usuario=request.getParameter("id_usuario");
	
		
		int id_us = Integer.parseInt(id_usuario);
		
		/*	OutputStream os=response.getOutputStream();
		response.setContentType("text/html; charset=ISO-8859-1");
			
			PrintWriter out=new PrintWriter(os);
			out.print("<html>");
			out.print("<body> ");
	
			
			out.print("<H1> "+tipo+ " </H1>");
			out.print("<H1> "+genero+ " </H1>");
			out.print("<H1> "+nombrecu+ " </H1>");
			out.print("<H1> "+autor+ " </H1>");
			out.print("<H1> "+descripcion+ " </H1>");
		
			out.print("<H1> "+id_usuario+ " </H1>");
			
		if(nombrecu.trim().equals("") || autor.trim().equals("")  ){
				
			    request.setAttribute("valTipo", tipo );
			    request.setAttribute("valGenero", genero );
				request.setAttribute("valNombreCu", nombrecu );
				request.setAttribute("valAutor", autor );
				request.setAttribute("valDescripcion", descripcion );
				//request.setAttribute("valArchivo", archi);
				request.setAttribute("valId_usuario", id_usuario );
				
				out.print("<H1> Campos sin llenar </H1>");
				
			//	request.setAttribute("valError", "Titulo o autor sin llenar" );
		} else {*/
			
	 Cuento Cuen = new Cuento ();
	 Usuario us = new Usuario ();
	 us.setId_usuario(id_us);
			
			Cuen.setTipo(tipo);
			Cuen.setGenero(genero);
			Cuen.setNombrecu(nombrecu);
			Cuen.setAutor(autor);
			Cuen.setDescripcion(descripcion);
		//	Cuen.setArchivo(archi);
		//	Cuen.setId_usuario(Usuario.id_us);
		//	Cuen.setId_usuario(Usuario, id_us);
			Cuen.setId_usuario(us);
			
			
			
			em.persist(Cuen);  
			
			
		//	request.getRequestDispatcher("Index,jsp").forward(request, response);

		//      em.getTransaction().commit();
			//}

		
		/*out.print("</body>");
			out.print("</html>");
			
			out.flush();
			out.close();
			os.close();*/
		
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
