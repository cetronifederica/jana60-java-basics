package EsercizioArray;

import java.util.Random;
import java.util.Scanner;

public class EsercizioLiveCoding {

	public static void main(String[] args) {
		/* generiamo un array di 10 numeri casuali, compresi tra 1 e 100
		 * chiediamo all'utente di dirci un numero, compreso tra 1 e 100
		 * e verifichiamo se il numero è presente nell'array oppure no
		 */
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		// creo array di 10 numeri 
		int[] numeri = new int[10];
		
		//assegno il valore alle posizioni dell'array
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = random.nextInt(100) + 1; // random compreso tra 1 e 100
		}
		
		
		// chiedo all'utente un numero da 1 a 100
		int sceltaUtente;
		do { 
			System.out.println("Dimmi un numero tra 1 e 100: ");
			sceltaUtente = scan.nextInt();
		} while (sceltaUtente < 1 || sceltaUtente > 100); 
		
		// verifico se la scelta utente è presente nell'array 
		
		boolean win = false; 
		int counter = 0;
		while (win == false && counter < numeri.length) {
			if (numeri[counter] == sceltaUtente) {
				win = true;
			} else {
				counter++;
			}
		}
		
		if (win) {
			System.out.println("Hai vinto");
		} else {
			System.out.println("Hai perso");
		}
	}

}
