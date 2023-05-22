package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.PeliculaCreator;
import objetos.Cine;
import objetos.Pelicula;

public class ReadPeliculas {

	public static Iterator<Pelicula> readPelis(String fichero){
		
		BufferedReader ficheroEntrada;
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			String titulo = ficheroEntrada.readLine();
			
			while(titulo!=null) {
				
				String director = ficheroEntrada.readLine();
				
				String anio = ficheroEntrada.readLine();
				
				String codigos = ficheroEntrada.readLine();
				
				peliculas.add(PeliculaCreator.crearPelicula(titulo, director, anio, codigos));
				
				titulo = ficheroEntrada.readLine();
				
			}
		}
		catch(Exception e){
			System.out.println("No se pudo leer el fichero");
			e.printStackTrace();
		}
		return peliculas.iterator();
	}
}
