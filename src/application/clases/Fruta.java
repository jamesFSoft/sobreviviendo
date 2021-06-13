package application.clases;

public class Fruta extends Alimento{
	/**
	 * Atributos principales de la clase
	 */
	private Boolean vitamina;

	/**
	 *
	 * @param nombre
	 * @param puntaje
	 * @param vitamina
	 * constructor que recibe los parametros de nombre, puntaje y vitamina
	 */

	public Fruta(String nombre, Integer puntaje, Boolean vitamina) {
		super(nombre, puntaje);
		this.vitamina = vitamina;
	}

	/**
	 *
	 * @return el atributo de vitamina
	 */

	public Boolean getVitamina() {
		return vitamina;
	}

	/**
	 * @param vitamina
	 * resibe el valor para ser asignado al atributo vitamina
	 */

	public void setVitamina(Boolean vitamina) {
		this.vitamina = vitamina;
	}

}
