package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ICliente;
import model.TblCliente;

public class TblClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {

		// establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri = Persistence.createEntityManagerFactory("ProyectoMavenLPII");
		// permite gestionar entidades..
		EntityManager eman = fabri.createEntityManager();
		// iniciar transaccion...
		eman.getTransaction().begin();
		// registramos
		eman.persist(cliente);
		// emitimos mensaje por pantalla
		System.out.println("cliente registrado en la base de datos");
		// confirmamos
		eman.getTransaction().commit();
		// cerramos la transaccion...
		eman.close();
		
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblCliente> ListarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
