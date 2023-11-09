package Servicios;

import java.util.Scanner;

import Entidades.Acceso;
import Entidades.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ImplementacionPersistencia implements InterfazPersistencia {
	/**
	 *  Crear acceso y persistencia.
	 */
	@Override
	public void crearAccesos() {
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

	
	public void crearUsuarios() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		    EntityManager em = emf.createEntityManager();
		    Scanner sc = new Scanner(System.in);

		    em.getTransaction().begin();

		    Usuarios usuario = new Usuarios();
		    System.out.println("¿Es usuario o empleado? (1 para usuario, 2 para empleado)");
		    int usuEmp = sc.nextInt();
		    sc.nextLine(); // Consumir la nueva línea después de leer el entero
		    System.out.println("Introduzca su DNI");
		    String dni = sc.nextLine(); // Usar nextLine para leer líneas completas
		    System.out.println("Introduzca su nombre");
		    String nombre = sc.nextLine();
		    System.out.println("Introduzca su apellido");
		    String apellido = sc.nextLine();
		    System.out.println("Introduzca su teléfono");
		    String telefono = sc.nextLine();
		    System.out.println("Introduzca su email");
		    String email = sc.nextLine();
		    System.out.println("Introduzca su clave");
		    String clave = sc.nextLine();

		    // Verificar si el usuario es un empleado y asignarle el acceso correspondiente.
		    Acceso acceso = null;
		    if (usuEmp == 2) {
		        acceso = em.find(Acceso.class, 2L); // Cambiar a buscar por ID (clave primaria) de tipo Long
		    } else if (usuEmp == 1) {
		        acceso = em.find(Acceso.class, 1L); // Cambiar a buscar por ID (clave primaria) de tipo Long
		    }

		    if (acceso != null) {
		        usuario.setAcceso(acceso);
		        usuario.setDni_usuario(dni);
		        usuario.setNombre_usuario(nombre);
		        usuario.setApellidos_usuario(apellido);
		        usuario.setTlf_usuario(telefono);
		        usuario.setEmail_usuario(email);
		        usuario.setClave_usuario(clave);

		        em.persist(usuario);
		        em.getTransaction().commit();
		        em.close();
		    } else {
		        System.out.println("No existe ese acceso.");
		        em.getTransaction().rollback(); // Revertir la transacción en caso de error
		        em.close();
		    }
	}	
}
