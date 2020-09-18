package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import ec.epn.cuentos.modelo.Usuario;

/**
 * Servlet implementation class LoginUsuario
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
@WebServlet("/LoginUsuario")
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");
		
		
		
		System.out.println(correo + "    " + password);
		
		if (correo.trim().equals("") || password.trim().equals("")) {
			
			request.setAttribute("valCorreo",correo);
			request.setAttribute("valError","Datos sin llenar");
			request.getRequestDispatcher("Login.jsp").forward(request,response);

		}else {
			
			
			Query q = em.createQuery("SELECT password	FROM Usuario where correo='"+correo+"'");
			boolean existe = q.getResultList().isEmpty();

			if (existe) {
				
				request.setAttribute("valError","Usuario no existe");
				request.getRequestDispatcher("Login.jsp").forward(request,response);

			}else {
			
			String passwordTraida = (String) q.getSingleResult();
			
			if(password.equals(passwordTraida)){
				
				
				Query q2 = em.createQuery("SELECT id_usuario FROM Usuario where correo='"+correo+"'");
				String id =String.valueOf(q2.getSingleResult());
				
				Query q3 = em.createQuery("SELECT nombre FROM Usuario where correo='"+correo+"'");
				String nom =String.valueOf(q3.getSingleResult());
				
				Query q4 = em.createQuery("SELECT apellido FROM Usuario where correo='"+correo+"'");
				String ape =String.valueOf(q4.getSingleResult());
				
				Query q5 = em.createQuery("SELECT sexo FROM Usuario where correo='"+correo+"'");
				String sexo =String.valueOf(q5.getSingleResult());
				
				Query q6 = em.createQuery("SELECT fechanac FROM Usuario where correo='"+correo+"'");
				String fecha =String.valueOf(q6.getSingleResult());
				
				
				
				HttpSession misession= request.getSession();
				misession.setAttribute("id_usuario",id);
				
				HttpSession misession2= request.getSession();
				misession2.setAttribute("Nombre",nom);
				
				HttpSession misession3= request.getSession();
				misession3.setAttribute("Apellido",ape);
				
				HttpSession misession4= request.getSession();
				misession4.setAttribute("Sexo",sexo);
				
				HttpSession misession5= request.getSession();
				misession5.setAttribute("Fecha",fecha);
				
				HttpSession misession6= request.getSession();
				misession6.setAttribute("Correo",correo);
					
				
				response.sendRedirect("RegiCuen.jsp");
				
				
				//request.getRequestDispatcher("RegiCuen.jsp").forward(request,response);
				
			}else {
			
				request.setAttribute("valError","Contraseña Incorrecta");
				request.getRequestDispatcher("Login.jsp").forward(request,response);

			}
			
			}
			
			
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
