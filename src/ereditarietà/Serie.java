package ereditarietà;

public class Serie extends Contenuto {

	/*
	 * codice del costruttore implicito public Serie() { super(); }
	 */
	private int numeroDiEpisodi;

	public Serie(String titolo, int numeriDiEpisodi) {
		super(titolo);
		this.numeroDiEpisodi = numeroDiEpisodi;
	}
}
