package Entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="gbp_autores", schema="gbp_operacional")
public class Autores {
	//ATRIBUTOS
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="id_autores", nullable=false)
			private long id_autores;
			
			@Column(name="nombre_autor")
			private String nombre_autor;
			
			@Column(name="apellidos_autor")
			private String apellidos_autor;
			
			@OneToMany(mappedBy="autores")
		    List<Rel_Autores_Libros> autoresConLibro;
		    
		    
		  //CONSTRUCTORES

		    public Autores() {
				super();
			}
			public Autores(String nombre_autor, String apellidos_autor) {
				super();
				this.nombre_autor = nombre_autor;
				this.apellidos_autor = apellidos_autor;
			}	
}
