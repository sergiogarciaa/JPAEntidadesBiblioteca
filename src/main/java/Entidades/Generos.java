package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gbp_generos", schema="gbp_operacional")
public class Generos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_genero", nullable=false)
	private long id_genero;
	
	@Column(name="nombre_genero")
	private String nombre_genero;
	
	@Column(name="descripcion_genero")
	private String descripcion_genero;

	public Generos() {
		super();
	}
	
	public Generos(String nombre_genero, String descripcion_genero) {
		this.nombre_genero = nombre_genero;
		this.descripcion_genero = descripcion_genero;
	}

}
