package application.clases;

public class Probando {

	public static void main(String[] args) {
		
		Carne pescado = new Carne("Trucha", 25, true);
		Integer nuevoPuntaje = pescado.getPuntaje();
		Nocivo arena = new Nocivo("Arena", nuevoPuntaje - 10 , -10);

		System.out.println(arena.getPuntaje());

	}

}
