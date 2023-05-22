package objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class Cine {

	private String codigo;
	private String nombreCine;
	private int numeroSalas;
	private String localidad;
	private ArrayList<Pelicula> peliculas;
	
	
	public Cine(String codigo, String nombreCine, int numeroSalas, String localidad ) {
		
		this.codigo = codigo;
		this.nombreCine = nombreCine;
		this.numeroSalas = numeroSalas;
		this.localidad = localidad;
		peliculas = new ArrayList<Pelicula>();
	}

	
	public void addPeliculas(Pelicula pelicula) {
		
		peliculas.add(pelicula);
		
	}
	
	@Override
	public String toString() {
		return "Cine [" +  " " + nombreCine + ", Localidad: " + localidad + ", Peliculas: " +peliculas + "]" +"\n";
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombreCine() {
		return nombreCine;
	}


	public void setNombreCine(String nombreCine) {
		this.nombreCine = nombreCine;
	}


	public int getNumeroSalas() {
		return numeroSalas;
	}


	public void setNumeroSalas(int numeroSalas) {
		this.numeroSalas = numeroSalas;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
}
