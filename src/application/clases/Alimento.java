package application.clases;

public class Alimento {

	protected String nombre;
	
	protected Integer puntaje;
	
	public Alimento(String nombre, Integer puntaje) {
		super();
		this.nombre = nombre;
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	
}
