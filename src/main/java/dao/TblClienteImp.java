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

		// ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabri = Persistence.createEntityManagerFactory("ProyectoMavenLPII");
		
		// PERMITE GESTIONAR ENTIDADES
		EntityManager eman = fabri.createEntityManager();
		
		// INICIAR TRANSACCION
		eman.getTransaction().begin();
		
		// REGISTRAMOS
		eman.persist(cliente);
		
		// EMITIMOS MENSAJE POR PANTALLA
		System.out.println("cliente registrado en la base de datos");
		
		// CONFIRMAMOS
		eman.getTransaction().commit();
		
		// CERRAMOS LA TRANSACCION
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

		// ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabri = Persistence.createEntityManagerFactory("ProyectoMavenLPII");
		
		// GESTIONAMOS LAS ENTIDADES
		EntityManager em = fabri.createEntityManager();
		
		// INICIAMOS LA TRANSACCION
		em.getTransaction().begin();
		
		// RECUPERAMOS LA DATA DE LA BD
		List<TblCliente> listado = em.createQuery("select c from TblCliente c", TblCliente.class).getResultList();
		
		// CONFIRMAMOS LA TRANSACCION
		em.getTransaction().commit();
		
		// CERRAMOS
		em.close();
		
		// RETORNAMOS EL LISTADO
		return listado;
		
	}

}
