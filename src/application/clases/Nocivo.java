package application.clases;
/**
    * Clase creada para el alimento Nocivo hereda de la Super class Alimento  
*/
public class Nocivo extends Alimento{
	
	/**
	 * Atributos principales de la clase
	 */
	private Integer dolor;

	/**
        * Constructor de la clase, recibe parametros propios y heredados 
    	*/
	public Nocivo(String nombre, Integer puntaje, Integer dolor) {
		super(nombre, puntaje);
		this.puntaje = puntaje + dolor;
		this.dolor = dolor;
	}

	public Integer getDolor() {
		return dolor;
	}

	public void setDolor(Integer dolor) {
		this.dolor = dolor;
	}

}
