package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gbp_editoriales", schema="gbp_operacional")
public class Editoriales {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_editorial", nullable=false)
	private long id_editorial;
	
	@Column(name="nombre_editorial")
	private String nombre_editorial;
	
	public Editoriales() {
		super();
	}
	
	public Editoriales(String nombre_editorial) {
		super();
		this.nombre_editorial = nombre_editorial;
	}
	
}
