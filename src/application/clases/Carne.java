package application.clases;

public class Carne extends Alimento{

	private Boolean cocinado;

	public Carne(String nombre, Integer puntaje, Boolean cocinado) {
		super(nombre, puntaje);
		if (cocinado) {
			this.puntaje = puntaje + 10;
		} else {
			this.puntaje = puntaje - 10;
		}
		this.cocinado = cocinado;
	}

	public Boolean getCocinarse() {
		
		return cocinado;
	}

	public void setCocinarse(Boolean cocinado) {
		this.cocinado = cocinado;
	}

}
