package ereditarietà;

public class Contenuto {

	// attributo
	private String titolo;

	// costruttore
	public Contenuto(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void riproduci() {
		System.out.println("Stai guardando: " + titolo);
	}

}
