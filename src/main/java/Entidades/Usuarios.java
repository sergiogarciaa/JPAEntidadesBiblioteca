package Entidades;

import java.util.Calendar;

public class Usuarios {
	 //Atributos

    private long id_usuario;
    private String dni_usuario;
    private String nombre_usuario;
    private String apellidos_usuario;
    private String tlf_usuario;
    private String email_usuario;
    private String clave_usuario;
    private int id_acceso;
    private Boolean estaBloqueado_usuario;
    private Calendar fch_fin_bloqueo_usuario;
    private Calendar fch_alta_usuario;
    private Calendar fch_baja_usuario;


    //Constructores
    public Usuarios(long idUsuario, String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario, String emailUsuario, String claveUsuario, int idAcceso, Boolean estaBloqueadoUsuario, Calendar fchFinBloqueoUsuario, Calendar fchAltaUsuario, Calendar fchBajaUsuario) {
        super();
        id_usuario = idUsuario;
        dni_usuario = dniUsuario;

        nombre_usuario = nombreUsuario;
        apellidos_usuario = apellidosUsuario;
        tlf_usuario = tlfUsuario;
        email_usuario = emailUsuario;
        clave_usuario = claveUsuario;
        id_acceso = idAcceso;
        estaBloqueado_usuario = estaBloqueadoUsuario;
        fch_fin_bloqueo_usuario = fchFinBloqueoUsuario;
        fch_alta_usuario = fchAltaUsuario;
        fch_baja_usuario = fchBajaUsuario;
    }
    public Usuarios() {
        super();
    }
}
