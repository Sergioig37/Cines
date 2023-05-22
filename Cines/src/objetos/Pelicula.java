package objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class Pelicula {

	private String titulo;
	private String director;
	private int anio;
	private ArrayList<String> listaCines;
	
	
	public Pelicula(String titulo, String director, int anio, ArrayList<String >cines ) {
		
		this.titulo = titulo;
		this.director = director;
		this.anio = anio;
		this.listaCines = cines;
		}

	
	@Override
	public String toString() {
		return "[" + titulo  + "]";
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public ArrayList<String> getCines() {
		return listaCines;
	}


	public void setCines(ArrayList<String> cines) {
		this.listaCines = cines;
	}

	
	
}
