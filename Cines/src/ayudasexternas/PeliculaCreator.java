package ayudasexternas;

import java.util.ArrayList;

import objetos.Pelicula;

public class PeliculaCreator {

	public static Pelicula crearPelicula(String titulo, String director, String anio, String cines) {
		
		ArrayList<String> listaCines = new ArrayList<String>();
		String[ ] resultado = cines.split("\\*");
		
		if(cines.contains("*")){	
			for(int i=0; i<resultado.length;i++) {
			listaCines.add(resultado[i]);
			}
		}
		else {
			listaCines.add(cines);
		}
		
		Pelicula pelicula = new Pelicula(titulo, director, Integer.parseInt(anio), listaCines);
		
		return pelicula;
		
	}

	
}
