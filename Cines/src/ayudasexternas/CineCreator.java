package ayudasexternas;

import objetos.Cine;

public class CineCreator {

	public static Cine crearCine(String codigo, String nombre, String numeroSalas, String localidad) {
		
		Cine cine = new Cine( codigo,  nombre, Integer.parseInt(numeroSalas), localidad);
		
		return cine;
	}
}
