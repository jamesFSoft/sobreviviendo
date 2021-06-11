package application.clases;

public class Nocivo extends Alimento{
	
	private Integer dolor;

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
