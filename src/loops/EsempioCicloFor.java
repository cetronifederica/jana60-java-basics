package loops;

public class EsempioCicloFor {

	public static void main(String[] args) {
		// stampare i primi 10 numeri naturali (da 1 a 10)
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// incrementare il contatore di 2
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Iterazione: " + i);
			int numero = i + 1;
			System.out.println(" - numero" + numero);
		}
		
		// stampare i numeri da 10 a 1 
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		// stampiamo a video la somma dei primi 10 numeri naturali
		int somma = 0;
		for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				somma = somma + i;
		}
		/* se metti il print all'interno del for ti fa vedere tutte le 
		 * somme una per una 
		 */
		System.out.println("Somma: " + somma);
	}

}
