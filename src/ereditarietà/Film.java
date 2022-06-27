package ereditarietà;

public class Film extends Contenuto {

	// attributi
	private long durata;

	// costruttore
	/*
	 * quando lasciamo che sia l'ide a definire il costruttore lo crea richiamando
	 * il costruttore della super classe
	 */
	public Film(String titolo) { // qui prende il parametro titolo
		super(titolo); // la parola super richiama la super classe
	}

	public Film(String titolo, long durata) {
		super(titolo);
		this.durata = durata;
	}

	// metodi getter and setter

	public long getDurata() {
		return durata;
	}

	public void setDurata(long durata) {
		this.durata = durata;
	}

	// override

	@Override
	public void riproduci() {
		super.riproduci();
		System.out.println("Della durata di: " + durata + " " + "minuti");
	}
}
