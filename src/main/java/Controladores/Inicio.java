package Controladores;

import Entidades.Acceso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Inicio {

	public static void main(String[] args) {
		/**
		 *  Crear una factoría de entidades, que se utiliza para administrar entidades y conexiones a la base de datos.
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

		// Crear un objeto EntityManager a partir de la factoría de entidades. El EntityManager se utiliza para interactuar con las entidades y la base de datos.
		EntityManager em = emf.createEntityManager();

		// Iniciar una transacción. Las operaciones dentro de esta transacción se agruparán y se confirmarán juntas o se revertirán en caso de un error.
		em.getTransaction().begin();

		// Crear dos objetos de entidad "Acceso" y proporcionarles valores.
		Acceso acceso = new Acceso("Usu", "Acceso usuarios biblioteca");
		Acceso acceso2 = new Acceso("Emp", "Empleados biblioteca");

		// Persistir (guardar) los objetos de entidad en la base de datos. Esto los agrega a la unidad de persistencia.
		em.persist(acceso);
		em.persist(acceso2);

		// Confirmar la transacción. En este punto, los cambios se aplican a la base de datos.
		em.getTransaction().commit();

		// Cerrar el EntityManager. Esto libera los recursos y finaliza la conexión con la base de datos.
		em.close();

	}

}
