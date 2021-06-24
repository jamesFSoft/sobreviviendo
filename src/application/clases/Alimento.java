package application.clases;

public class Alimento {

	/**
	 * Atributos principales de la clase
	 */

	protected String nombre;
	protected Integer puntaje;

	/**
	 * @param nombre
	 * @param puntaje
	 * constructor que recibe los parametros de nombre y puntaje
	 */

	public Alimento(String nombre, Integer puntaje) {
		super();
		this.nombre = nombre;
		this.puntaje = puntaje;
	}

	/**
	 * @return el atributo del nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 * resibe el valor para ser asignado al nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el atributo del puntaje
	 */
	public Integer getPuntaje() {
		return puntaje;
	}

	/**
	 * @param puntaje
	 * resibe el valor para ser asignado al puntaje
	 */

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

}
