package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TblClienteImp;
import model.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// INSTANCIAMOS
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		List<TblCliente> listadoCliente = crud.ListarClientes();
		
		// ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
		request.setAttribute("listadoClientes", listadoCliente);
		
		// REDIRECCIONAMOS
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		// RECUPERAMOS LOS DATOS DEL FORMULARIO
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		String email = request.getParameter("email");
		String telef = request.getParameter("telefono");
		String sexo = request.getParameter("sexo");
		String nacion = request.getParameter("nacionalidad");
		
		// INSTANCIAMOS LAS RESPECTIVAS CLASES
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		
		// ASIGNAMOS VALORES
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelf(telef);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacion);
		
		// INVOCAMOS EL METODO A REGISTRAR EN LA BD
		crud.RegistrarCliente(cliente);
		
		// ACTUALIZAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
		List<TblCliente> listadoCliente = crud.ListarClientes();
		request.setAttribute("listadoClientes", listadoCliente);
		
		// REDIRECCIONAMOS A LA PAGINA DE LISTADO DE CLIENTES
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
		
	}

}
