package Entidades;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="gbp_acceso", schema="gbp_operacional")
public class Acceso {
	
	//ATRIBUTOS
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id_acceso", nullable=false)
		private long id_acceso;
		
		@Column(name="codigo_acceso", nullable=false)
		private String codigo_acceso;
		
		@Column(name="descripcion_acceso")
		private String descripcion_acceso;
		
	    @OneToMany(mappedBy="acceso")
	    List<Usuarios> usuariosConAcceso;
	    
	    
	  //CONSTRUCTORES

	    public Acceso() {
			super();
		}
		public Acceso(String codigo_acceso, String descripcion_acceso) {
			super();
			this.codigo_acceso = codigo_acceso;
			this.descripcion_acceso = descripcion_acceso;
		}	
}
