package ec.epn.cuentos.controlador;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import ec.epn.cuentos.modelo.Cuento;
import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class Impri
 */
//


@Transactional
@MultipartConfig
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

		
		String tipo=request.getParameter("tipo");
	   String genero=request.getParameter("genero");
		String nombrecu=request.getParameter("nombreCu");
		String autor=request.getParameter("autor");
		String descripcion=request.getParameter("descripcion");
		String id_usuario=request.getParameter("id_usuario");
	
		String nombArch = request.getParameter("nombre");
		Part archivo = request.getPart("archivo");
		String nombImg = request.getParameter("nombre2");
		Part imagen = request.getPart("imagen");
		
		InputStream is = archivo.getInputStream();
		InputStream is2 = imagen.getInputStream();
		
		File f = new File ("/home/david/Documentos/Proyecto/Archivos/"+nombArch) ;
	   File f2 = new File ("/home/david/Documentos/Proyecto/Imagenes/"+nombImg) ;
	
		
	

	
		if (tipo.trim().equals("") || nombrecu.trim().equals("") || genero.trim().equals("") || autor.trim().equals("") || descripcion.trim().equals("") || id_usuario.trim().equals("") ) {
			
	
			   request.setAttribute("valError","Datos sin llenar");
				
		
				request.getRequestDispatcher("ListarRegis").forward(request,response);			
				
		
		}else {
			int id_us = Integer.parseInt(id_usuario);
			
	 Cuento Cuen = new Cuento ();
	 Usuario us = new Usuario ();
	 us.setId_usuario(id_us);
	 
	 // lee y guarda el archivo
		FileOutputStream ous = new FileOutputStream(f);
		int datos = is.read();
		while(datos != -1) {
			ous.write(datos);
			datos = is.read();
		}
		
		ous.close();
		is.close();
		
		 // lee y guarda el imagen
		FileOutputStream ous2 = new FileOutputStream(f2);
		int datos2 = is2.read();
		while(datos2 != -1) {
			ous2.write(datos2);
			datos2 = is2.read();
		}
		
		
		ous.close();
		is.close();
			
			Cuen.setTipo(tipo);
		
			Cuen.setGenero(genero);
			Cuen.setNombrecu(nombrecu);
			Cuen.setAutor(autor);
			Cuen.setDescripcion(descripcion);
			Cuen.setArchivo("/home/david/Documentos/Proyecto/Archivos/"+nombArch);
			Cuen.setImagen("/home/david/Documentos/Proyecto/Imagenes/"+nombImg);
			
		
	
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
