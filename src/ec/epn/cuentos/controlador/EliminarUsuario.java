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
 * Servlet implementation class EliminarUsuario
 */
@Transactional
@WebServlet("/EliminarUsuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@PersistenceContext (unitName="poryectoCuentos")
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public EliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Este metodo nos permite eliminar usuarios.
     * @param recibe el id del usuario a eliminar. 
     * @return  elimina al usuario permanentemente de la base de datos y nos regresa al Index.jsp
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		System.out.println(id+" MIraaaaaa");
		
		Usuario u = em.find(Usuario.class, new Integer(id));
		em.remove(u);

		request.getRequestDispatcher("Index.jsp?cerrar=true").forward(request,response);

		
		 
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
