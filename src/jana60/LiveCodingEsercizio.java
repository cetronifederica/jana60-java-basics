package jana60;
import java.util.Scanner;
public class LiveCodingEsercizio {

	public static void main(String[] args) {
		// live coding
		// chiedere all'utente gli anni di due persone e comunicare quale delle due è più grande
		
		int agePerson1; 
		int agePerson2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci età persona 1: ");
		agePerson1 = scan.nextInt();
		
		System.out.print("Inserisci età persona 2: ");
		agePerson2 = scan.nextInt();
		
		System.out.println("Età persona 1: " + agePerson1);
		System.out.println("Età persona 2: " + agePerson2);
		if (agePerson1 >= 0 && agePerson2 >= 0) {
			// persona 1 più grande
			if(agePerson1 > agePerson2) {
				System.out.println("Persona 1 è più grande");
				} else if(agePerson1 == agePerson2) {
					System.out.println("Persona 1 e Persona 2 hanno la stessa età");
				} else {
					System.out.println("Persona 2 è più grande di Persona 1");
				}
		} else {
			System.out.println("Il valore dell'età non può essere negativo");
		}
		
		/* casi di test 
		 * 1 caso: perona1 25 anni, persona2 30 anni - risposta giusta
		 * 2 caso: persona1 30 anni, persona2 25 anni - risposta giusta
		 * 3 caso: persona2 30 anni, persona2 30 anni - risposta giusta
		 */
		
		
		scan.close();

	}

}
