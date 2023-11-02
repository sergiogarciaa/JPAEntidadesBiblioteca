package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gbp_estadoPrestamos", schema="gbp_operacional")
public class EstadoPrestamos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estado_prestamo", nullable=false)
	private long id_estado_prestamo;
	
	@Column(name = "codigo_estado_prestamo")
    private String codigo_estado_prestamo;
	
	@Column(name = "descripcion_estado_prestamo")
    private String descripcion_estado_prestamo;

	public EstadoPrestamos() {
		super();
	}

	public EstadoPrestamos(long id_estado_prestamo, String codigo_estado_prestamo, String descripcion_estado_prestamo) {
		this.id_estado_prestamo = id_estado_prestamo;
		this.codigo_estado_prestamo = codigo_estado_prestamo;
		this.descripcion_estado_prestamo = descripcion_estado_prestamo;
	}
}
