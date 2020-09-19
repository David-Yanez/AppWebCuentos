package ec.epn.cuentos.controlador;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import ec.epn.cuentos.modelo.Cuento;
import ec.epn.cuentos.modelo.Usuario;


/**
*   Copyright (c) 2020, David Yánez, Jersson Andrango, Brandon Toapanta .
* 
*   
*  CuentaWeb is free software: you can redistribute it and/or modify
*  it under the terms of the GNU General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*
*  CuentaWeb is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU General Public License for more details.
*
*  You should have received a copy of the GNU General Public License
*  along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/



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
 
    
    /**
     * Este metodo nos permite Registrar un cuento 
     * @param recibe  todos los datos del cuento 
     * @return  registra en la base de datos el cuento 
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession misession= (HttpSession) request.getSession();
				
		String tipo=request.getParameter("tipo");
	    String genero=request.getParameter("genero");
		String nombrecu=request.getParameter("nombreCu");
		String autor=request.getParameter("autor");
		String descripcion=request.getParameter("descripcion");

		//String archivo=request.getParameter("archivo");
		String id_usuario= request.getParameter("id_usuario");

		String nombArch = request.getParameter("nombre");
		Part archivo = request.getPart("archivo");
		String nombImg = request.getParameter("nombre2");
		Part imagen = request.getPart("imagen");
		
		System.out.println(id_usuario);
		misession.setAttribute("valId",id_usuario);
		
		InputStream is = archivo.getInputStream();
		InputStream is2 = imagen.getInputStream();
		
		File f = new File ("C:/Users/brant/Documents/SEMESTRE 2020-A/Libres/Proyecto/PROYECTOACTUAL/AppWebCuentos/WebContent/pdf/"+nombArch);
		File f2 = new File ("C:/Users/brant/Documents/SEMESTRE 2020-A/Libres/Proyecto/PROYECTOACTUAL/AppWebCuentos/WebContent/img/"+nombImg);

		
	

	// valida que no haya campos vacios  aunque tambien se lo hace mediante css 
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
			Cuen.setId_usuario(us);
			Cuen.setArchivo("pdf/"+nombArch);
			Cuen.setImagen("img/"+nombImg);
		
			em.persist(Cuen);  
			
		
	
			
			request.getRequestDispatcher("ListarRegis").forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
