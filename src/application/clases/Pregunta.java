package application.clases;

public class Pregunta {
	/**
	 * Atributo principal de la clase
	 */
	private char opcion;
	private char respuesta;

	/**
	 * @return el atributo opcion
	 */

	public char getOpcion() {
		return opcion;
	}

	/**
	 * @param opcion
	 * resibe el valor para ser asignado al atributo opcion
	 */
	public void setOpcion(char opcion) {
		this.opcion = opcion;
	}

	public char getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(char respuesta) {
		this.respuesta = respuesta;
	}

}
