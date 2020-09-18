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

//import ec.epn.adm.libros.modelo.Libro;
import ec.epn.cuentos.modelo.Cuento;
import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class EditarCuento
 */

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


@Transactional
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
    
    /**
     * Este metodo nos permite consultar los datos de un cuento para 
     * cargar en la jsp editar eliminar cuento 
     * @param recibe el id del cuento
     * @return envia  todos los datos del cuento al jsp editarEliminarCuento
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String parametro = request.getParameter("id_cuentos");
	//	String parametro = request.getParameter("id_cuentos");
		
		
		Cuento cu= em.find(Cuento.class, new Integer(parametro));
		
	//	int id_us = Integer.parseInt(cu.getId_usuario().getId_usuario());
		
		request.setAttribute("valTipo", cu.getTipo());
		request.setAttribute("valNombreCu", cu.getNombrecu());
		request.setAttribute("valAutor", cu.getAutor());
		request.setAttribute("valGenero", cu.getGenero());
		request.setAttribute("valDescripcion", cu.getDescripcion());
	
	//	 Usuario us = cu.getId_usuario();
		
		 String id_uss = String.valueOf( cu.getId_usuario().getId_usuario());

		request.setAttribute("valId_usuario", id_uss);
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
