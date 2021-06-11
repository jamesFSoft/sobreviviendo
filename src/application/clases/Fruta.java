package application.clases;

public class Fruta extends Alimento{
	
	private Boolean vitamina;

	public Fruta(String nombre, Integer puntaje, Boolean vitamina) {
		super(nombre, puntaje);
		this.vitamina = vitamina;
	}

	public Boolean getVitamina() {
		return vitamina;
	}

	public void setVitamina(Boolean vitamina) {
		this.vitamina = vitamina;
	}
	
}
