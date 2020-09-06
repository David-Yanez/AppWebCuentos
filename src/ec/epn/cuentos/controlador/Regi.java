package ec.epn.cuentos.controlador;

import java.io.IOException;
import java.sql.Date;


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
 * Servlet implementation class Regi
 */
@Transactional
@WebServlet("/Regi")
public class Regi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@PersistenceContext (unitName = "poryectoCuentos" )
	private EntityManager em; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
Cuento c = new Cuento (); 	

Usuario us = new Usuario();

//Date fe = new Date(int 1995, int 11, int 16);



us.setId_usuario(2);
us.setNombre("Jose");
us.setApellido("Perez");
us.setSexo("Hombre");

us.setCorreo("jose.peres@gmail.com");
us.setPassword("12345");


 

 
/*c.setTipo("Cuento");
c.setGenero("Clasico");
c.setNombrecu("Los 3 cerditos");
c.setAutor("yo");
c.setDescripcion("Excelente libro para los niños");
c.setId_usuario(us);*/
	
   em.persist(us);  
   
   request.getRequestDispatcher("Index,jsp").forward(request, response);

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
