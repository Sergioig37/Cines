package go;

import java.util.Iterator;

import ayudasexternas.Fusionador;
import datos.ReadCines;
import datos.ReadPeliculas;
import datos.Write;
import objetos.Cine;
import objetos.Pelicula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fichero1 = "C:\\Users\\Mañana\\Documents\\Peliculas.txt";
		String fichero2 = "C:\\Users\\Mañana\\Documents\\Cines.txt";
		
		
		Iterator<Cine> cines = Fusionador.fusionarCinesYPelis(ReadPeliculas.readPelis(fichero1), ReadCines.readCines(fichero2));
		
		Write.rellenarArchivo(cines);
		
	}

}
