package Controladores;

import Servicios.ImplementacionPersistencia;
import Servicios.InterfazPersistencia;

public class Inicio {

	public static void main(String[] args) {
		InterfazPersistencia impPer = new ImplementacionPersistencia();

		impPer.crearAccesos();
	}

}
