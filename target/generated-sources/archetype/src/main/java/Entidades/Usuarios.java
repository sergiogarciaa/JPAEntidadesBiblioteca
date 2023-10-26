package Entidades;

import java.util.Calendar;

import jakarta.persistence.*;

@Entity
@Table(name = "gbp_usuarios", schema="gbp_operacional")
public class Usuarios {
	 //Atributos
	
	@Id
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

    
    //Constructores
    public Usuarios() {
		super();
	}
    public Usuarios(long idUsuario, String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario, String emailUsuario, String claveUsuario, Acceso acceso, Boolean estaBloqueadoUsuario, Calendar fchFinBloqueoUsuario, Calendar fchAltaUsuario, Calendar fchBajaUsuario) {
        super();
        this.id_usuario = idUsuario;
        this.dni_usuario = dniUsuario;

        this.nombre_usuario = nombreUsuario;
        this.apellidos_usuario = apellidosUsuario;
        this.tlf_usuario = tlfUsuario;
        this.email_usuario = emailUsuario;
        this.clave_usuario = claveUsuario;
        this.acceso = acceso;
        this.estaBloqueado_usuario = estaBloqueadoUsuario;
        this.fch_fin_bloqueo_usuario = fchFinBloqueoUsuario;
        this.fch_alta_usuario = fchAltaUsuario;
        this.fch_baja_usuario = fchBajaUsuario;
    }
}
