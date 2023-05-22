package ayudasexternas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import objetos.Cine;
import objetos.Pelicula;

public class Fusionador {

	public static Iterator<Cine> fusionarCinesYPelis(Iterator<Pelicula> peliculas, Iterator<Cine> cines){
		
		HashMap<String, Cine> listaDeCines = new HashMap<String, Cine>();
		ArrayList<Cine> cinesFinales = new ArrayList<Cine>();
		
		while(cines.hasNext()) {
			Cine cine = cines.next();
			listaDeCines.put(cine.getCodigo(), cine);
		}
		
		while(peliculas.hasNext()) {
			Pelicula pelicula = peliculas.next();
			for(String codigo: pelicula.getCines()) {
				if(listaDeCines.containsKey(codigo)) {
					listaDeCines.get(codigo).addPeliculas(pelicula);
				}
				
			}
		}
		cinesFinales.addAll(listaDeCines.values());
		
		return cinesFinales.iterator();
	}
}
