package ereditarietà;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contenuto cont = new Contenuto("BatMan");
		cont.riproduci();

		Film avengers = new Film("Avengers");
		avengers.setDurata(150L);
		avengers.riproduci();
	}

	Serie streghe = new Serie("Streghe", 10);

}
