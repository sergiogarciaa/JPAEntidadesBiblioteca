package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gbp_colecciones", schema="gbp_operacional")
public class Colecciones {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coleccion", nullable=false)
	private long id_coleccion;

	@Column(name="nombre_coleccion")
	private String nombre_coleccion;
	
	public Colecciones() {
		super();
	}
	
	public Colecciones(String nombre_coleccion) {
		this.nombre_coleccion = nombre_coleccion;
	}
	
}
