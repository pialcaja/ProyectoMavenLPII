package test;

import dao.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {

		// realizamos las respectiva instancias..
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		// insertamos datos
		cliente.setNombre("piero");
		cliente.setApellido("caro jara");
		cliente.setDni("23487623");
		cliente.setEmail("piero@gmail.com");
		cliente.setTelf("987654321");
		cliente.setSexo("M");
		cliente.setNacionalidad("peruano");
		// invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);

	}

}
