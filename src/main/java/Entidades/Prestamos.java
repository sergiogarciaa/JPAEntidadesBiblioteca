package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="gbp_prestamos", schema="gbp_operacional")
public class Prestamos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prestamo", nullable=false)
	private long id_prestamo;
	
	@ManyToMany(mappedBy = "prestamos") // NM con Libros
    public List<Libros> libros = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "id_usuario") // FK
	Usuarios usuarios;
	
	@Column(name = "fch_inicio_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_inicio_prestamo;
	
	@Column(name = "fch_fin_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_fin_prestamo;

	@Column(name = "fch_entrega_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_entrega_prestamo;
	
	@ManyToOne
	@JoinColumn(name = "id_estado_prestamo") // FK
	EstadoPrestamos estadosPrestamos;


	public Prestamos() {
		super();
	}
	
	public Prestamos(long id_prestamo, List<Libros> libros, Usuarios usuarios, Calendar fch_inicio_prestamo,
			Calendar fch_fin_prestamo, Calendar fch_entrega_prestamo, EstadoPrestamos estadosPrestamos) {
		this.id_prestamo = id_prestamo;
		this.libros = libros;
		this.usuarios = usuarios;
		this.fch_inicio_prestamo = fch_inicio_prestamo;
		this.fch_fin_prestamo = fch_fin_prestamo;
		this.fch_entrega_prestamo = fch_entrega_prestamo;
		this.estadosPrestamos = estadosPrestamos;
	}
}
