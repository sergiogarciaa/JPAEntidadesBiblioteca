package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="gbp_rel_autores_libros", schema="gbp_operacional")
public class Rel_Autores_Libros {
	
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_rel_autores_libros", nullable=false)
		private long id_rel_autores_libros;
		
		@ManyToOne
		@JoinColumn(name = "id_autor", nullable=false) // FK
		Autores autores;
		
		@ManyToOne
		@JoinColumn(name = "id_libro", nullable=false) // FK
		Libros libros;
}
