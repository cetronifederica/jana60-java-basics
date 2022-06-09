package loops;

import java.util.Scanner;

public class CicloWhileEsercizio {

	public static void main(String[] args) {
		// menu
		/* fino a che l'utente non mi da 
		 * il numero corretto io non fermo il ciclo
		 */
		/*chiedi all'utente un numero compreso 
		 * tra 1 e 100
		 */
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuaAChiedere = true; //inizialmente deve per forza valere qualcosa
		
		while (continuaAChiedere) {
			System.out.println("Dimmi un numero tra 1 e 100: ");
			int numero = scan.nextInt(); /*la variabile dichiarate dentro al ciclo 
			*vive e muore qui dentro, fuori dal ciclo non posso prenderla
			*se dichiaro all'esterno la posso richiamare anche fuori */
			
			if (numero > 0 && numero <= 100) {
				continuaAChiedere = false; 
			} else {
				System.out.println("Hai inserito un numero errato");
			}
		}
scan.close();
	}

}
