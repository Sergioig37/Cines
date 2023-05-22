package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import objetos.Cine;


public class Write {

private final static String FICHERO = "C:\\Users\\Mañana\\Documents\\Final.txt";
	
	public static void rellenarArchivo(Iterator<Cine> cines) {
	
		BufferedWriter ficheroSalida;
		ArrayList<Cine> cinesFinales = new ArrayList<Cine>();
		
		try {
			ficheroSalida = new BufferedWriter(new FileWriter(FICHERO));
				
				while(cines.hasNext()) {
					cinesFinales.add(cines.next());
				}
				
				ficheroSalida.write(cinesFinales.toString()+"\n");
				
			ficheroSalida.close();
		}
		catch(Exception e) {
			System.out.println("No se pudo escribir nada");
			e.printStackTrace();
		}
	}
}

