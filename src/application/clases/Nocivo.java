package application.clases;
/**
    * Clase creada para el alimento Nocivo hereda de la Super class Alimento
*/
public class Nocivo extends Alimento{

	/**
	 * Atributo principal de la clase
	 */
	private Integer dolor;

	/**
	 *
	 * @param nombre
	 * @param puntaje
	 * @param dolor
     * Constructor de la clase, recibe parametros propios y heredados
	 */
	public Nocivo(String nombre, Integer puntaje, Integer dolor) {
		super(nombre, puntaje);
		this.puntaje = puntaje + dolor;
		this.dolor = dolor;
	}

	/**
	 * @return el atributo de dolor
	 */
	public Integer getDolor() {
		return dolor;
	}

	/**
	 * @param dolor
	 *  resibe el valor para ser asignado al atributo dolos
	 */
	public void setDolor(Integer dolor) {
		this.dolor = dolor;
	}

}
