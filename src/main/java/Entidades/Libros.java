package Entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gbp_libros", schema="gbp_operacional")
public class Libros {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro", unique=true, nullable=false)
    private long id_libro;
	
	@Column(name = "isbn_libro")
    private String isbn_libro;
	
	@Column(name = "titulo_libro")
    private String titulo_libro;
	
	@Column(name = "edicion_libro")
    private String edicion_libro;
	
	@ManyToOne
	@JoinColumn(name = "id_editorial") // FK
	Editoriales editoriales;
	
	@ManyToOne
	@JoinColumn(name = "id_genero") // FK
	Generos generos;
	
	@ManyToOne
	@JoinColumn(name = "id_coleccion") // FK
	Colecciones colecciones;
	
	@OneToMany(mappedBy="libros") 
	List<Rel_Autores_Libros> libroLibros;
	
	@Column(name = "cantidad_libro")
    private Integer cantidad_libro;
	
	@ManyToMany
    @JoinTable(name = "libros_prestamos", schema = "gbp_operacional",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_prestamo")
    )
    private List<Prestamos> prestamos = new ArrayList<>();


	public Libros() {
		super();
	}


	public Libros(long id_libro, String isbn_libro, String titulo_libro, String edicion_libro, Editoriales editoriales,
			Generos generos, Colecciones colecciones, List<Rel_Autores_Libros> libroLibros, Integer cantidad_libro,
			List<Prestamos> prestamos) {
		super();
		this.id_libro = id_libro;
		this.isbn_libro = isbn_libro;
		this.titulo_libro = titulo_libro;
		this.edicion_libro = edicion_libro;
		this.editoriales = editoriales;
		this.generos = generos;
		this.colecciones = colecciones;
		this.libroLibros = libroLibros;
		this.cantidad_libro = cantidad_libro;
		this.prestamos = prestamos;
	}


}
