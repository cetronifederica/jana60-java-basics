package jana60;
import java.util.Scanner;
public class PasswordGeneration2 {

	public static void main(String[] args) {
		// password generation
		
		String nome; 
		String cognome;
		String colorePreferito; 
		int giorno; 
		int mese; 
		int anno; 
		
		Scanner pass = new Scanner(System.in); 
		System.out.print("Inserisci Nome: "); 	
		nome = pass.nextLine();
		
		
		System.out.print("Inserisci Cognome: ");
		cognome = pass.nextLine();
		
		System.out.print("Inserisci colore preferito: ");
		colorePreferito = pass.nextLine();
		
		System.out.print("Inserisci giorno di nascita: ");
		giorno = pass.nextInt();
		
		System.out.print("Inserisci mese di nascita: ");
		mese = pass.nextInt();
		
		System.out.print("Inserisci anno di nascita: ");
		anno = pass.nextInt();
		
		
		int sommaDataNascita = giorno + mese + anno;
		
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita;
		
		System.out.println(password); 
		
pass.close();
	}

}
