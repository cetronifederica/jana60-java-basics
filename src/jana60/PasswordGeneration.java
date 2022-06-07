package jana60;

public class PasswordGeneration {

	public static void main(String[] args) {
		
		// live coding 
		
		String nome = "Federica"; 
		String cognome = "Cetroni";
		String colorePreferito = "nero"; 
		int giornoNascita = 3;
		int meseNascita = 3;
		int annoNascita = 1997; 
		int  sommaDataNascita = giornoNascita + meseNascita + annoNascita;
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita; 
		System.out.println(password);

	}

}
