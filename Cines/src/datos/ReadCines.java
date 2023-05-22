package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.CineCreator;
import ayudasexternas.PeliculaCreator;
import objetos.Cine;
import objetos.Pelicula;

public class ReadCines {

public static Iterator<Cine> readCines(String fichero){
		
		BufferedReader ficheroEntrada;
		ArrayList<Cine> cines = new ArrayList<Cine>();
		
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(fichero));
			
			String codigo = ficheroEntrada.readLine();
			
			while(codigo!=null) {
				
				String nombre = ficheroEntrada.readLine();
				
				String numeroSalas = ficheroEntrada.readLine();
				
				String localidad = ficheroEntrada.readLine();
				
				cines.add(CineCreator.crearCine(codigo, nombre, numeroSalas, localidad));
				
				codigo = ficheroEntrada.readLine();
				
			}
		}
		catch(Exception e){
			System.out.println("No se pudo leer el fichero");
			e.printStackTrace();
		}
		return cines.iterator();
	}
}

