package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class EdicionUsuario
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
@WebServlet("/EdicionUsuario")
public class EdicionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@PersistenceContext (unitName="poryectoCuentos")
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EdicionUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    /**
     * Este metodo nos permite Editar un usario.
     * @param Recibe los datos del usuario y los muestra en la jsp .
     * @return  Una vez validado todo actualiza los datos de usuario en la base de datos y nos envía al Index.jsp.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = (String) request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		String fechaN=request.getParameter("fecha");
		Date fechaNac = null;
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");

		System.out.println("Datos del usuario a editar: id: "+id+" nombre:" + nombre 
				 + " apellido: " + apellido+ " sexo: " + sexo
				 + " Fecha nacimiento: "+ fechaN + " correo: "+ correo
				 + " password: "+ password);
		

		Query q1 = em.createQuery("SELECT password FROM Usuario where id_usuario="+id);
		String passVerdadera =String.valueOf(q1.getSingleResult());
		
		if(!passVerdadera.equals(password)) {
			
			request.setAttribute("valError","La contraseña no coincide");
			request.getRequestDispatcher("EditarUsuario.jsp?id="+id+"&nombre="+nombre+"&apellido="+apellido+"&sexo="+sexo+"&fecha="+fechaN+"&correo="+correo).forward(request,response);
			
		}else {
			
			
			fechaNac=Date.valueOf(fechaN);
			
			Usuario u = new Usuario();
			u=em.find(Usuario.class, Integer.parseInt(id));
			u.setNombre(nombre);
			u.setApellido(apellido);
			u.setSexo(sexo);
			u.setFechanac(fechaNac);
			u.setCorreo(correo);
			u.setPassword(password);
			
			em.persist(u);
			
				request.getRequestDispatcher("Index.jsp?cerrar=true").forward(request,response);

			
			
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
