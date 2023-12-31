package Entidades;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "gbp_usuarios", schema="gbp_operacional")
public class Usuarios {
	 //Atributos
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", unique=true, nullable=false)
    private long id_usuario;
	
	@Column(name = "dni_usuario", nullable = false)
    private String dni_usuario;
	
	@Column(name = "nombre_usuario")
    private String nombre_usuario;
	
	@Column(name = "apellidos_usuario")
    private String apellidos_usuario;
	
	@Column(name = "tlf_usuario")
    private String tlf_usuario;
	
	@Column(name = "email_usuario")
    private String email_usuario;
	
	@Column(name = "clave_usuario")
    private String clave_usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_acceso") // FK
	Acceso acceso;

	@Column(name = "estaBloqueado_usuario")
    private Boolean estaBloqueado_usuario;
    
    @Column(name = "fch_fin_bloqueo_usuario")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_fin_bloqueo_usuario;
    
    @Column(name = "fch_alta_usuario")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_alta_usuario;
    
    @Column(name = "fch_baja_usuario")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_baja_usuario;
    
    @OneToMany(mappedBy="usuarios") 
    List<Prestamos> usuariosConPrestamos;

    
    //Constructores
    public Usuarios() {
		super();
	}


	public Usuarios(long id_usuario, String dni_usuario, String nombre_usuario, String apellidos_usuario,
			String tlf_usuario, String email_usuario, String clave_usuario, Acceso acceso,
			Boolean estaBloqueado_usuario, Calendar fch_fin_bloqueo_usuario, Calendar fch_alta_usuario,
			Calendar fch_baja_usuario, List<Prestamos> usuariosConPrestamos) {
		super();
		this.dni_usuario = dni_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.tlf_usuario = tlf_usuario;
		this.email_usuario = email_usuario;
		this.clave_usuario = clave_usuario;
		this.acceso = acceso;
		this.estaBloqueado_usuario = estaBloqueado_usuario;
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
		this.fch_alta_usuario = fch_alta_usuario;
		this.fch_baja_usuario = fch_baja_usuario;
		this.usuariosConPrestamos = usuariosConPrestamos;
	}
	// GETTER Y SETTER
	public String getDni_usuario() {
		return dni_usuario;
	}


	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}


	public String getNombre_usuario() {
		return nombre_usuario;
	}


	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}


	public String getApellidos_usuario() {
		return apellidos_usuario;
	}


	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}


	public String getTlf_usuario() {
		return tlf_usuario;
	}


	public void setTlf_usuario(String tlf_usuario) {
		this.tlf_usuario = tlf_usuario;
	}


	public String getEmail_usuario() {
		return email_usuario;
	}


	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}


	public String getClave_usuario() {
		return clave_usuario;
	}


	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}

	public Acceso getAcceso() {
		return acceso;
	}


	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}

}
