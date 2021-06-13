package application.clases;

public class Carne extends Alimento{
	/**
	 * Atributo principal de la clase
	 */
	private Boolean cocinado;

	/**
	 * @param nombre
	 * @param puntaje
	 * @param cocinado
	 * constructor que recibe los parametros de nombre, puntaje y cocinado
	 */

	public Carne(String nombre, Integer puntaje, Boolean cocinado) {
		super(nombre, puntaje);
		if (cocinado) {
			this.puntaje = puntaje + 10;
		} else {
			this.puntaje = puntaje - 10;
		}
		this.cocinado = cocinado;
	}

	/**
	 * @return el atributo de cocinado
	 */

	public Boolean getCocinarse() {

		return cocinado;
	}

	/**
	 * @param cocinado
	 * resibe el valor para ser asignado al atributo cocinado
	 */

	public void setCocinarse(Boolean cocinado) {
		this.cocinado = cocinado;
	}

}
