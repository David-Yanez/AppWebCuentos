package ec.epn.cuentos.controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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
 * Servlet implementation class ActualizarCuento
 */
@Transactional
@MultipartConfig
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
    
    /**
     * Este metodo nos permite actualizar los datos de un cuento previamente regitrado
     * @param recibe los parametros que se van actualizar 
     * @return Registra los nuevos datos en la base de datos 
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String id_cuento = request.getParameter("id_cuentos");
		  
		   String tipo=request.getParameter("tipo");
		   String genero=request.getParameter("genero");
			String nombrecu=request.getParameter("nombreCu");
			String autor=request.getParameter("autor");
			String descripcion=request.getParameter("descripcion");
			//String archivo=request.getParameter("archivo");
			String id_usuario=request.getParameter("id_usuario");
			
			String nombArch = request.getParameter("nombre");
			Part archivo = request.getPart("archivo2");
			String nombImg = request.getParameter("nombre2");
			Part imagen = request.getPart("imagen2");
			
	
			InputStream is = archivo.getInputStream();
			InputStream is2 = imagen.getInputStream();
			
			
			File f = new File ("C:/Users/daila/Documents/GitHub/AppWebCuentos/WebContent/pdf/"+nombArch);
		    File f2 = new File ("C:/Users/daila/Documents/GitHub/AppWebCuentos/WebContent/img/"+nombImg);
			
			
			
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
				
				
				if (nombArch.trim().equals("") && nombImg.trim().equals("") ) {
					
					em.persist(cu);  
					
				} else {
					
					 
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
							
					
					
					cu.setArchivo("pdf/"+nombArch);
					cu.setImagen("img/"+nombImg);
					em.persist(cu);  
				}
				
				
				
				
				
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
