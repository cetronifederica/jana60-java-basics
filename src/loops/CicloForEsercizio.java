package loops;
import java.util.Scanner;
public class CicloForEsercizio {

	public static void main(String[] args) {
		// stampiamo a video la somma dei primi x numeri naturali
		// dove x ce lo dice l'utente
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci fino a quale numero (massimo 100): ");
		int numeri = scan.nextInt();
		
		if (numeri <= 100 && numeri > 0) {
			
			int somma = 0;
			for (int i = 1; i <= numeri; i++) {
				System.out.println(i);
				somma = somma + i;

			} 
			System.out.println("La somma dei numeri: " + numeri + " numeri è: " + somma);
			} else {
				System.out.println("Numero non valido");
			}
		scan.close();
	
	}

	}

