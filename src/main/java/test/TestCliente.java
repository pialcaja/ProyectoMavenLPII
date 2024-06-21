package test;

import java.util.List;

import dao.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {

		// REALIZAMOS LAS RESPECTIVAS INSTANCIAS
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		
		/*
		 * // INSERTAMOS DATOS cliente.setNombre("piero");
		 * cliente.setApellido("caro jara"); cliente.setDni("23487623");
		 * cliente.setEmail("piero@gmail.com"); cliente.setTelf("987654321");
		 * cliente.setSexo("M"); cliente.setNacionalidad("peruano");
		 * 
		 * // INVOCAMOS EL METODO REGISTRAR crud.RegistrarCliente(cliente);
		 */
		
		// TESTEAMOS LISTADO
		List<TblCliente> listado = crud.ListarClientes();
		
		// APLICAMOS UN BUCLE
		for(TblCliente lis:listado) {
			// IMPRIMIMOS POR PANTALLA
			System.out.println("Codigo: " + lis.getIdcliente() + ", Nombre " + lis.getNombre() + ", Apellido: " + lis.getApellido() + ", Dni: " + lis.getDni());
		}

	}

}
