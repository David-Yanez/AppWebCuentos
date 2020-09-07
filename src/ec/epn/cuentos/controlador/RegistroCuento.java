package ec.epn.cuentos.controlador;


import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

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
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	OutputStream os=response.getOutputStream();
		//response.setContentType("text/html; charset=ISO-8859-1");
		
		String tipo=request.getParameter("tipo");
	   String genero=request.getParameter("genero");
		String nombrecu=request.getParameter("nombreCu");
		String autor=request.getParameter("autor");
		String descripcion=request.getParameter("descripcion");
		//String archivo=request.getParameter("archivo");
		String id_usuario=request.getParameter("id_usuario");
		
		//PrintWriter out=new PrintWriter(os);

	
		if (tipo.trim().equals("") || nombrecu.trim().equals("") || genero.trim().equals("") || autor.trim().equals("") || descripcion.trim().equals("") || id_usuario.trim().equals("") ) {
			
		//	PrintWriter out=new PrintWriter(os);
			/*out.print("<html>");
			out.print("<body> ");
			out.print("alert('User or password incorrect');");
			out.print("</body>");
			out.print("</html>");*/
			/*  out.println("<script type=\"text/javascript\">");
			   out.println("alert(\"User or password incorrect\");");
			 //  out.println("location='listaRegistrados.jsp';");
			   out.println("</script>");*/
			
			   request.setAttribute("valError","Datos sin llenar");
				
			//	request.getRequestDispatcher("listaRegistrados.jsp").forward(request,response);			
				request.getRequestDispatcher("ListarRegis").forward(request,response);			
				
		
		}else {
			int id_us = Integer.parseInt(id_usuario);
			
	 Cuento Cuen = new Cuento ();
	 Usuario us = new Usuario ();
	 us.setId_usuario(id_us);
			
			Cuen.setTipo(tipo);
			Cuen.setGenero(genero);
			Cuen.setNombrecu(nombrecu);
			Cuen.setAutor(autor);
			Cuen.setDescripcion(descripcion);
		//	Cuen.setArchivo(archi);
	
			Cuen.setId_usuario(us);
			
			
			em.persist(Cuen);  
			
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
