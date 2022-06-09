package loops;

public class EsercizioInLiveCoding {

	public static void main(String[] args) {
		/*Esercizio ciclo for in live coding
		 * per i primi 100 numeri naturali
		 * stampare a video solo i numeri pari
		 * e somma i numeri dispari
		 */

		// primo modo + breve per stampare solo numeri pari
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);
		}
		
		// secondo modo anche questo giusto per stampare solo pari 
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// pari + somma dei dispari
		
		int sommaDispari = 0; 
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				sommaDispari += i;	
				System.out.println("Somma dispari: " + sommaDispari);
			}
		}
		
		// altro modo per i dispari
		int somma = 0;
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);
			if (i < 100) {
				int j = i + 1;
				somma += j;
			} 
		}
		System.out.println("Somma Dispari: " + somma);
		
	}
	
	
	

}
